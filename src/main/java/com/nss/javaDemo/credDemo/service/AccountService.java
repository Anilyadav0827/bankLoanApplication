package com.nss.javaDemo.credDemo.service;

import com.nss.javaDemo.credDemo.model.Customer;
import com.nss.javaDemo.credDemo.model.Otp;

public class AccountService {

    public Otp registrationService(Customer customer){
        Otp otp= new Otp();// only object reference know the location from the heap
        otp.phoneNumber="99999000";
        otp.customerId="777";
        otp.otpNumber ="999";
        return otp;

    }



}
