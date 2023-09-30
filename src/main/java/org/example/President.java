package org.example;

public class President extends Worker{
    private String department;

    public President(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    @Override
    public void Print() {
        System.out.println("President Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Department: " + department);
    }
}
