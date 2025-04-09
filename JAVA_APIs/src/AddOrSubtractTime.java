/*3.2*/
import java.time.LocalDateTime;
public class AddOrSubtractTime {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().plusHours(3));
        System.out.println(LocalDateTime.now().minusDays(1));
    }
}
