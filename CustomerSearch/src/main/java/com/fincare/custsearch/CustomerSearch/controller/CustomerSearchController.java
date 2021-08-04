package com.fincare.custsearch.CustomerSearch.controller;

import com.fincare.custsearch.CustomerSearch.model.CustDetailsResp;
import com.fincare.custsearch.CustomerSearch.service.CustomerDetailService;
import com.fincare.custsearch.CustomerSearch.util.CustomerDetailsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

@RestController
public class CustomerSearchController {

    @Autowired
    private CustomerDetailService customerDetailService;

    @GetMapping("/getCustDetailsByPan")
    public Object getCustomerDetails(@RequestBody String panNumber) throws ParserConfigurationException, SAXException, IOException {
       CustDetailsResp custDetailsResp = new CustDetailsResp();
       CustomerDetailsUtil customerDetailsUtil = new CustomerDetailsUtil();
       boolean isPanValid = customerDetailsUtil.validatedPan(panNumber);
       if(isPanValid) {
           custDetailsResp = customerDetailService.getPanCard(panNumber);
       }
       return custDetailsResp;

   }
}
