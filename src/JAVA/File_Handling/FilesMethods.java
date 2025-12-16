package JAVA.File_Handling;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;

public class FilesMethods {
    public static void main(String[] args) throws IOException {

        /*
        OPERATIONS:
        1.Open files
        2.Write files
        3.Reading files
        4.Adding files
        5.Close and delete the files

        FILE TYPES:
        1.Text File (txt,csv,json)
        2.Binary File(dat,exe)

        PATH TYPES:
        1.Absolute Path: Full Path
        2.Relative Path: Current Working Directory
        */




        File f= new File("C:\\Users\\Admin\\IdeaProjects\\Exception-Handling\\src\\JAVA\\File_Handling\\myfile.txt");
        System.out.println("File Object Created");

        if(f.createNewFile()){
            System.out.println("File created at:"+f.getAbsolutePath());
        }
        else{
            System.out.println("File Already Exits at:"+f.getAbsolutePath());
        }

        //METHODS OF FILE HANDLING

        System.out.println("GET PARENT:"+f.getParentFile());
        System.out.println("GET NAME:"+f.getName());
        System.out.println("GET PATH:"+f.getPath());
        System.out.println("GET ABSOLUTE PATH:"+f.getAbsolutePath());
        System.out.println("IS ABSOLUTE:"+f.isAbsolute());
        System.out.println("CAN READ:"+f.canRead());
        System.out.println("FILE LENGTH:"+f.length());
        System.out.println("CAN WRITE:"+f.canWrite());
        System.out.println(":"+f.exists());




    }

}