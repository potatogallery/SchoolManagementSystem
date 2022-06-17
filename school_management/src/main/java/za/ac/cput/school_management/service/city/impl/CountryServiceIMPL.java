package za.ac.cput.school_management.service.city.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.city.Country;
import za.ac.cput.school_management.repository.city.CountryRepository;
import za.ac.cput.school_management.repository.city.impl.CountryRepositoryIMPL;
import za.ac.cput.school_management.service.city.CountryService;

@Service
public class CountryServiceIMPL implements CountryService {

    private static CountryService countryService = null;
    private CountryRepository countryRepository;

    private CountryServiceIMPL() {
        this.countryRepository = (CountryRepository) CountryRepositoryIMPL.getCountryList();
    }

    public static CountryService getCountryService() {
        if (countryService == null)
            countryService = new CountryServiceIMPL();
        return countryService;
    }

    public Country create(Country country) {
        return this.countryRepository.create(country);
    }

    public Country read(String a) {
        return this.countryRepository.read(a);
    }

    public Country update(Country country) {
        return this.countryRepository.update(country);
    }

    public void delete(String a) {
        this.countryRepository.delete(a);
    }

}
