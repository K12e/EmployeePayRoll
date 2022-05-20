package com.bridgelabz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class InputOutputStreams {
    public static void main(String[] args) {
        createFile();
        // getFileInformation();
        //writingToFile();
        //  readFile();
    }

    private static void createFile() {
        File file = new File("C:\\Users\\JJadhao\\IdeaProjects\\untitled\\EmployeePayRolll\\src\\test.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("file created " + file.getName());
            } else {
                System.out.println("file exist" + file.getName());
            }
        } catch (IOException e) {
            System.out.println("error is " + e);

        }
    }

}


