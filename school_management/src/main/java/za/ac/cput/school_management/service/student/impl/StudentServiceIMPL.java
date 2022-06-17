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

import java.util.List;
import java.util.Optional;


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
        return this.studentRepository.save(student);
    }

    @Override
    public Student read(String s) {
        Optional<Student> optionalStudent = this.studentRepository.findById(s);
        return optionalStudent.orElse(null);
    }

    @Override
    public Student update(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public void delete(String s) {
        this.studentRepository.deleteById(s);
    }

    @Override
    public Student retrieveById(String studentId) {
        List<Student> students = getAll();
        for(Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(studentId))
                return student;
        }
        return null;
    }

    @Override
    public List<Student> getAll() {
        return this.studentRepository.findAll();
    }

}
