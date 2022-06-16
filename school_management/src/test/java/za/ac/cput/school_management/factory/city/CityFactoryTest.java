package za.ac.cput.school_management.factory.city;
/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CityFactoryTest.java
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.city.Country;
import za.ac.cput.school_management.domain.city.City;

//import static org.junit.jupiter.api.Assertions.*;

public class CityFactoryTest {

    @Test
    void createCity() {

        Country country = CountryFactory.createCountry("0", "Canada");
        City name = CityFactory.createCity("0", "Toronto", country);
        System.out.println(name);
    }
}