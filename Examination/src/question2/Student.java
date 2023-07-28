package question2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Getter and Setter for the name attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for the grade attribute
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Getter and Setter for the courses attribute
    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    // Method to add a course
    public void addCourse(String course) {
        courses.add(course);
    }

    // Method to remove a course
    public void removeCourse(String course) {
        courses.remove(course);
    }

    public static void main(String[] args) {
//        creating an instance of the class Students
        Student student = new Student("Christine Xavier", 10);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());

//        adding a course
        student.addCourse("Web Development");
        student.addCourse("Python");
        student.addCourse("Data Structure");
        student.addCourse("Java");
        student.addCourse("React");

        System.out.println("Courses: " + student.getCourses());

//        removing a course
        student.removeCourse("Data Structure");

        System.out.println("Updated Courses After removing a course: " + student.getCourses());
    }
}


