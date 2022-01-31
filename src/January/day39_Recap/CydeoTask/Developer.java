package January.day39_Recap.CydeoTask;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working");
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