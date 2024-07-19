package com.nss.javaDemo.credDemo.service;

import com.nss.javaDemo.credDemo.model.Customer;
import com.nss.javaDemo.credDemo.model.Otp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class AccountServiceTest {
    @Test
    public void registrationTest(){
        Customer customer= new Customer();
        customer.customerId=777;
        customer.customerName="pavan";
        customer.password="1234";
        customer.userName="pavan@123";
        AccountService accountService= new AccountService();
        Otp otpTest=  accountService.registrationService(customer);
        Assertions.assertNotNull(otpTest);
        Assertions.assertEquals("999", otpTest.otpNumber);

    }


}