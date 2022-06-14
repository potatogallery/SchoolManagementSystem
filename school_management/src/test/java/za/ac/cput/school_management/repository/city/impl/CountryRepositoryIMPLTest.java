package za.ac.cput.school_management.repository.city.impl;
/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CountryRepositoryIMPLTest.java
*/
//import org.checkerframework.checker.units.qual.A;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.city.Country;
//import za.ac.cput.school_management.factory.city.CountryFactory;
import za.ac.cput.school_management.repository.city.CountryRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class CountryRepositoryIMPLTest {

    private Country country;
    private CountryRepository repository;

    /*
     * @BeforeEach void setUp(){
     * this.country = CountryFactory.build("test-countryId","test-name");
     * this.repository = CountryRepositoryIMPL.getCountryList();
     * Country create = this.repository.create(this.country);
     * Country update = this.repository.update(this.country);
     * assertSame(this.country, create);
     * assertSame(this.country, update);
     * }
     * 
     * @AfterEach void tearDown(){
     * }
     */

    @Test
    void create() {
        Country create = this.repository.create(this.country);
        System.out.println(create);
        assertNotNull(create);
        assertSame(this.country, create);
    }

    @Test
    void update() {
        Country update = this.repository.update(this.country);
        System.out.println(update);
        assertNotNull(update);
        assertSame(this.country, update);
    }

    @Test
    void read() {
        Country create = this.repository.create(this.country);
        Optional<Country> read = Optional.ofNullable(this.repository.read(this.country.getCountryId()));
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.country, read.get()));
        System.out.println(read);
    }

    @Test
    void delete() {
        Country create = this.repository.create(this.country);
        List<Country> countryList = this.repository.findAll();
        assertEquals(0, countryList.size());
        this.repository.delete(String.valueOf(create));
    }

    @Test
    void findAll() {
        List<Country> countryList = this.repository.findAll();
        assertEquals(1, countryList.size());
    }
}