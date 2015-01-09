import java.util.Date;

public class Person {

    private final Date birthday;
    private final String name;
    private static final long MILLISECONDS_PER_YEAR = (long)(365*24*60*60*1000);


    public Person(Date birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }


    public Date getBirthday() {
        return birthday;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        Date actualDate = new Date();
        return millisecondsToYear(actualDate.getTime() - birthday.getTime());
    }


    private int millisecondsToYear(long millis) {
        return (int) (millis / MILLISECONDS_PER_YEAR);
    }
}
