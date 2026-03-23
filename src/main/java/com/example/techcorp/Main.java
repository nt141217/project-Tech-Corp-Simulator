package com.example.techcorp;

public class Main {
    public static void main(String[] args) {
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
    }
}