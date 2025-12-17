import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;


    public static void main(String[] args) throws IOException
   {

       //reads character by character
       FileReader fr=new FileReader("C:\\Users\\Admin\\IdeaProjects\\" +
               "JAVA\\src\\JAVA\\File_Handling\\myfile.txt");

       int ch;
       while((ch=fr.read())!= -1){
           System.out.println((char)ch);
       }
       System.out.println(fr.read()); //return -1;
        fr.close();

    }










