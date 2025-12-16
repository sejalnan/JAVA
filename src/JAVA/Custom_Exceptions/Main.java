package Custom_Exceptions;
import java.util.Scanner;
import Custom_Exceptions.InvalidLoginException;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String defaultuser="Sejal";
        String defaultpass="seja123";

        for(int i=0;i<3;i++)
        {
        System.out.println("Enter username: ");
        String user=sc.nextLine();
        System.out.println("Enter Password: ");
        String pass=sc.nextLine();
        Login(defaultuser,user,defaultpass,pass);


        }

    }

    public static void Login(String defaultuser,String user,String defaultpass,String pass) throws
            InvalidLoginException
    {
        try {
            if (defaultuser.equalsIgnoreCase(user) && defaultpass.equalsIgnoreCase(pass))
            {
                System.out.println("Login Successfully!!!!");

            }
            else{
                throw new InvalidLoginException("Invalid username and password");
            }

        }catch (InvalidLoginException e){
            System.out.println(e);
        }

    }
}

