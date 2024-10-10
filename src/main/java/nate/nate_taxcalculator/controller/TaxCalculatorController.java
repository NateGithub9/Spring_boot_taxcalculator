package nate.nate_taxcalculator.controller;

import nate.nate_taxcalculator.service.TaxCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tax")
public class TaxCalculatorController {

    @Autowired
    private TaxCalculatorService taxCalculatorService;

    @GetMapping("/calculate")
    public double calculateNetSalary(@RequestParam double grossSalary) {
        return taxCalculatorService.calculateNetSalary(grossSalary);
    }
}
