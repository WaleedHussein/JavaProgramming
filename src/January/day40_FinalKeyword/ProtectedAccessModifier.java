package January.day40_FinalKeyword;

public class ProtectedAccessModifier {

    static String name1 = "Cydeo";
    protected static String name2 = "wooden spoon";
    public static String name3 = "Mike";
    private static String name4 = "name4";


    private String getName4(){
        return name4;
    }

private void init(){
    System.out.println("m");
}

private void start(){
        init();
}



}
