package za.ac.cput.school_management.repository.city.impl;

import za.ac.cput.school_management.domain.city.City;

import java.util.ArrayList;
import java.util.List;

public class CityRepositoryIMPL {
    private final List<City> CityList;
    private static CityRepositoryIMPL City_REPOSITORY;

    private CityRepositoryIMPL() {
        this.CityList = new ArrayList<>();
    }

    public static CityRepositoryIMPL getCityList() {
        if (City_REPOSITORY == null)
            City_REPOSITORY = new CityRepositoryIMPL();
        return City_REPOSITORY;
    }

    public City create(City city) {
        this.CityList.add(city);
        return city;
    }

    public City read(String a) {
        return this.CityList.stream().filter(g -> g.getId().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    public City update(City city) {
        City a = read(city.getId());
        if (a != null) {
            delete(a.getId());
            return create(city);
        }
        return null;
    }

    public void delete(String a) {
        City city = read(a);
        if (city != null)
            this.CityList.remove(city);
    }

    public List<City> findAll() {
        return this.CityList;
    }

}
