package org.example;

public class Engineer extends Worker{
    private String specialization;

    public Engineer(String name, int employeeId, String specialization) {
        super(name, employeeId);
        this.specialization = specialization;
    }

    @Override
    public void Print() {
        System.out.println("Engineer Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Specialization: " + specialization);
    }
}
