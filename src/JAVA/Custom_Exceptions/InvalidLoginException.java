package Custom_Exceptions;

public class InvalidLoginException extends RuntimeException
{
    public InvalidLoginException(String message) {
        super(message);
    }
}

//login method
//predefined->username pass
//user will enter->username pass
//if predefined and user input match
//successful loin
//otherwise throw exception
//retry -3 times