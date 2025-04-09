/*3.1*/
import java.time.LocalDateTime;
public class LocalDateAndTime {
    public static void main(String[] args) {
        System.out.println(java.time.LocalDateTime.now());
        System.out.println(java.time.LocalDateTime.of(2025, 4, 6, 8, 45));
        System.out.println(java.time.LocalDateTime.parse("2025-04-06T08:45:00"));
    }
}
