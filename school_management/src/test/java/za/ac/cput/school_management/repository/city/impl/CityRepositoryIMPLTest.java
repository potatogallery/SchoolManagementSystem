package za.ac.cput.school_management.repository.city.impl;

/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CityRepositoryIMPLTest.java
*/
//import org.checkerframework.checker.units.qual.A;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.city.City;
//import za.ac.cput.school_management.factory.city.CityFactory;
import za.ac.cput.school_management.repository.city.CityRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class CityRepositoryIMPLTest {

    private City city;
    private CityRepository repository;

    /*
     * @BeforeEach void setUp(){
     * this.city = CityFactory.build("test-cityId","test-name","test-Country");
     * this.repository = CityRepositoryIMPL.getCityList();
     * City create = this.repository.create(this.city);
     * City update = this.repository.update(this.city);
     * assertSame(this.city, create);
     * assertSame(this.city, update);
     * }
     * 
     * @AfterEach void tearDown(){
     * }
     */

    @Test
    void create() {
        City create = this.repository.create(this.city);
        System.out.println(create);
        assertNotNull(create);
        assertSame(this.city, create);
    }

    @Test
    void update() {
        City update = this.repository.update(this.city);
        System.out.println(update);
        assertNotNull(update);
        assertSame(this.city, update);
    }

    @Test
    void read() {
        // City create = this.repository.create(this.city);
        Optional<City> read = Optional.ofNullable(this.repository.read(this.city.getId()));
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.city, read.get()));
        System.out.println(read);
    }

    @Test
    void delete() {
        City create = this.repository.create(this.city);
        List<City> cityList = this.repository.findAll();
        assertEquals(0, cityList.size());
        this.repository.delete(String.valueOf(create));
    }

    @Test
    void findAll() {
        List<City> cityList = this.repository.findAll();
        assertEquals(1, cityList.size());
    }
}