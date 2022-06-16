package za.ac.cput.school_management.factory.city;
/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CountryFactoryTest.java
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.city.Country;
//import za.ac.cput.school_management.factory.city.CountryFactory;
//import static org.junit.jupiter.api.Assertions.*;

public class CountryFactoryTest {

    @Test
    void createCountry() {

        Country name = CountryFactory.createCountry("0", "Canada");
        System.out.println(name);
    }
}