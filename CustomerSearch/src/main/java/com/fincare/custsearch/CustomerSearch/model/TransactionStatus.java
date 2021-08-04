package com.fincare.custsearch.CustomerSearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionStatus {

    private String ErrorCode;
    private final String ExternalReferenceNo = "2017122917071234";
    private String ReplyCode;
    private String ReplyText;
}
