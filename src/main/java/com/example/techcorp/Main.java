package com.example.techcorp;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("TechCorp", 50000);

        Employee anna = new Employee("Anna", 8, 7000);
        Employee piotr = new Employee("Piotr", 6, 6500);
        Employee martyna = new Employee("Martyna",10,8000);

        company.hire(anna);
        company.hire(piotr);
        company.hire(martyna);

        Project project = new Project("Mobile App", 30);
        project.addEmployee(anna);
        project.addEmployee(piotr);

        company.startProject(project);

        Project project2 = new Project("Nowy Projekt", 50);
        project2.setRequiredWork(90);
        project2.addEmployee(martyna);

        System.out.println(project);
        company.startProject(project);
        project.workOneTurn();

        int turns = 0;
        while (!project.isFinished()) {
            project1.workOneTurn();
            turns++;
            System.out.println("Turn " + turns + ": progress = "
                    + project1.getProgress() + "/" + project1.getRequiredWork());
        }

        System.out.println("Project " + project1.getName() + " finished in " + turns + " turns.");
    }
}