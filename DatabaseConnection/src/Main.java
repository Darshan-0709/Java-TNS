import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student s1 = new Student("E001", "Darshan", 21, "ds@ds.com", Arrays.asList("Java", "Python"));
        Student s2 = new Student("E002", "Mehul", 25, "mehul@mehul.com", Arrays.asList("Assessment for learning", "Sanskrit"));
        Student s3 = new Student("E003", "Vedant", 23, "vedu@vedu.com", Arrays.asList("Pharmaceutical Organic Chemistry", "Human Anatomy"));

//        studentService.addStudent(s1);
//        studentService.addStudent(s2);
        studentService.addStudent(s3);

        List<Student> studentList = studentService.getAllStudent();
        studentList.forEach(student -> System.out.println(student));


        System.out.println("Update operation");
        s3.setName("Kuldip");
        studentService.updateStudent(s3);

        s3 = studentService.getStudentByErNo("E003");
        System.out.println(s3);

        studentService.deleteStudent("E003");
        System.out.println("After delete operation");
        studentList = studentService.getAllStudent();
        studentList.forEach(student -> System.out.println(student));

    }
}
