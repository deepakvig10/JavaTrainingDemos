package Day15;

import java.util.ArrayList;
import java.util.Collections;

/**
 * perform sorting on user define class
 *
 * to perform sorting on user define class we have to implement
 *
 * Comparable which contain a method compareTo
 *
 * as this interface is already implemented by other classes like String, Integer
 *
 *
 * CompareTo(Object obj) method
 * there can be 3 possible combination
 * 1. 1, if the current object is greater than the specific object
 * 2. -1, if the current object is less then the specific object
 * 3. 0, if the current object is equal to specific object
 *
 *
 *
 * */


class User implements Comparable<User>{
     int id;
     String name;
     int age;

     public User(int id, String name, int age) {
         this.id = id;
         this.name = name;
         this.age = age;
     }

    public String display(){
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User user) {
//        if(age == user.age)
//            return 0;
//        else if(age > user.age)
//            return 1;
//        else
//            return -1;
        if(id < user.id)
            return 1;
        else if(id > user.id)
            return -1;
        else
            return 0;
    }
}


public class Demo7 {

    public static void main(String[] args) {

        User user1 = new User(2,"Paul", 30);
        User user2 = new User(3,"Watson", 20);
        User user3 = new User(1,"Mark", 40);
        User user4 = new User(4,"Watson2", 200);

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);


        System.out.println("Before Sorting......");
        for (User user: users){
            System.out.println(user.toString());
        }

        Collections.sort(users);

        System.out.println("After Sorting......");
        for (User user: users){
            System.out.println(user.toString());
        }

    }

}
