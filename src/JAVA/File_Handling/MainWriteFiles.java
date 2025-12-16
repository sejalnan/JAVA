package JAVA.File_Handling;

import JAVA.File_Handling.WriteFiles;

import java.io.IOException;
import java.util.Scanner;

public class MainWriteFiles   {
    public static void main(String[] args) throws IOException {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String path=sc.nextLine();

        System.out.println("Enter the Data: ");
        String data=sc.nextLine();

        WriteFiles writefile=new WriteFiles(path,data);
        System.out.println("Choose the Option:");
        System.out.println("1.change data");
        System.out.println("2.Append data");
        System.out.println("3.read data");

        int choice= sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
                System.out.println("Enter New Data: ");
                data=sc.nextLine();

                System.out.println("Old Data: "+writefile.writeData(data,false));
                break;
            case 2:
                System.out.println("Enter Data to be Added: ");
                data=sc.nextLine();

                System.out.println("Old Data: "+writefile.writeData(data,true));
                break;
            case 3:
                System.out.println(writefile.currentData);
        }
    }
}