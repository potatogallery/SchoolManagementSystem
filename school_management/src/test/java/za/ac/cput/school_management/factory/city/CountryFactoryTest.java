package za.ac.cput.school_management.factory.city;

/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CountryFactoryTest.java
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.city.Country;
//import za.ac.cput.school_management.factory.city.CountryFactory;
import static org.junit.jupiter.api.Assertions.*;

public class CountryFactoryTest {
    // test 1
    @Test
    void createCountry() {

        Country name = CountryFactory.createCountry("0", "Canada");
        System.out.println("Test 1-createCountry: " + name);
    }

    @Test
    void buildNullCountry() {

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> CountryFactory.createCountry(null, null));
        String exceptionMessage = exception.getMessage();
        System.out.println("Test 2-buildNullCountry: " + exceptionMessage);
        assertSame("Country id is required, null or empty found!", exceptionMessage);

    }

    @Test
    void buildEmptyCountry() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> CountryFactory.createCountry("", ""));
        String exceptionMessage = exception.getMessage();
        System.out.println("Test 3-buildEmptyCountry: " + exceptionMessage);
        assertSame("Country id is required, null or empty found!", exceptionMessage);

    }

    @Test
    void buildNullName() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> CountryFactory.createCountry(null, "Canada"));
        String exceptionMessage = exception.getMessage();
        System.out.println("Test 4-buildNullName: " + exceptionMessage);
        assertSame("Country id is required, null or empty found!", exceptionMessage);
    }

    @Test
    void buildIdNull() {

        Country name = CountryFactory.createCountry("0", null);
        System.out.println("Test 5-buildIdNull: " + name);
        assertNotNull(name);
    }

    @Test
    void buildIdEmpty() {

        Country name = CountryFactory.createCountry("0", "");
        System.out.println("Test 6-buildIdEmpty: " + name);
        assertNotNull(name);
    }
}