DROP TABLE IF EXISTS customer;

CREATE TABLE customer(
    panCard VARCHAR(10) NOT NULL


);

INSERT INTO customer (panCard) VALUES ('ATGPK9128D');

DROP TABLE IF EXISTS custResp;

CREATE TABLE custResp(

    aadharReferenceNumber varchar(50),
    amlRiskRating int,
    customerName varchar(100),
    customerNumber varchar(50)

);