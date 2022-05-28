package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.bridgelabz.EmployeePayRollFileIOService.PAYROLL_FILE_NAME;

public class EmployeePayRollService<EmployeePayrollData> {
    public void printdata(String file_io) {
    }

    public long countEntries(String file_io) {
        return 0;
    }


    public enum IOService{CONSOLE_IO,FILE_IO,DB_IO}
    private List<EmployeePayRollData> employeePayRollList;
    private EmployeePayRollDBService employeePayRollDBService;

    public EmployeePayRollService(List<EmployeePayRollData>employeePayRollList)  {
        this();
        this.employeePayRollList=employeePayRollList;
    }

    public EmployeePayRollService() {
        employeePayRollDBService=EmployeePayRollDBService.getInstance();
    }
    //JDBC_UC2
    public List<EmployeePayrollData>readEmployeePayRollDataDB(IOService ioService){
        if (ioService.equals(IOService.DB_IO)){
            this.employeePayRollList=employeePayRollDBService.readData();
            return this.employeePayRollList;
        }

        return null;
    }
    public void updateEmployeeSalary(String name,double salary){
        int result=employeePayRollDBService.updateEmployeeData(name,salary);
       if (result==0){
           return;
           EmployeePayRollData employeePayRollData=this.getEmployeePayRollData(name);
           if (employeePayRollData!=null){
               employeePayRollData.salary=salary;
           }
       }

    }


    public static void main(String[] args) {
        ArrayList<EmployeePayRollData> employeePayRollList = new ArrayList<>();
        EmployeePayRollService employeePayRollService = new EmployeePayRollService(employeePayRollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayRollService.readEmployeePayRollData(consoleInputReader);
        employeePayRollService.writeEmployeePayRollData("FILE_IO");
    }

    private void readEmployeePayRollData(Scanner consoleInputReader) {
        System.out.println("Enter employee ID");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter employee Name");
        String name = consoleInputReader.next();
        System.out.println("Enter employee Salary");
        double salary = consoleInputReader.nextDouble();
        employeePayRollList.add(new EmployeePayRollData(id, name, salary));
    }

    void writeEmployeePayRollData(String file_io) {
        System.out.println("\nWriting Employee Pay Roll Roster to Console\n" + employeePayRollList);
    }


}
