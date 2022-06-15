package za.ac.cput.school_management.repository.student.impl;

/*
Tyler Yorke Fredericks - 218047894
ADP3 JUNE ASSIGNMENT
StudentRepositoryIMPL.java
*/

import za.ac.cput.school_management.domain.student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryIMPL {
    private final List<Student> StudentList;
    private static StudentRepositoryIMPL STUDENT_REPOSITORY;

    private StudentRepositoryIMPL() {
        this.StudentList = new ArrayList<>();
    }

    public static StudentRepositoryIMPL getStudentRepository() {
        if (STUDENT_REPOSITORY == null) STUDENT_REPOSITORY = new StudentRepositoryIMPL();
        return STUDENT_REPOSITORY;
    }

    public Student create(Student student) {
        this.StudentList.add(student);
        return student;
    }

    public Student read(String s) {
        return this.StudentList.stream().filter(e -> e.getStudentId().equalsIgnoreCase(s)).findAny().orElse(null);
    }


    public Student update(Student student){
        Student st = read(student.getStudentId());
        if (st != null) {
            delete(st.getStudentId());
            return create(student);
        }
        return null;

    }

    public void delete(String s) {
        Student student = read(s);
        if (student != null) this.StudentList.remove(student);
    }

    public List<Student> findAll() {
        return this.StudentList;
    }

}
