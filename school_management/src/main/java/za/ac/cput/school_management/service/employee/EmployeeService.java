package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.employee.Employee;

import java.util.List;
import za.ac.cput.school_management.service.Iservice;

public interface EmployeeService extends Iservice<Employee, String> {

    List<Employee> getAll(String staffId);
    void deleteById(String staffId);

    boolean valEmail (String input);
}