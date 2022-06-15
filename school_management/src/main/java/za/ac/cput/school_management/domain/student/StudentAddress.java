package za.ac.cput.school_management.domain.student;

import za.ac.cput.school_management.domain.lookup.Address;

import java.util.Objects;

public class StudentAddress {

    private String studentId;
    private Address address;

    private StudentAddress(Builder builder) {
        this.studentId = builder.studentId;
        this.address = builder.address;
    }

    public String getStudentId() {
        return studentId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "studentId='" + studentId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {

        private String studentId;
        private Address address;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder copy(StudentAddress studentAddress) {
            this.studentId = studentAddress.studentId;
            this.address = studentAddress.address;
            return this;
        }

        public StudentAddress build() {return new StudentAddress(this);}
    }
}
