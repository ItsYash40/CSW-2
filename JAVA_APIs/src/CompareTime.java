/*2.3*/
import java.time.LocalTime;
public class CompareTime {
    public static void main(String[] args) {
        System.out.println(LocalTime.parse("03:20").isBefore(LocalTime.parse("04:00"))); // true
    }
}
