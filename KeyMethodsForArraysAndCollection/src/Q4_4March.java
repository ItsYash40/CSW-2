import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;

        return Integer.compare(lastDigit1, lastDigit2);
    }
}

public class Q4_4March {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(45);
        numbers.add(678);
        numbers.add(91);
        numbers.add(234);
        numbers.add(567);

        System.out.println("Numbers before sorting:");
        System.out.println(numbers);

        Collections.sort(numbers, new NumberComparator());

        System.out.println("\nNumbers after sorting by last digit:");
        System.out.println(numbers);
    }
}