/*4.2*/
import java.time.ZoneId;
import java.util.Set;
public class GetAllAvailableZones {
    public static void main(String[] args) {
        Set<String> zones = ZoneId.getAvailableZoneIds();
        zones.stream().limit(5).forEach(System.out::println); // Only first 5
    }
}

