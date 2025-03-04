import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Name implements Comparable<Name> {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Name other) {
        return Integer.compare(this.name.length(), other.name.length());
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Q1_4March {
    public static void main(String[] args) {
        List<Name> names = new ArrayList<>();
        names.add(new Name("Sneha"));
        names.add(new Name("Yash"));
        names.add(new Name("Avi"));
        names.add(new Name("Diya"));

        System.out.println("Input List: " + names);

        Collections.sort(names);

        System.out.println("Sorted List (by length): " + names);
    }
}