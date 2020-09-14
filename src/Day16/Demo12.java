package Day16;

import java.util.Hashtable;
import java.util.Map;

class Employe{

    int empId;
    String firstName;
    String lastName;
    int age;
    String email;

    public Employe(int empId, String firstName, String lastName, int age, String email) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}


public class Demo12 {
    public static void main(String[] args) {
        Employe emp1 = new Employe(1, "mark", "smith", 20, "m@gamil.com");
        Employe emp2 = new Employe(2, "paul", "smith", 20, "m@gamil.com");
        Employe emp3 = new Employe(3, "watson", "smith", 20, "m@gamil.com");

        Map<Integer, Employe> map = new Hashtable<>();
        map.put(1, emp1);
        map.put(2, emp2);
        map.put(3, emp3);
        //map.put(4, emp3);

        for (Map.Entry<Integer, Employe> entry: map.entrySet()){
            //System.out.println();
            int key = entry.getKey();
            Employe emp = entry.getValue();
            System.out.println(emp);
        }

        Map<String, String> map2 = new Hashtable<>();
        map2.put("name", "mark");

    }
}
