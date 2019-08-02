import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;

public class DateTimeExample {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
    }
}
