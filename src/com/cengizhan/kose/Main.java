package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        employeeManager.EmployeeOfTheMonth();
        employeeManager.Add();
        employeeManager.List();

        customerManager.isCustomer();
        customerManager.Add();
        customerManager.List();
    }
}
