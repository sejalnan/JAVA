package JAVA.File_Handling;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.classfile.FieldTransform;

/*
 INPUT STREAM AND OUTPUT STREAM
 1.Character stream->Unicode convention
 2.Byte Stream->Binary data
 */

public class WriteFiles {

    /*FileWriter
    1.character oriented stream
    2.convient for text files
    */
    String path;
    String CurrentData;

    public void Writefile(String path,String data) throws IOException{

        this.path=path;
        this.CurrentData=data;

        FileWriter fw=new FileWriter(path);
        fw.write(data);
        fw.close();

        System.out.println("Data Write in File successfully");

    }
    String data;
    public String changeData(String data) throws IOException
    {
        this.data=data;
        FileWriter fc=new FileWriter(path);
        fc.write(data);
        fc.close();
        return "changed";
    }

    String currentData;
    public String writeData(String data) throws IOException{
        String oldData=this.currentData;
        this.currentData=data;
        FileWriter fd=new FileWriter(path);
        fd.write(data);
        fd.append("you are great");
        fd.close();
        return "Write data";


    }



}