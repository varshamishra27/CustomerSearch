package com.fincare.custsearch.CustomerSearch.service;

import com.fincare.custsearch.CustomerSearch.entity.CustResp;
import com.fincare.custsearch.CustomerSearch.entity.Customer;
import com.fincare.custsearch.CustomerSearch.model.CustDetailsResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.persistence.EntityManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class CustomerDetailService {
 @Autowired
 private JdbcTemplate jdbcTemplate;

    @Autowired
    private EntityManager entityManager;

    public CustDetailsResp getPanCard(String panCard) throws IOException, SAXException, ParserConfigurationException {

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> request = new HttpEntity<>(prepareHeaders());
        String result = restTemplate.postForObject("https://fisesb.fincarebank.com/bankservices/process", request, String.class);
        InputStream resultStream = new ByteArrayInputStream(result.getBytes(StandardCharsets.UTF_8));

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(resultStream);

        doc.getDocumentElement().normalize();

        //ToDo : parse xml and map to CustDetailsResp and persist response into DB

        return new CustDetailsResp();
    }

    private HttpEntity<String> prepareHeaders(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("panCard","ATGPK9128D");
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> httpRequest = new HttpEntity<>(httpHeaders);
        return httpRequest;
    }

}
