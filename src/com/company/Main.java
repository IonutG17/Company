package com.company;

public class Main {
    public static void main(String[] args){
        Employee emp = new Employee(25, "Steve", 123, "DEv", "Developer", 20);
        System.out.println(emp);
        emp.addHour(3);
        emp.addHour(8);
        System.out.println(emp);

        Employee emp2 = new Employee(21, "Bob", 456, "DEv", "Testing", 15);

        Company c = new Company ("Google");
        c.addEmployee(emp);
        c.addEmployee(emp2);

        //System.out.println("From the company " + c + " the employee is: ");
        System.out.println("\n\n" + c.getEmployeeByCnp(456));

        int cnp = 123;
        System.out.println("Salary for  \n\t " + c.getEmployeeByCnp(cnp) + "\n is " + c.getSalaryByCnp(cnp));
    }
}
