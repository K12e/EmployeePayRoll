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
        Scanner consoleInputReader=new Scanner(System.in);
        employeePayRollService.readEmployeePayRollData(consoleInputReader);
        employeePayRollService.writeEmployeePayRollData();
    }

    private void readEmployeePayRollData(Scanner consoleInputReader) {
        System.out.println("Enter employee ID");
        int id=consoleInputReader.nextInt();
        System.out.println("Enter employee Name");
        String name=consoleInputReader.next();
        System.out.println("Enter employee Salary");
        double salary=consoleInputReader.nextDouble();
        employeePayRollList.add(new EmployeePayRollData(id,name,salary));
    }
    private void writeEmployeePayRollData() {
        System.out.println("\nWriting Employee Pay Roll Roster to Console\n"+employeePayRollList);
   }
}
