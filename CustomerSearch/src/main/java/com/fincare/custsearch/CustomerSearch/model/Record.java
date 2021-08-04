package com.fincare.custsearch.CustomerSearch.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {

    private String AadharReferenceNumber;
    private String AMLRiskRating;
    private String CustomerName;
    private String CustomerNumber;
}
