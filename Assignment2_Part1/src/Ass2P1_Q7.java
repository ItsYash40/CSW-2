import java.util.*;

public class Ass2P1_Q7 {

    public static void main(String[] args) { 
    	Student3[] students = { 
            new Student3("yash", 3, 20), 
            new Student3("Diya", 2, 22), 
            new Student3("Arka", 1, 21) 
        }; 

        Arrays.sort(students, new RollNoComparator()); 
        System.out.println("Students sorted by Roll No.:"); 
        for (Student3 student : students) { 
            System.out.println(student); 
        } 

        Arrays.sort(students, new AgeComparator()); 
        System.out.println("\nStudents sorted by Age:"); 
        for (Student3 student : students) { 
            System.out.println(student); 
        } 
    } 
}

class Student3 { 
    String name; 
    int rollNo; 
    int age; 

    Student3(String name, int rollNo, int age) { 
        this.name = name; 
        this.rollNo = rollNo; 
        this.age = age; 
    } 

    public String toString() { 
        return "Name: " + name + ", Roll No.: " + rollNo + ", Age: " + age; 
    } 
}

class RollNoComparator implements Comparator<Student3> { 
    public int compare(Student3 s1, Student3 s2) { 
        return Integer.compare(s1.rollNo, s2.rollNo); 
    } 
}

class AgeComparator implements Comparator<Student3> { 
    public int compare(Student3 s1, Student3 s2) { 
        return Integer.compare(s1.age, s2.age); 
    } 
}




/*7. Write a program to create a Student class with member variables name, rollNo, and 
age. The program should allow the creation of an array of Student objects and implement 
sorting based on rollNo and age in the driver class. The sorted student arrays should be 
printed separately. Additionally, the program should utilize the Comparator interface by 
overriding the compare() method to enable custom comparisons for sorting.*/