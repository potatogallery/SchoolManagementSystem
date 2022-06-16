/*
* Keallan Saunders 219169357
* ADP ASSIGNMENT JUNE 2022
* AddressRepository.java
* Due Date 18 June 2022 23:59
*
*/
package za.ac.cput.school_management.repository.lookup;

import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.repository.IRepository;

import java.util.List;

public interface AddressRepository extends IRepository <Address, String> {
    List<Address> findAll();
}
