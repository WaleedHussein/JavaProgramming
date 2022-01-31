package Dec.day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("default");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str){
        this(10);
        System.out.println("default");
    }





}
