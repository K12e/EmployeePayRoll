package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {

    private List<EmployeePayRollData> employeePayRollList;

    public EmployeePayRollService() {
    }

    public EmployeePayRollService(List<EmployeePayRollData> employeePayRollList) {
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayRollData> employeePayRollList = new ArrayList<>();
        EmployeePayRollService employeePayRollService = new EmployeePayRollService(employeePayRollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayRollService.readEmployeePayRollData(consoleInputReader);
        employeePayRollService.writeEmployeePayRollData();
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

    void writeEmployeePayRollData() {
        System.out.println("\nWriting Employee Pay Roll Roster to Console\n" + employeePayRollList);
    }

    public void printData(String file_io) {
        try{
            Files.lines(new File("payroll-file.txt").toPath());
        }catch(IOException e){

        }
    }

    public long countEntries(String file_io) {
        long entries=0;
        try{
            entries= Files.lines(new File("payroll-file.txt").toPath()).count();
        }catch(IOException e){
        }
        return entries;
    }
    }


