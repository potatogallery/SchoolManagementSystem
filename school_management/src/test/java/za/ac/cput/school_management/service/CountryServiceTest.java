package za.ac.cput.school_management.service;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.city.Country;
import za.ac.cput.school_management.factory.city.CountryFactory;
import za.ac.cput.school_management.service.city.CountryService;
import za.ac.cput.school_management.service.city.impl.CountryServiceIMPL;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Optional;

//@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CountryServiceTest {

    public final Country country = CountryFactory.createCountry("0", "Canada");
    @Autowired
    public CountryService service = (CountryService) CountryServiceIMPL.getCountryService();

    @Test
    @Order(1)
    void create() {
        Country create = this.service.create(this.country);
        assertAll(
                () -> assertNotNull(create),
                () -> assertEquals(this.country, create));
        System.out.println(create);
    }

    @Test
    @Order(5)
    void delete() {
        // City create = this.service.create(this.city);
        this.service.delete(this.country.getId());

        List<Country> countryList = this.service.findAll();
        assertEquals(0, countryList.size());
        System.out.println(countryList.size());
    }

    @Test
    @Order(2)
    void read() {
        Optional<Country> read = Optional.ofNullable(this.service.read(this.country.getId()));
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.country.toString(), read.get().toString()));

        System.out.println(read.get());
    }

    @Test
    @Order(6)
    void findAll() {
        List<Country> countryList = this.service.findAll();
        assertEquals(0, countryList.size());
    }

    @Test
    @Order(3)
    void findById() {
        // City create = this.service.create(this.city);
        String id = this.country.getId();
        List<Country> countryList = this.service.findByCountryId(id);
        System.out.println(countryList);
        assertSame(1, countryList.size());
    }

    @Test
    @Order(4)
    void update() {
        Country update = this.service.update(this.country);
        System.out.println(update);
        assertNotNull(update);
        assertSame(this.country, update);
    }
}