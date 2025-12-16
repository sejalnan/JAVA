package Exceptions;
import java.util.Scanner;

import Exceptions.InvalidMarks;

public class Throw_and_Throws
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        try{
            divide(sc);
            arrIndexOutOfBound();
            checkMarks(32);
        }catch(Exception e){
            System.out.println("Exception Caught: " +e);
        }finally {
            System.out.println("Program Run Successfully!!! ");
        }

    }

    public static void arrIndexOutOfBound() throws ArrayIndexOutOfBoundsException{

        try
        {
            int[] arr={1,3,4,5,2,1};
            System.out.println(arr[8]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Occur: "+e);
        }


    }
    
    public static void nullpointer() throws NullPointerException{
        try{
            String str=null;
            System.out.println(str.length());

        }catch(NullPointerException e){
            System.out.println("Exception Occur: "+e);
        }
    }


    public static void divide(Scanner sc){
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
        try
        {
            System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println("Exception Occur: "+e);
        }
    }

    public static void checkMarks(int marks)throws InvalidMarks{
        try
        {
            if (marks < 35)
            {
                throw new InvalidMarks("Marks should be greater than 35");
            }

        } catch (InvalidMarks e) {

            System.out.println("Exception Occur: "+e);
        }


    }

}