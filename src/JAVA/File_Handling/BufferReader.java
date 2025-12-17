package JAVA.File_Handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    static void main(String[] args) throws IOException {


        BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\" +
                "JAVA\\src\\JAVA\\File_Handling\\myfile.txt"));

        int ch;
        while((ch=br.read())!= -1){
            System.out.println((char)ch);
        }
        br.close();



    }
}
