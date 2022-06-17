package za.ac.cput.school_management.service.city.impl;

import org.springframework.stereotype.Service;

import za.ac.cput.school_management.domain.city.City;
//import za.ac.cput.school_management.domain.city.Country;

//import za.ac.cput.school_management.repository.city.CountryRepository;
import za.ac.cput.school_management.repository.city.CityRepository;

//import za.ac.cput.school_management.repository.city.impl.CountryRepositoryIMPL;
import za.ac.cput.school_management.repository.city.impl.CityRepositoryIMPL;

import za.ac.cput.school_management.service.city.CityService;

@Service
public class CityServiceIMPL implements CityService {

    private static CityService cityService = null;
    private CityRepository cityRepository;

    private CityServiceIMPL() {
        this.cityRepository = (CityRepository) CityRepositoryIMPL.getCityList();
    }

    public static CityService getCityService() {
        if (cityService == null)
            cityService = new CityServiceIMPL();
        return cityService;
    }

    public City create(City city) {
        return this.cityRepository.create(city);
    }

    public City read(String a) {
        return this.cityRepository.read(a);
    }

    public City update(City city) {
        return this.cityRepository.update(city);
    }

    public void delete(String a) {
        this.cityRepository.delete(a);
    }

}
