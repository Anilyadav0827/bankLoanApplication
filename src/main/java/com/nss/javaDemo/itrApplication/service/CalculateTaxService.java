package com.nss.javaDemo.itrApplication.service;

public class CalculateTaxService {
    //this method is  for ITR-1
    public double calculateTax(int annualIncome) {
        double tax = 0;
        if (annualIncome <= 250000) {
            tax = 0;
        } else if (annualIncome <= 500000) {
            tax = (annualIncome - 250000) * 0.05;
        } else if (annualIncome <= 1000000) {
            tax = (250000 * 0.05) + ((annualIncome - 500000) * 0.2);
        } else {
            tax = (250000 * 0.05) + (500000 * 0.2) + ((annualIncome - 1000000) * 0.3);
        }
        return tax;
    }

    // This method is for ITR-2
    public double calculateTax(int annualIncome, boolean isCompany, boolean isFirm,
                               boolean hasPresumptiveIncome, boolean isPartnershipFirmIncome, boolean isHighIncome) {
        double tax;

        if (annualIncome > 5000000) {
            tax = 0.3 * annualIncome;
        } else {
            tax = 0.2 * annualIncome;
        }

        return tax;
    }

    // This method is for ITR-3
    public double calculateTax(int annualIncome, boolean isCompany, boolean isFirm,
                               boolean hasPresumptiveIncome, boolean isPartnershipFirmIncome) {
        double tax;

        if (annualIncome > 10000000) {
            tax = 0.3 * annualIncome;
        } else {
            tax = 0.2 * annualIncome;
        }

        return tax;
    }

    //this method is for ITR-4
    public double calculateTax(int annualIncome, boolean isCompany,
                               boolean isFirm, boolean hasPresumptiveIncome) {
        double tax;

        if (annualIncome > 20000000) {
            tax = 0.3 * annualIncome;
        } else {
            tax = 0.2 * annualIncome;
        }

        return tax;
    }

    //this method is for ITR-5
    public double calculateTax(int annualIncome, boolean isCompany, boolean isFirm) {
        double tax = annualIncome * 0.3;
        return tax;
    }


}