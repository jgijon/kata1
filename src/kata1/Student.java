package kata1;

import java.util.Date;

public class Student {
    private final static double DAYS_PER_YEAR = 365.25;
    private final static long HOURS_PER_YEAR = (long) (24 * DAYS_PER_YEAR);
    private final static long MINUTES_PER_YEAR = 60 * HOURS_PER_YEAR;
    private final static long SECONDS_PER_YEAR = 60 * MINUTES_PER_YEAR;
    private final static long MILLISECONDS_PER_YEAR = 1000 * SECONDS_PER_YEAR;

    private String name;
    private Date birthdate;
    

    public Student(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        Date today = new Date();
        long millisecondsFromDate;
        millisecondsFromDate = today.getTime() - birthdate.getTime();
        return (int) (millisecondsFromDate / MILLISECONDS_PER_YEAR);
    }
}
