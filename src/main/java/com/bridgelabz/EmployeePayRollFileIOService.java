package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmployeePayRollFileIOService {
    public static String PAYROLL_FILE_NAME="C:\\Users\\JJadhao\\IdeaProjects\\untitled\\EmployeePayRolll\\src\\test.txt";

    public long writeDeta(List<EmployeePayRollData> employeePayRollDataList) {
        StringBuffer empBuffer = new StringBuffer();
        employeePayRollDataList.forEach(employee -> {
            String employeeDataString = employee.toString().concat("\n");
            empBuffer.append(employeeDataString);
        });
        try {
            Files.write(Paths.get(PAYROLL_FILE_NAME), empBuffer.toString().getBytes());
        } catch (IOException e) {

        }
        return 0;
    }
    public void printData(){
        try{
            Files.lines(new File("C:\\Users\\JJadhao\\IdeaProjects\\untitled\\EmployeePayRolll\\src\\test.txt").toPath());
        }catch(IOException e){

        }
    }
        public long countEntries(){
            long entries=0;
            try{
                entries=Files.lines(new File("C:\\Users\\JJadhao\\IdeaProjects\\untitled\\EmployeePayRolll\\src\\test.txt").toPath()).count();
            }catch(IOException e){
            }
            return entries;
        }
        }


