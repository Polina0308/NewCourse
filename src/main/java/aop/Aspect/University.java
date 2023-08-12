package aop.Aspect;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public  void addStudent(){
        Student student1 = new Student("Zaur Tregulov", 4, 7.5);
        Student student2 = new Student("Mihhail Ivanov", 2, 8.3);
        Student student3 = new Student("Elena Sidorova", 1, 9.1);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public  List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents");
//        System.out.println(students.get(3));
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return  students;
    }
}
