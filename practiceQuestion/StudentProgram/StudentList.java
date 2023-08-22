package ITEC2150.practiceQuestion.StudentProgram;

import java.util.ArrayList;
import java.util.List;

/**
 * class: StudentList
 * author: Eden Truong
 * date: 08/19/2023
 * version: 1.0
 * description: ITEC 2150 Practice Student Array List
 *
 */

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
