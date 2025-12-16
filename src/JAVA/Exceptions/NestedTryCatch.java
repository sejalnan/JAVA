package Exceptions;
public class NestedTryCatch {
    public static void main(String[] args)
    {
        int a=10,b=5,c=5;
        try
        {
            System.out.println(a/(b-c));
            try {
                int[] x= { 12,3,124,8};
                System.out.println(x[8]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Inner Exception: "+e);
            }
        }catch(ArithmeticException e){
            System.out.println("Outer Exception: "+e);
        }

    }

}