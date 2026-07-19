package com.example.Employee;

public class test {
    public static void main(String[] args) {
        
        Employees emp = new Employees("Santosh", 23, 23000);

        System.out.println("--------------------------------");

        System.out.println(emp.getEmployeesDetails());

        emp.setAge(24);
        emp.setName("Rakesh Roshan");

        System.out.println(emp.getEmployeesDetails());


    }
}
