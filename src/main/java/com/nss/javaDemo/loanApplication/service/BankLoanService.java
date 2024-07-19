package com.nss.javaDemo.loanApplication.service;

import com.nss.javaDemo.loanApplication.model.ApplicationForm;
import com.nss.javaDemo.loanApplication.model.CustomerDetails;
import com.nss.javaDemo.loanApplication.model.LoanDetails;

import java.util.UUID;

public class BankLoanService {
    private static final int MIN_AGE = 18;
    private static final double MIN_MONTHS = 12;

    public void registrationService(ApplicationForm applicationForm){

        if(applicationForm.customerDetails.age>=MIN_AGE &&
                applicationForm.customerDetails.income!=applicationForm.customerDetails.expenditure){
            applicationForm.applicationNumber=UUID.randomUUID().toString();
            System.out.println("you are eligible for loan:  "+"application number is : "+applicationForm.applicationNumber);
        }
        else{
            System.out.println("you are not eligible for loan");
        }
    }
    public LoanDetails approveAmount(CustomerDetails customerDetails){
         double amount= customerDetails.income-customerDetails.expenditure;
         double approvedAmount= amount*10;
         customerDetails.loanAmount=approvedAmount;
         LoanDetails loanDetails= new LoanDetails();
         loanDetails.approvedAmount=approvedAmount;
         loanDetails.monthlyEmi=amount*0.6;
         loanDetails.rateOfInterest=9;
         return loanDetails;
    }
    public void emiApproval(CustomerDetails customerDetails){
        double amount= customerDetails.income-customerDetails.expenditure;
        if(customerDetails.selectedTenure>=MIN_MONTHS){
            if(amount>amount*0.6){
                System.out.println("you are eligible for emi");
            }

        }
        else{
            System.out.println("you are not eligible for emi");
        }

    }

}
