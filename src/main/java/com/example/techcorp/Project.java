package com.example.techcorp;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private List<Employee> team;
    private int requiredWork;
    private int progress;

    public Project(String name, int requiredWork) {
        this.name = name;
        this.requiredWork = requiredWork;
        this.progress = 0;
        this.team = new ArrayList<>();
    }

    public void workOneTurn() {
        for (Employee employee : team) {
            progress += employee.work();
        }

        if (progress > requiredWork) {
            progress = requiredWork;
        }
    }

    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    public void setRequiredWork(int newRequiredWork){
        this.requiredWork = newRequiredWork;
    }

        public boolean isFinished() {
        return progress >= requiredWork;
    }

    public String getName() {
        return name;
    }

    public int getRequiredWork() {
        return requiredWork;
    }

    public int getProgress() {
        return progress;
    }

    public List<Employee> getTeam(){
        return team; 
    }
}