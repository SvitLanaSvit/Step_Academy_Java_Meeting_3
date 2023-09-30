package org.example;

public class Security extends Worker {
    private int accessLevel;

    public Security(String name, int employeeId, int accessLevel) {
        super(name, employeeId);
        this.accessLevel = accessLevel;
    }

    @Override
    public void Print() {
        System.out.println("Security Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Access Level: " + accessLevel);
    }
}
