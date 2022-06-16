/*
 * Keallan Saunders 219169357
 * ADP ASSIGNMENT JUNE 2022
 * AddressRepositoryIMPLTest.java
 * Due Date 18 June 2022 23:59
 *
 */
package za.ac.cput.school_management.repository.lookup.impl;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.factory.lookup.AddressFactory;
import za.ac.cput.school_management.repository.lookup.AddressRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AddressRepositoryIMPLTest {

    private Address address;
    private AddressRepository repository;

    /*@BeforeEach void setUp(){
        this.address = AddressFactory.build("test-unitNumber","test-complexName","test-StreetNumber",
                "test-StreetName","test-City");
        this.repository = AddressRepositoryIMPL.getAddressList();
        Address create = this.repository.create(this.address);
        Address update = this.repository.update(this.address);
        assertSame(this.address, create);
        assertSame(this.address, update);
    }
    @AfterEach void tearDown(){

    }*/


    @Test
    void create() {
        Address create = this.repository.create(this.address);
        System.out.println(create);
        assertNotNull(create);
        assertSame(this.address, create);
    }

    @Test
    void update() {
        Address update = this.repository.update(this.address);
        System.out.println(update);
        assertNotNull(update);
        assertSame(this.address, update);
    }

    @Test
    void read() {
        Address create = this.repository.create(this.address);
        Optional<Address> read = Optional.ofNullable(this.repository.read(this.address.getUnitNumber()));
        /*Optional<Address> read = this.repository.read(this.address.getUnitNumber());*/
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.address, read.get())
        );
        System.out.println(read);
    }

    @Test
    void delete() {
        Address create = this.repository.create(this.address);
        List<Address> addressList = this.repository.findAll();
        assertEquals(0,addressList.size());
        this.repository.delete(String.valueOf(create));
    }
    @Test
    void findAll(){
        List<Address> addressList= this.repository.findAll();
        assertEquals(1,addressList.size());
    }
}