package org.example;

public abstract class Worker {
    private String name;
    private int employeeId;

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Worker(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract void Print();
}
