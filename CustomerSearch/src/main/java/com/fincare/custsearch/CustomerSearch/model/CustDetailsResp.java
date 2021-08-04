package com.fincare.custsearch.CustomerSearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustDetailsResp {

    private Records records;
    private Record record;
    private TransactionStatus transactionStatus;

}
