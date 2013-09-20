package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Student record = new Student("Javier",new Date(81, 5, 13));
        System.out.println(record.getAge());
    }

}
