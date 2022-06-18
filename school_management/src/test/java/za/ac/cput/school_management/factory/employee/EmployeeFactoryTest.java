package za.ac.cput.school_management.factory.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.factory.lookup.NameFactory;
import za.ac.cput.school_management.domain.lookup.Name;

import javax.lang.model.element.Name;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    Employee employee1,employee2;

    @BeforeEach
    void setUp() {
        employee1 = new Employee.Builder().setStaffId("3746")
                .setEmail("HondeOnTheLoose@gmail.com").build();
        Name person = NameFactory.createName("Laanie" , "Dussen" , "De Bruyne");

        Employee employee2 = employee1;
    }

    @Test
    void BuildWithSuccess() {

        Name person = new Name.Builder().setFirstName("Laanie").setLastName("De Bruyn");
        Employee employee = EmployeeFactory.createEmployee("3746", "HondeOnTheLoose@gmail.com", person);

        System.out.println(employee1);
    }

    @Test
    void buildWithError() {
        Name person = new Name.Builder().setFirstName("Laanie").setLastName("De Bruyne").build();

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                EmployeeFactory.createEmployee(null,"HondeOnTheLoose@gmail.com", person));

        String exceptionMessage = exception.getMessage();
    }

    @Test
    void buildWithIdenticalValue()  {
        assertSame(employee1,employee2);
        System.out.println("Is indeed Identical");
    }


}