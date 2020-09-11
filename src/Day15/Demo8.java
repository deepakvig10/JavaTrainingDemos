package Day15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * For user define class we can have sort logic implementation in 2 ways
 * 1. Comparable
 * 2. Comparator
 * <p>
 * Comparable vs Comparator
 * 1. compareTo() method
 * 2. java.lang
 * 3. Collections.sort(list)
 * 4. this provide single sorting sequence
 * we can sort collection on the basic of single element for ex as id, name, age
 * 5. this will effect the original class and if we are not the owner of the class we have
 * to use the class in the same ways it has been created
 * <p>
 * 1. compare() method
 * 2. java.util
 * 3. Collections.sort(list, comparator)
 * 4. this provide multiple sorting sequence
 * we can sort the collection on the basic of multiple element for ex as id, name and age
 * 5. this will not effect the original class and we can modify the logic as per our
 * requirement
 **/

class Customer implements Comparable<Customer> {
    int customerId;
    String firstName;
    String lastName;
    int age;
    int mobile;

    public Customer(int customerId, String firstName, String lastName, int age) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Customer customer2) {
        if (customerId > customer2.customerId)
            return 1;
        else if (customerId < customer2.customerId)
            return -1;
        else
            return 0;
    }
}

class CustomerSortByAge implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        if (customer1.age > customer2.age)
            return 1;
        else if (customer1.age < customer2.age)
            return -1;
        else
            return 0;
    }
}

class CustomerSortByName implements Comparator<Customer>{
    @Override
    public int compare(Customer customer1, Customer customer2) {
       return customer1.firstName.compareTo(customer2.firstName);
    }
}


public class Demo8 {
    public static void main(String[] args) {
        Customer cust1 = new Customer(10, "Mark", "Smith", 20);
        Customer cust2 = new Customer(45, "Paul", "Smith", 50);
        Customer cust3 = new Customer(100, "Watson", "Smith", 22);
        Customer cust4 = new Customer(26, "Stacy", "Smith", 19);

        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(cust1);
        customerList.add(cust2);
        customerList.add(cust3);
        customerList.add(cust4);

        System.out.println("Before Sorting.....");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }

        //Collections.sort(customerList);
        Collections.sort(customerList, new CustomerSortByName());

        System.out.println("After Sorting.....");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }

    }
}
