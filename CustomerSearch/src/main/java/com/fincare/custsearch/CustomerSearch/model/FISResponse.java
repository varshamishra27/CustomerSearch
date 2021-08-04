package com.fincare.custsearch.CustomerSearch.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "Response")
@XmlAccessorType(XmlAccessType.NONE)
public class FISResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement
    private String aadharReferenceNumber;
    @XmlElement
    private String AMLRiskRating;
    @XmlElement
    private String CustomerName;
    @XmlElement
    private String CustomerNumber;
    @XmlElement
    private String ErrorCode;
    @XmlElement
    private String ReplyCode;
    @XmlElement
    private String ReplyText;

    public FISResponse(String aadharReferenceNumber, String AMLRiskRating, String CustomerName, String CustomerNumber,
                       String ErrorCode, String ReplyCode, String ReplyText){
        this.aadharReferenceNumber =aadharReferenceNumber;
        this.AMLRiskRating=AMLRiskRating;
        this.CustomerName=CustomerName;
        this.CustomerNumber=CustomerNumber;
        this.ErrorCode=ErrorCode;
        this.ReplyCode=ReplyCode;
        this.ReplyText=ReplyText;

    }

    public FISResponse(){

    }

    @Override
    public String toString() {
        return "Response [aadharReferenceNumber=" + aadharReferenceNumber + ", AMLRiskRating=" + AMLRiskRating
                + ", CustomerName=" + CustomerName + ", CustomerNumber=" + CustomerNumber
                + ", ErrorCode=" + ErrorCode + ", ReplyCode=" + ReplyCode + ", ReplyText=" + ReplyText + "]";
    }

}
