package com.bridgelabz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EmployeePayRollServiceTest {
    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayRollData[] arrayofEmp = {
                new EmployeePayRollData(1, "kalyani",10000.00),
        new EmployeePayRollData(2, "Swati", 20000.00),
        new EmployeePayRollData(3, "dhanashree", 30000.00)
   };
        EmployeePayRollService employeePayRollService;
        employeePayRollService  = new EmployeePayRollService(Arrays.asList(arrayofEmp));
        employeePayRollService.writeEmployeePayRollData();
        employeePayRollService.printData("FILE_IO");
        long entries=employeePayRollService.countEntries("FILE_IO");



    }
    }
