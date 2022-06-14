package za.ac.cput.school_management.factory.student;

/*
    Student.java
    Entity for the Student
    Zavian Minnies(217230458)
    14 June 2022
 */

import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.domain.student.StudentAddress;


public class StudentAddressFactory {

    public static StudentAddress createStudentAddress(String studentId, Address address) {

        StudentAddress studentAddress = new StudentAddress.Builder()
                .setStudentId(studentId)
                .setAddress(address)
                .build();
        return studentAddress;
    }
}
