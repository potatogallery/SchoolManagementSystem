package za.ac.cput.school_management.repository.student;

/*
Tyler Yorke Fredericks - 218047894
ADP3 JUNE ASSIGNMENT
StudentRepository.java
*/

import za.ac.cput.school_management.domain.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository <Student, String> {

//    @Override
//    public Student retrieveById(String s) {
//        return findAll().stream().filter(student -> student.getStudentId().equalsIgnoreCase(student.studentId)).findAny().orElse(null);
//    }

}
