package com.nss.javaDemo.itrApplication.model;

public class ITRFormSelector {
    public int annualIncome;
    public boolean hasMultipleProperties;
    public boolean hasOtherHouse;
    public boolean hasSaleOfInvestment;
    public boolean hasForeignSources;
    public boolean hasAgricultureIncome;
    public boolean isPartnershipFirmIncome;
    public boolean isBusinessProfessionIncome;
    public boolean hasPresumptiveIncome;
    public boolean isFirm;

    // Constructor for ITR-1
    public ITRFormSelector(int annualIncome) {
        this.annualIncome = annualIncome;
    }

    // Constructor for ITR-2
    public ITRFormSelector(int annualIncome, boolean hasMultipleProperties, boolean hasOtherHouse, boolean hasSaleOfInvestment, boolean hasForeignSources, boolean hasAgricultureIncome) {
        this.annualIncome = annualIncome;
        this.hasMultipleProperties = hasMultipleProperties;
        this.hasOtherHouse = hasOtherHouse;
        this.hasSaleOfInvestment = hasSaleOfInvestment;
        this.hasForeignSources = hasForeignSources;
        this.hasAgricultureIncome = hasAgricultureIncome;
    }

    // Constructor for ITR-3 and ITR-4
    public ITRFormSelector(int annualIncome, boolean isPartnershipFirmIncome, boolean isBusinessProfessionIncome, boolean hasPresumptiveIncome) {
        this.annualIncome = annualIncome;
        this.isPartnershipFirmIncome = isPartnershipFirmIncome;
        this.isBusinessProfessionIncome = isBusinessProfessionIncome;
        this.hasPresumptiveIncome = hasPresumptiveIncome;
    }

    // Constructor for ITR-5
    public ITRFormSelector(boolean isFirm) {
        this.isFirm = isFirm;
    }
}
