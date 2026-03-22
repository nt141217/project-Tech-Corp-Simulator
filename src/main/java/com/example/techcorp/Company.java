package com.example.techcorp;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private double budget;
    private List<Employee> employees;
    private List<Project> projects;

    public Company(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.employees = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void startProject(Project project) {
        projects.add(project);
    }

    public void showStatus() {
    System.out.println("=== COMPANY STATUS ===");
    System.out.println("Name: " + name);
    System.out.println("Budget: " + budget);
    System.out.println("Employees: " + employees.size());
    System.out.println("Projects: " + projects.size());

    for (Project project : projects) {
        System.out.println(
            "Project: " + project.getName() +
            ", progress: " + project.getProgress() + "/" +
            project.getRequiredWork() +
            ", finished: " + project.isFinished()
        );
    }
}

public String getName() {
    return name;
}

public double getBudget() {
    return budget;
}

public List<Employee> getEmployees() {
    return employees;
}

public List<Project> getProjects() {
    return projects;
}
}