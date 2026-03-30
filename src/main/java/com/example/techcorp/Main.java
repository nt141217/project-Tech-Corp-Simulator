package com.example.techcorp;

public class Main {
    public static void main(String[] args) {
        /*
        Company company = new Company("TechCorp", 50000);

        Employee anna = new Employee("Anna", 8, 7000);
        Employee piotr = new Employee("Piotr", 6, 6500);
        Employee ewa = new Employee("Ewa", 5, 6000);

        company.hire(anna);
        company.hire(piotr);
        company.hire(ewa);

       // Project project = new Project("Mobile App", 30);
       Project project = new Project("Mobile App", 50);

        project.addEmployee(anna);
        project.addEmployee(piotr);
        project.addEmployee(ewa);

        Project website = new Project ("Website", 20);
        website.addEmployee(piotr);

        company.startProject(project);
        company.startProject(website);

        project.start();
         website.start();

        System.out.println("Stan poczatkowy:");
        company.showStatus();

        System.out.println("\n--- Tura 1 ---");
        project.workOneTurn();
        company.showStatus();

        System.out.println("\n--- Tura 2 ---");
        project.workOneTurn();
        company.showStatus();

    int turns = 0;

    while (!project.isFinished()) {
    project.workOneTurn();
    company.showStatus();
    turns++;
    }

    System.out.println("Projekt zakonczyl sie po " + turns + " turach.");
    
    */ 

   //Main pod Java_5 lesson 4b
    Project mobileApp = new Project("Mobile App", 40);

        mobileApp.addWorker(new Developer("Anna", 9, 8000));
        mobileApp.addWorker(new Tester("Piotr", 6, 6500));
        mobileApp.addWorker(new Manager("Ewa", 7, 9000));
        mobileApp.addWorker(new AutomatedTool("CI Pipeline", 5));

        mobileApp.start();

        while (!mobileApp.isFinished()) {
            mobileApp.workOneTurn();

            System.out.println(
                    mobileApp.getName() + " | status: "
                            + mobileApp.getStatus()
                            + " | progress: "
                            + mobileApp.getProgress() + "/" + mobileApp.getRequiredWork()
            );
        }

        Project project = new Project("New System", 50);
        project.addWorker(new Developer("Anna", 10, 8000));
        project.addWorker(new Tester("Piotr", 6, 6000));
        project.addWorker(new Manager("Ewa", 8, 9000));
        project.addWorker(new AutomatedTool("CI", 5));
        project.addWorker(new FreelancerBot("BotX", 7));
    }
}