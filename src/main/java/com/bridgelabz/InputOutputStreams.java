package com.bridgelabz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class InputOutputStreams {
    public static void main(String[] args) {
        createFile();
        getFileInformation();
        writingToFile();
      //  readFile();
    }

    private static void createFile() {
        File file=new File("C:\\Users\\JJadhao\\IdeaProjects\\untitled\\EmployeePayRolll\\src\\test.txt");
            try{
                if(file.createNewFile()){
                    System.out.println("file created "+file.getName());
                }
                else {
                    System.out.println("file exist"+file.getName());
                }
            }catch (IOException e){
                System.out.println("error is "+e);

            }
        }
        private static void getFileInformation() {
        File file=new File("C:\\Users\\JJadhao\\IdeaProjects\\untitled\\EmployeePayRolll\\src\\test.txt");
            if(file.exists()) {
                System.out.println("File name " + file.getName());
                System.out.println("Readable " + file.canRead());
                System.out.println("Writable " + file.canWrite());
                System.out.println("Excecutable " + file.canExecute());
                System.out.println("Absolute path " + file.getAbsolutePath());
                System.out.println("path " + file.getPath());
                System.out.println("path " + file.length());
            }

     }
    private static void writingToFile() {
    File file=new File("C:\\Users\\JJadhao\\IdeaProjects\\untitled\\EmployeePayRolll\\src\\test.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            String contentOfFile="In Java, a File is an abstract data type." +
                    " A named location used to store related information is known as a File. " +
                    "There are several File Operations like creating a new File, getting information about File, " +
                    "writing into a File, reading from a File and deleting a File.";
            fileWriter.write(contentOfFile);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}












