package com.nss.javaDemo.credDemo.model;

public class Account {
    public RateOFInterest rateOFInterest;// custom data type
    public double availableBalance;
    public Double currentBalance;
    public String accountNumber;
    public Address address; // to access address object in the account
    public IfscCode ifscCode;//to access IfsCode object in the account and it as Address filed
}
