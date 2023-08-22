package ITEC2150.practiceQuestion.StudentProgram;

/**
 * class: StudentTester
 * author: Eden Truong
 * date: 08/19/2023
 * version: 1.0
 * description: ITEC 2150 Practice Student Tester Class
 *
 */

public class StudentTester {
    public static void main(String[] args) {
        StudentList list = new StudentList();

        Student student1 = new Student("Eden", 18);
        Student student2 = new Student("Zuberi", 21);
        Student student3 = new Student("Dom", 19);
        Student student4 = new Student("Nicole", 20);

        list.addStudent(student1);
        list.addStudent(student2);
        list.addStudent(student3);
        list.addStudent(student4);
        list.displayStudent();
    }
}
