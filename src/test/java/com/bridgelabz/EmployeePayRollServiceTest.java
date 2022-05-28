package com.bridgelabz;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.bridgelabz.EmployeePayRollFileIOService.PAYROLL_FILE_NAME;

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
        employeePayRollService.writeEmployeePayRollData("FILE_IO");
        employeePayRollService.printdata("FILE_IO");
        long entries=employeePayRollService.countEntries("FILE_IO");
    }
    public void printData(String file_io) {
        try {
            Files.lines(new File(PAYROLL_FILE_NAME).toPath())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long countEntries(String file_io) {
        long entries = 0;
        try {
            entries = Files.lines(new File(PAYROLL_FILE_NAME).toPath()).count();
        } catch (IOException e) {

            e.printStackTrace();
        }
        return entries;

    }
    public List<EmployeePayRollData> readData(){
        List<EmployeePayRollData> employeePayrollDataList=new ArrayList<>();
        try{
            Files.lines(new File(PAYROLL_FILE_NAME).toPath()).map(line->line.trim()).forEach(line->System.out.println(line));
        }catch(IOException e) {
            e.printStackTrace();
        }
        return  employeePayrollDataList;
    }
    }
