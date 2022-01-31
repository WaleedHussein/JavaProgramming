package January.day42_Exceptions;

class FadyException extends RuntimeException{
    public FadyException (String message){

        super(message);
    }
}

class NoBreakException extends Exception{

}

public class CustomExceptions {
    public static void main(String[] args) {
     //   throw new FadyException("time for break");

       // throw new NoBreakException();



    }
}
