package com.fincare.custsearch.CustomerSearch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
    @Id
    @Column
    private String panCard;
}

//public class Customer {}
