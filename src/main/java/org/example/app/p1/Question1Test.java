package org.example.app.p1;

import org.example.pojo.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question1Test {
    public static void main(String[] args) {


        //using Setter Injection

        // Load the Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve the customer bean
        Customer customer = (Customer) context.getBean("customer1");

        // Use the customer bean
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Monthly Income: " + customer.getMonthlyIncome());
        System.out.println("Profession: " + customer.getProfession());
        System.out.println("Designation: " + customer.getDesignation());
        System.out.println("Company Name: " + customer.getCompanyName());

        //using Constructor Injection

        // Retrieve the customer bean
        Customer customer2 = (Customer) context.getBean("customer2");

        System.out.println("------------------------");

        // Use the customer bean
        System.out.println("Customer ID: " + customer2.getCustomerId());
        System.out.println("Customer Name: " + customer2.getCustomerName());
        System.out.println("Monthly Income: " + customer2.getMonthlyIncome());
        System.out.println("Profession: " + customer2.getProfession());
        System.out.println("Designation: " + customer2.getDesignation());
        System.out.println("Company Name: " + customer2.getCompanyName());


        //setting the same value for both the same object using contructor injection and setter injection
        Customer customer3 = (Customer) context.getBean("customer3");

        System.out.println("------------------------");
        System.out.println("Customer ID: " + customer3.getCustomerId());
        System.out.println("Customer Name: " + customer3.getCustomerName());
        System.out.println("Monthly Income: " + customer3.getMonthlyIncome());
        System.out.println("Profession: " + customer3.getProfession());
        System.out.println("Designation: " + customer3.getDesignation());
        System.out.println("Company Name: " + customer3.getCompanyName());

        //Constructor Value gets overriden by Setter Value







    }
}
