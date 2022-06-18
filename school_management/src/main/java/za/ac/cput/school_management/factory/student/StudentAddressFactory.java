package za.ac.cput.school_management.factory.student;



import org.apache.tomcat.jni.Address;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.domain.student.StudentAddress;

/*
    StudentAddress.java
    Entity for the StudentAddress
    Zavian Minnies (217230458)
    14 June 2022
 */

public class StudentAddressFactory {


    public static StudentAddress createStudentAddress(String studentId, Address address) {

        StudentAddress studentAddress = new StudentAddress.Builder()
                .setStudentId(studentId)
                .setAddress(address)
                .build();
        return studentAddress;
    }

}
