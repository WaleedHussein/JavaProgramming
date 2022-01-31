package January.day41_Exceptions;

import January.day39_Recap.CydeoTask.Employee;

import java.util.zip.CheckedOutputStream;

public class MultiCatchBlocks {
    public static void main(String[] args) {


        Employee employee = null;

        try {

            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("1st catch");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("2nd catch");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("3rd catch");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("4th cath");
            e.printStackTrace();
        }

















    }
}
