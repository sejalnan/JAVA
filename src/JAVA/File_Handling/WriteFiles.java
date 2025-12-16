package JAVA.File_Handling;
import java.io.FileWriter;
import java.io.IOException;

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

    public WriteFiles(String path,String data) throws IOException {
        this.path=path;
        writeData(data,true);
    }

    public void Writefile(String path,String data) throws IOException{

        this.path=path;
        this.CurrentData=data;

        FileWriter fw=new FileWriter(path);
        fw.write(data);
        fw.close();

        System.out.println("Data Write in File successfully");

    }
    String data;
    public String updateData(String data) throws IOException
    {
        this.data=data;
        FileWriter fc=new FileWriter(path);
        fc.append(data);
        fc.close();
        return "changed";
    }

    public String currentData;
    public String writeData(String data,boolean append) throws IOException{
        String oldData=this.currentData;
        this.currentData=data;

        FileWriter fd=new FileWriter(path,append);
            fd.write(data);
            fd.close();

        return oldData;
    }


}