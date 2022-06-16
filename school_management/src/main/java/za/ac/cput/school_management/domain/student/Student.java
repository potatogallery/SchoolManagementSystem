package za.ac.cput.school_management.domain.student;

/*
Tyler Yorke Fredericks - 218047894
ADP3 JUNE ASSIGNMENT
Student.java
*/

import za.ac.cput.school_management.domain.lookup.Name;

public class Student {
    public String studentId;
    public String email;
    public Name name;

    public Student() {

    }

    private Student (Builder builder) {
        this.studentId = builder.studentId;
        this.email = builder.email;
        this.name = builder.name;
    }

    public String getStudentId() {
        return studentId;
    }

    private void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }

    public static class Builder{

        private String studentId;
        private String email;
        private Name name;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder copy(Student student) {
            this.studentId = student.studentId;
            this.email = student.email;
            this.name = student.name;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }
}
