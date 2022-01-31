package Dec.day31_Constructors.scrumTask;

import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Waleed", 1234,"SDET", 125000);
        Tester tester2 = new Tester("Nawar", 1235,"SDET", 120000);
        Tester tester3 = new Tester("Tifa", 1236,"SE", 115000);
        Tester tester4 = new Tester("Duraid", 1237,"SDET", 135.000);

        Developer developer1 = new Developer("Olga", 22, "Java Developer",125000);
        Developer developer2 = new Developer("mike", 23, " Java Master",175000);
        Developer developer3 = new Developer("tyson", 24, "Software Developer",135000);
        Developer developer4 = new Developer("Ali", 25, "developer",140000);
        Developer developer5 = new Developer("Moi", 26, "Senior Developer",185000);

        Tester [] testers = {tester2,tester3,tester4};
        Developer[] developers = {developer2,developer3,developer4,developer5};

        //1 scrumTeam object
        ScrumTeam scrum = new ScrumTeam("Niagra", "Maria", "Hussein", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);
        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        for (Tester eachTester : scrum.testerList){
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }
        System.out.println("=====================");

        for (Developer eachDeveloper : scrum.developsList){
            System.out.println(eachDeveloper.name +" : " + eachDeveloper.salary);
        }

        scrum.removeTester(1236);

        System.out.println(scrum);
        scrum.removeDeveloper(24);
        System.out.println(scrum);

    }
}
