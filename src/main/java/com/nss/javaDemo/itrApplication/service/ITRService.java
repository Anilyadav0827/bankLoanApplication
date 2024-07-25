package com.nss.javaDemo.itrApplication.service;

import com.nss.javaDemo.itrApplication.model.ITRFormSelector;

public class ITRService {
        private double calculatedTax;

    // Method to select the ITR form and calculate tax
    public String selectFormAndCalculateTax(ITRFormSelector form) {
        CalculateTaxService taxService = new CalculateTaxService();

        String selectedForm = "";
        if (form.annualIncome <= 5000000 && !form.hasMultipleProperties && !form.hasOtherHouse && !form.hasSaleOfInvestment
                && !form.hasForeignSources && !form.hasAgricultureIncome && !form.isPartnershipFirmIncome && !form.isBusinessProfessionIncome
                && !form.hasPresumptiveIncome && !form.isFirm) {
            selectedForm = "ITR Form 1";
            calculatedTax = taxService.calculateTax(form.annualIncome);
        } else if (form.hasMultipleProperties || form.hasOtherHouse || form.hasSaleOfInvestment
                || form.hasForeignSources || form.hasAgricultureIncome) {
            selectedForm = "ITR Form 2";
            calculatedTax = taxService.calculateTax(form.annualIncome, false, false,
                    false, false, form.annualIncome > 5000000);
        } else if (form.isPartnershipFirmIncome || form.isBusinessProfessionIncome) {
            selectedForm = "ITR Form 3";
            calculatedTax = taxService.calculateTax(form.annualIncome, false, false,
                    false, true);
        } else if (form.hasPresumptiveIncome) {
            selectedForm = "ITR Form 4";
            calculatedTax = taxService.calculateTax(form.annualIncome, false,
                    false, true);
        } else if (form.isFirm) {
            selectedForm = "ITR Form 5";
            calculatedTax = taxService.calculateTax(form.annualIncome, false, true);
        }
        return selectedForm;
    }

    public double getCalculatedTax() {
        return calculatedTax;
    }
}


