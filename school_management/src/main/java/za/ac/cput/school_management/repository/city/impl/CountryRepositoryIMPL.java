package za.ac.cput.school_management.repository.city.impl;

import za.ac.cput.school_management.domain.city.Country;
import java.util.ArrayList;
import java.util.List;

public class CountryRepositoryIMPL {
    private final List<Country> CountryList;
    private static CountryRepositoryIMPL Country_REPOSITORY;

    private CountryRepositoryIMPL() {
        this.CountryList = new ArrayList<>();
    }

    public static CountryRepositoryIMPL getCountryList() {
        if (Country_REPOSITORY == null)
            Country_REPOSITORY = new CountryRepositoryIMPL();
        return Country_REPOSITORY;
    }

    public Country create(Country country) {
        this.CountryList.add(country);
        return country;
    }

    public Country read(String a) {
        return this.CountryList.stream().filter(g -> g.getId().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    public Country update(Country country) {
        Country a = read(country.getId());
        if (a != null) {
            delete(a.getId());
            return create(country);
        }
        return null;
    }

    public void delete(String a) {
        Country country = read(a);
        if (country != null)
            this.CountryList.remove(country);
    }

    public List<Country> findAll() {
        return this.CountryList;
    }
}