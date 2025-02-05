import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
interface EnrollmentSystem {
    void enrollStudent(Student1 student, Course course);
    void dropStudent(Student1 student, Course course);
    void displayEnrollments();
}
class Student1 {
    private String studentId;
    private String studentName;

    public Student1(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
}
class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

class Enrollment implements EnrollmentSystem {
    private Map<Course, Set<Student1>> enrollmentMap = new HashMap<>();

    @Override
    public void enrollStudent(Student1 student, Course course) {
        enrollmentMap.putIfAbsent(course, new HashSet<>());
        enrollmentMap.get(course).add(student);
        System.out.println(student.getStudentName() + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropStudent(Student1 student, Course course) {
        if (enrollmentMap.containsKey(course) && enrollmentMap.get(course).remove(student)) {
            System.out.println(student.getStudentName() + " dropped from " + course.getCourseName());
        } else {
            System.out.println("Student not found in course.");
        }
    }

    @Override
    public void displayEnrollments() {
        System.out.println("Enrollment Details:");
        for (Map.Entry<Course, Set<Student1>> entry : enrollmentMap.entrySet()) {
            System.out.println("Course: " + entry.getKey().getCourseName());
            for (Student1 student : entry.getValue()) {
                System.out.println("  - " + student.getStudentName());
            }
        }
    }
}
public class MainEnrollApp_10 {
    public static void main(String[] args) {
        EnrollmentSystem enrollmentSystem = new Enrollment();
        
        Student1 student1 = new Student1("S101", "yash");
        Student1 student2 = new Student1("S102", "Diya");
        Course course1 = new Course("CSE101", "Computer Science");
        Course course2 = new Course("MAT101", "Mathematics");
        
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course1);
        enrollmentSystem.enrollStudent(student1, course2);
        
        enrollmentSystem.displayEnrollments();
        
        enrollmentSystem.dropStudent(student1, course1);
        
        enrollmentSystem.displayEnrollments();
    }
}
