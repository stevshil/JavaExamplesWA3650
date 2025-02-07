package com.example;

// import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.example.*;

public class testComputeTotal {

    @Test
    public void testComputeTotal() {

        // Setup Mock TaxCalculator (Mockito):
        TaxCalculator taxCalculator = new SalesTaxCalculator();

        // TaxCalculator taxCalculator = mock(TaxCalculator.class);
        when(taxCalculatorMock.calculateTax(100.0))
            .thenReturn(10.0);

        // Dependency inject mock taxCalculator into Register
        Register register = new Register(taxCalculatorMock);

        // Call the method under test
        double total = register.computeTotal(100.0);

        // Check results
        assertEquals(110.0, total, 0);
    }
}