package com.tecnologiaefinancas.desafiostech.en.advanced.stream.employee;

public class Employee {

    private String Name;
    private String Department;
    private int Salary;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, String department, int salary) {
        Name = name;
        Department = department;
        Salary = salary;
    }
}
