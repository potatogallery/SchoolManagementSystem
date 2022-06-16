/*
 * Keallan Saunders 219169357
 * ADP ASSIGNMENT JUNE 2022
 * AddressServiceIMPL.java
 * Due Date 18 June 2022 23:59
 *
 */
package za.ac.cput.school_management.service.lookup.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.repository.lookup.AddressRepository;
import za.ac.cput.school_management.repository.lookup.impl.AddressRepositoryIMPL;
import za.ac.cput.school_management.service.lookup.AddressService;

@Service
public class AddressServiceIMPL implements AddressService {

    private static AddressService addressService = null;
    private AddressRepository addressRepository;

    private AddressServiceIMPL(){
        this.addressRepository = (AddressRepository) AddressRepositoryIMPL.getAddressList();
    }

    public static AddressService getAddressService(){
        if (addressService == null) addressService = new AddressServiceIMPL();
        return addressService;
    }

    public Address create(Address address){
        return this.addressRepository.create(address);
    }
    public Address read(String a){return this.addressRepository.read(a);}

    public Address update(Address address){
        return this.addressRepository.update(address);
    }

    public void delete(String a){this.addressRepository.delete(a);}

}
