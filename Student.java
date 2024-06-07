public class Student implements Comparable<Student> {
    public String lastName;
    private int albumNumber;

    public Student(String lastName, int albumNumber) {
        this.lastName = lastName;
        this.albumNumber = albumNumber;
    }

    @Override
    public int compareTo(Student student) {
        return lastName.compareTo(student.lastName);
    }
}
