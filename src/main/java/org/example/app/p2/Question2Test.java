package org.example.app.p2;

import org.example.pojo.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question2Test {
    public static void main(String[] args) {

        //the main difference between scope of prototype and singleton is that prototype creates a new object every time it is called
        //while singleton creates a single object and returns the same object every time it is called

        //To demonstrate this, we will create a prototype and a singleton bean and call them multiple times

        // Load the Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Customer customer = (Customer)  context.getBean("customer4"); //using singleton scope
        Customer customer2 = (Customer)  context.getBean("customer4"); //using singleton Scope


        Customer customer3 = (Customer)  context.getBean("customer1"); //using prototype Scope
        Customer customer4 = (Customer)  context.getBean("customer1"); //using  prototype Scope



        //for prototype checking if we get different reference
        System.out.println(String.valueOf(customer4));
        System.out.println(String.valueOf(customer3));



        //checking if we get the same reference or not
        System.out.println("-----------------------");
        System.out.println(String.valueOf(customer));
        System.out.println(String.valueOf(customer2));



    }
}
