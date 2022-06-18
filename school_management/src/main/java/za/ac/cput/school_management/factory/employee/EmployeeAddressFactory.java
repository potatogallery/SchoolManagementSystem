package za.ac.cput.school_management.factory.employee;

import org.apache.tomcat.jni.Address;
import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.domain.lookup.Address;

public class EmployeeAddressFactory {

    public static EmployeeAddress createEmployeeAddress(String staffId, Address address) {

        EmployeeAddress employeeAddress = new EmployeeAddress.Builder()
                .setStaffId(staffId)
                .setAddress(address)
                .build();
        return employeeAddress;
    }
}
