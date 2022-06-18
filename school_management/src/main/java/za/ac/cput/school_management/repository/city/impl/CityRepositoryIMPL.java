package za.ac.cput.school_management.repository.city.impl;

import za.ac.cput.school_management.repository.city.CityRepository;
import za.ac.cput.school_management.domain.city.City;
//import za.ac.cput.school_management.domain.city.Country;

import java.util.ArrayList;
import java.util.List;

public class CityRepositoryIMPL implements CityRepository {
    private final List<City> CityList;
    private static CityRepositoryIMPL City_REPOSITORY;

    private CityRepositoryIMPL() {
        this.CityList = new ArrayList<>();
    }

    @Override
    public List<City> retrieveAllByCountry(String id) {
        List<City> cityInCountryList = new ArrayList<>();
        List<City> cityList = findAll();
        for (City city : cityList) {
            if (city.getCountry().getId().equals(id))
                cityInCountryList.add(city);
        }
        return cityInCountryList;
    }

    public static CityRepositoryIMPL getCityList() {
        if (City_REPOSITORY == null)
            City_REPOSITORY = new CityRepositoryIMPL();
        return City_REPOSITORY;
    }

    @Override
    public City create(City city) {
        this.CityList.add(city);
        return city;
    }

    @Override
    public City read(String a) {
        return this.CityList.stream().filter(g -> g.getId().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    @Override
    public City update(City city) {
        City a = read(city.getId());
        if (a != null) {
            delete(a.getId());
            return create(city);
        }
        return null;
    }

    @Override
    public void delete(String a) {
        City city = read(a);
        if (city != null)
            this.CityList.remove(city);
    }

    @Override
    public List<City> findAll() {
        return this.CityList;
    }

    @Override
    public City findById(String id) {
        List<City> cityList = findAll();
        for (City city : cityList) {
            if (city.getId().equalsIgnoreCase(id))
                return city;
        }
        return null;
    }
}
