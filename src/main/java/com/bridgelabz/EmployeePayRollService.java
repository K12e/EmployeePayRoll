package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
    public enum IOService{console_IO,File_IO}
    private List<EmployeePayRollData> employeePayRollList;
   public EmployeePayRollService(){}

    public EmployeePayRollService(List<EmployeePayRollData>employeePayRollList){}

    public static void main(String[] args) {
        ArrayList<EmployeePayRollData> employeePayRollList=new ArrayList<>();
        EmployeePayRollService employeePayRollService=new EmployeePayRollService(employeePayRollList);
        Scanner condoleInputReader;
    }
}
