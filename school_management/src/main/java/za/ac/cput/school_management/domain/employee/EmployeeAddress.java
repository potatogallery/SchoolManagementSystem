package za.ac.cput.school_management.domain.employee;

/*
    EmployeeAddress.java
    Entity for the EmployeeAddress
    Wajedien Samuels (216287820)
    10 June 2022
 */

import za.ac.cput.school_management.domain.lookup.Address;

import java.util.Objects;

public class EmployeeAddress {

    private String staffId;
    private Address address;

    private EmployeeAddress(Builder builder) {
        this.staffId = builder.staffId;
        this.address = builder.address;
    }

    public String getStaffId() {
        return staffId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "staffId='" + staffId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {

        private String staffId;
        private Address address;

        public Builder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder copy(EmployeeAddress employeeAddress) {
            this.staffId = employeeAddress.staffId;
            this.address = employeeAddress.address;
            return this;
        }

        public EmployeeAddress build() {return new EmployeeAddress(this);}
    }
}

