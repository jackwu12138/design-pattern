package com.example.nullobject;

/**
 * @author jackwu
 */
public class NullPatternDemo {

    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("tom");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("dany");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("jack");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
