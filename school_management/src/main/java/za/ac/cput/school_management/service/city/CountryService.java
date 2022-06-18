package za.ac.cput.school_management.service.city;

import za.ac.cput.school_management.domain.city.Country;
import za.ac.cput.school_management.service.IService;
import java.util.List;

public interface CountryService extends IService<Country, String> {
    List<Country> findAll();

    // void deleteById(String id);
    List<Country> findByCountryId(String countryId);
}