package com.bridgelabz;

import java.io.File;

public class DeleteOperations {
    public static void main(String[] args)
    {
        try
        {
            File file= new File("C:\\Users\\JJadhao\\IdeaProjects\\untitled\\EmployeePayRolll\\src\\test.txt");           //file to be delete
            if(file.delete())
            {
                System.out.println(file.getName() + " deleted");
            }

            else
            {
               System.out.println("failed");
                throw new Exception("file is not deleted");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
