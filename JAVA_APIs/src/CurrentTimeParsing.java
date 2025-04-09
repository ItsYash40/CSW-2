/*2.1*/
import java.time.LocalTime;
public class CurrentTimeParsing {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());                 // Current time
        System.out.println(LocalTime.parse("10:15"));        // Parse string
        System.out.println(LocalTime.of(3, 20));             // Specific time
    }
}

