package za.ac.cput.school_management.repository.city;

/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CountryRepository.java
*/
import za.ac.cput.school_management.domain.city.Country;
import za.ac.cput.school_management.repository.IRepository;
import java.util.List;

public interface CountryRepository extends IRepository<Country, String> {
    List<Country> findAll();

    List<Country> findByCountryId(String countryId);

}