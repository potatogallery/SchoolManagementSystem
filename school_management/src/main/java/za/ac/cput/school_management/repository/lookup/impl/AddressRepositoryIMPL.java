/*
* Keallan Saunders 219169357
* ADP ASSIGNMENT JUNE 2022
* AddressRepositoryIMPL.java
* Due Date 18 June 2022 23:59
*
*/
package za.ac.cput.school_management.repository.lookup.impl;

import za.ac.cput.school_management.domain.lookup.Address;

import java.util.ArrayList;
import java.util.List;

public class AddressRepositoryIMPL {
    private final List<Address> AddressList;
    private static AddressRepositoryIMPL ADDRESS_REPOSITORY;

    private AddressRepositoryIMPL(){this.AddressList= new ArrayList<>();}

    public static AddressRepositoryIMPL getAddressList(){
        if(ADDRESS_REPOSITORY == null)
            ADDRESS_REPOSITORY = new AddressRepositoryIMPL();
        return ADDRESS_REPOSITORY;
    }


    public Address create(Address address){
        this.AddressList.add(address);
        return address;
    }

    public Address read(String a){
        return this.AddressList.stream().filter(g -> g.getUnitNumber().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    public Address update(Address address){
        Address a = read(address.getUnitNumber());
        if(a != null){
            delete(a.getUnitNumber());
            return create(address);
        }
        return null;
    }
    public void delete(String a){
        Address address = read(a);
        if(address != null) this.AddressList.remove(address);
    }

    public List<Address> findAll(){
        return this.AddressList;
    }
}
