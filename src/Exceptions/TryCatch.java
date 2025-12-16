package Exceptions;
public class TryCatch
{
    public static void main(String[] args)
    {
        //RUNTIME EXCEPTION
        try {
            int a = 10, b = 5, c = 5;
            int result = a / (b - c);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception: "+e);
        }

        //ArrayIndexOutOfBoundsException


        int[] a={1,2,3};
        try{
            System.out.println(a[9]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: "+e);
        }


        //NullPointerException
        try{
            String str=null;
            System.out.println(str.length());

        }catch(NullPointerException e){
            System.out.println("NullPOinterException: "+e);
        }


    }

}

//Keywords Used -> try,catch,finally,throw,throws
//try--It is used to run risky code.
//catch--handles the exceptions
//finally--must run the code after try-catch block