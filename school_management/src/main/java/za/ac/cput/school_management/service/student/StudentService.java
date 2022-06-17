package za.ac.cput.school_management.service.student;

/*
Tyler Yorke Fredericks - 218047894
ADP3 JUNE ASSIGNMENT
StudentService.java
*/

import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.service.IService;

import java.util.List;

public interface StudentService extends IService<Student, String> {
    Student retrieveById(String studentId);
    List<Student> getAll();

}
