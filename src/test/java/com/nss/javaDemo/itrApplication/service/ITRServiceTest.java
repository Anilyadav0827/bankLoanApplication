package com.nss.javaDemo.itrApplication.service;

import com.nss.javaDemo.itrApplication.model.ITRFormSelector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ITRServiceTest {
    @Test
    public void testITR1() {
        ITRFormSelector form = new ITRFormSelector(400000);

        ITRService service = new ITRService();
        String formSelected = service.selectFormAndCalculateTax(form);

        assertEquals("ITR Form 1", formSelected);
        assertEquals(7500, service.getCalculatedTax());
    }

    @Test
    public void testITR2() {
        ITRFormSelector form = new ITRFormSelector(6000000, true, false, false, false, false);

        ITRService service = new ITRService();
        String formSelected = service.selectFormAndCalculateTax(form);

        assertEquals("ITR Form 2", formSelected);
        assertEquals(1800000, service.getCalculatedTax());
    }

    @Test
    public void testITR3() {
        ITRFormSelector form = new ITRFormSelector(7000000, false, true, false);

        ITRService service = new ITRService();
        String formSelected = service.selectFormAndCalculateTax(form);

        assertEquals("ITR Form 3", formSelected);
        assertEquals(2100000, service.getCalculatedTax());
    }

    @Test
    public void testITR4() {
        ITRFormSelector form = new ITRFormSelector(800000, false, false, true);

        ITRService service = new ITRService();
        String formSelected = service.selectFormAndCalculateTax(form);

        assertEquals("ITR Form 4", formSelected);
        assertEquals(160000, service.getCalculatedTax());
    }

    @Test
    public void testITR5() {
        ITRFormSelector form = new ITRFormSelector(true);
        form.annualIncome = 5000000;

        ITRService service = new ITRService();
        String formSelected = service.selectFormAndCalculateTax(form);

        assertEquals("ITR Form 5", formSelected);
        assertEquals(1500000, service.getCalculatedTax());
    }

    @Test
    public void testITR2LowIncome() {
        ITRFormSelector form = new ITRFormSelector(4000000, false, false, false, true, false);

        ITRService service = new ITRService();
        String formSelected = service.selectFormAndCalculateTax(form);

        assertEquals("ITR Form 2", formSelected);
        assertEquals(800000, service.getCalculatedTax());
    }
}