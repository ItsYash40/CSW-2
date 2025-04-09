/*1.3*/
import java.time.LocalDate;
public class ParseDateFromString {
    public static  void main(String [] args){
        LocalDate date = LocalDate.parse("2025-01-15");
        System.out.println(date);
    }
}
