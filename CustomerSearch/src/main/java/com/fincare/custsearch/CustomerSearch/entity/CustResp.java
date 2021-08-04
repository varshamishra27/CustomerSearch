package com.fincare.custsearch.CustomerSearch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class CustResp {

    @Id
    @Column
    private String customerNumber;
    @Column
      private String aadharReferenceNumber;
    @Column
       private String amlRiskRating;
    @Column
       private String customerName;

}
