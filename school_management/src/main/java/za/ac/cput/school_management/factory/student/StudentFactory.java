package za.ac.cput.school_management.factory.student;

/*
Tyler Yorke Fredericks - 218047894
ADP3 JUNE ASSIGNMENT
StudentFactory.java
*/

import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.domain.student.Student;

public class StudentFactory {

    public static Student createStudent(String studentId, String email, Name name) {

        Student student = new Student.Builder()
                .setStudentId(studentId)
                .setEmail(email)
                .setName(name)
                .build();
        return student;
    }
}
