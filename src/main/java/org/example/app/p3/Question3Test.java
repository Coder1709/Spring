package org.example.app.p3;

import org.example.pojo.Customer;
import org.example.pojo.CustomerQ3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Set;

public class Question3Test {

    public static void main(String[] args) {

        //Loading the application context
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        //Retrieving the customer bean
        CustomerQ3 customer =  (CustomerQ3) context.getBean("customerq3");

        // Use the customer bean
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Monthly Income: " + customer.getMonthlyIncome());
        System.out.println("Profession: " + customer.getProfession());
        System.out.println("Designation: " + customer.getDesignation());
        System.out.println("Company Name: " + customer.getCompanyName());

        System.out.println("List of Phone Number");

        //storing the phone Number
        List<String> phone = customer.getPhoneNumber();

        //Storing the emailAddress
        Set<String> email = customer.getEmailAddress();

        phone.forEach(System.out::println);

        System.out.println("List of Email Address");

        email.forEach(System.out::println);








    }
}
