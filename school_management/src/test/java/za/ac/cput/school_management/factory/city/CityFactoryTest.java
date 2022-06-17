package za.ac.cput.school_management.factory.city;

/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CityFactoryTest.java
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.city.Country;
import za.ac.cput.school_management.domain.city.City;

import static org.junit.jupiter.api.Assertions.*;

public class CityFactoryTest {

    @Test
    void createCity() {

        Country country = CountryFactory.createCountry("0", "Canada");
        City name = CityFactory.createCity("0", "Toronto", country);
        System.out.println("Test 1 createCity: " + name);
    }

    @Test
    public void buildEmptyCity() {
        Country country = CountryFactory.createCountry("0", "Canada");

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> CityFactory.createCity("", "", country));
        String exceptionMessage = exception.getMessage();
        System.out.println("Test 2-buildEmptyCity: " + exceptionMessage);

        assertSame("City id is required, null or empty found!", exceptionMessage);
    }

    @Test
    void buildNullCity() {
        Country country = CountryFactory.createCountry("0", "Canada");

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> CityFactory.createCity(null, null, country));
        String exceptionMessage = exception.getMessage();
        System.out.println("Test 3-buildNullCity: " + exceptionMessage);

        assertSame("City id is required, null or empty found!", exceptionMessage);

    }

    @Test
    void buildNullId() {
        Country country = CountryFactory.createCountry("0", "Canada");

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> CityFactory.createCity(null, "Toronto", country));
        String exceptionMessage = exception.getMessage();
        System.out.println("Test 4-buildNullId: " + exceptionMessage);

        assertSame("City id is required, null or empty found!", exceptionMessage);
    }

    @Test
    void buildNullName() {

        Country country = CountryFactory.createCountry("0", "Canada");
        City name = CityFactory.createCity("1", null, country);
        System.out.println("Test 5- nuildNullName: " + name);
        assertNotNull(country);
    }
}