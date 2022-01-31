package January.day39_Recap.CydeoTask;

public class Tester extends Employee {
    public Tester(String name, int age, char gender, int employeeId, double salary) {
        super(name, age, gender, employeeId, "Tester", salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " +getName() + " is working");
    }
    public void createTicket(){
        System.out.println(getName() + " created a ticket");
    }

}
/*
    3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
 */