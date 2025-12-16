package Exceptions;
public class MultipleCatch
{
     public void main(String[] args)
     {
         try {
             int a = 10, b = 5, c = 5;
             int result = a / (b - c);
             System.out.println(result);
             Throw_and_Throws.nullpointer();
             Throw_and_Throws.arrIndexOutOfBound();

         }catch (ArithmeticException e)
         {
             System.out.println("Arithmetic Exception: "+e);
         }
         catch (ArrayIndexOutOfBoundsException e)
         {
             System.out.println("Invalid array index");
             System.out.println(e);

         }
         catch(NullPointerException e)
         {
             System.out.println("NullPOinterException:"+e);
         }
         finally
         {
             System.out.println("The program is executed Successfully!!");
         }

     }

}