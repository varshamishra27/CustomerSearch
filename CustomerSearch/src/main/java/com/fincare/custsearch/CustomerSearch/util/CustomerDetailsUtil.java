package com.fincare.custsearch.CustomerSearch.util;

import com.fincare.custsearch.CustomerSearch.dao.CustomerDao;
import com.fincare.custsearch.CustomerSearch.service.CustomerDetailService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


public class CustomerDetailsUtil {


    //private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(CustomerDetailsUtil.class);
    public boolean isValidPanNumber(String panNumber)
    {
        CustomerDao customerDao = new CustomerDao();
        boolean validPanCard = customerDao.fetchPanCard(panNumber);
        if(validPanCard)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean validatedPan(String panNumber)
    {
        if(panNumber.length()==10) {
            isValidPanNumber(panNumber);
            return true;
        } else {
            //LOGGER.info("Please input valid PAN Number");
            return false;
        }
    }
}
