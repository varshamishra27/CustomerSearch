package com.fincare.custsearch.CustomerSearch.dao;

import com.fincare.custsearch.CustomerSearch.entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class CustomerDao {

    @PersistenceContext
    private EntityManager entityManager;

    public boolean fetchPanCard(String panCard){

       List<Customer> customers = entityManager.createQuery("SELECT panCard FROM customer cust WHERE cust.panCard= : panNum") //
                .setParameter("panCard", panCard) //
                .getResultList();

        if(!customers.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}