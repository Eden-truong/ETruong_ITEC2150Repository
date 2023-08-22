package ITEC2150.practiceQuestion.StudentProgram;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> students;

    public StudentList() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudent() {
        for (Student student: students) {
            System.out.println(student);
        }
    }
}
