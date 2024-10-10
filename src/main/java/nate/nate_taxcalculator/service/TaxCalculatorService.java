package nate.nate_taxcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class TaxCalculatorService {

    // tax
    public double calculateNetSalary(double grossSalary) {
        double netSalary = grossSalary;

        // tax + social security
        double taxRate = 0.25; // 25% as an example
        double socialSecurityRate = 0.13; // 13% as an example

        double tax = grossSalary * taxRate;
        double socialSecurity = grossSalary * socialSecurityRate;

        netSalary -= (tax + socialSecurity);
        return netSalary;
    }
}
