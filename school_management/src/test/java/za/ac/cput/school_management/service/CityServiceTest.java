package za.ac.cput.school_management.service;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.city.City;
import za.ac.cput.school_management.factory.city.CityFactory;
import za.ac.cput.school_management.service.city.CityService;
import za.ac.cput.school_management.domain.city.Country;
import za.ac.cput.school_management.factory.city.CountryFactory;
import za.ac.cput.school_management.service.city.impl.CityServiceIMPL;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Optional;

//@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CityServiceTest {

    public final Country country = CountryFactory.createCountry("0", "Canada");
    public final City city = CityFactory.createCity("0", "Toronto", country);
    public String cityId = city.getId();
    @Autowired
    public CityService service = (CityService) CityServiceIMPL.getCityService();

    @Test
    @Order(1)
    void create() {
        City create = this.service.create(this.city);
        assertAll(
                () -> assertNotNull(create),
                () -> assertEquals(this.city, create));
        System.out.println(create);
    }

    @Test
    @Order(5)
    void delete() {
        // City create = this.service.create(this.city);
        this.service.delete(this.city.getId());

        List<City> cityList = this.service.findAll();
        assertEquals(0, cityList.size());
        System.out.println(cityList.size());
    }

    @Test
    @Order(2)
    void read() {
        Optional<City> read = Optional.ofNullable(this.service.read(this.city.getId()));
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.city.toString(), read.get().toString()));

        System.out.println(read.get());
    }

    @Test
    @Order(6)
    void findAll() {
        List<City> cityList = this.service.findAll();
        assertEquals(0, cityList.size());
    }

    @Test
    @Order(3)
    void findById() {
        // City create = this.service.create(this.city);
        String id = this.city.getCountry().getId();
        List<City> cityList = this.service.retrieveAllByCountry(id);
        System.out.println(cityList);
        assertSame(1, cityList.size());
    }

    @Test
    @Order(4)
    void update() {
        City update = this.service.update(this.city);
        System.out.println(update);
        assertNotNull(update);
        assertSame(this.city, update);
    }
}