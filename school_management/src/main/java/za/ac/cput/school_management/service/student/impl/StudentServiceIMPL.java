package za.ac.cput.school_management.service.student.impl;

/*
Tyler Yorke Fredericks - 218047894
ADP3 JUNE ASSIGNMENT
StudentServiceIMPL.java
*/

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.repository.student.StudentRepository;
import za.ac.cput.school_management.service.student.StudentService;


public class StudentServiceIMPL implements StudentService {

    private static StudentService studentService = null;

    @Autowired
    private StudentRepository studentRepository;

    private StudentServiceIMPL() {

    }

    public static StudentService getStudentService() {
        if (studentService == null) studentService = new StudentServiceIMPL();
        return studentService;
    }

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public Student read(String s) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

}
