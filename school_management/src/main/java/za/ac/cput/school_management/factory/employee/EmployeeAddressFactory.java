package za.ac.cput.school_management.factory.employee;

import za.ac.cput.school_management.domain.employee.EmployeeAddress;

public class EmployeeAddressFactory {

    public static EmployeeAddress createEmployeeAddress(String staffId, Address address) {

        EmployeeAddress employeeAddress = new EmployeeAddress.Builder()
                .setStaffId(staffId)
                .setAddress(address)
                .build();
        return employeeAddress;
    }
}
