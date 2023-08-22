package ITEC2150.practiceQuestion.StudentProgram;

/**
 * class: Student
 * author: Eden Truong
 * date: 08/19/2023
 * version: 1.0
 * description: ITEC 2150 Practice Student Class
 *
 */

public class Student {
    //data
    private String name;
    private int age;
    //constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getter and setter
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge() {
        this.age = age;
    }

    @Override
    public String toString() {
        if (getAge() >= 20) {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
        else return "Student Under 20";
    }
}
