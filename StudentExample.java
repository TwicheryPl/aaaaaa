import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kowalski", 111));
        students.add(new Student("Nowak", 222));
        students.add(new Student("Zielinski", 333));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.lastName + " : " + student.albumNumber);
        }
    }
}
