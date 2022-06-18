package za.ac.cput.school_management.service.city.impl;

import org.springframework.stereotype.Service;

import za.ac.cput.school_management.domain.city.City;
import za.ac.cput.school_management.domain.city.Country;

//import za.ac.cput.school_management.repository.city.CountryRepository;
import za.ac.cput.school_management.repository.city.CityRepository;

//import za.ac.cput.school_management.repository.city.impl.CountryRepositoryIMPL;
import za.ac.cput.school_management.repository.city.impl.CityRepositoryIMPL;

import za.ac.cput.school_management.service.city.CityService;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<City> findAll() {
        return this.cityRepository.findAll();
    }

    @Override
    public City create(City city) {
        return this.cityRepository.create(city);// (create or save?)
    }

    @Override
    public List<City> retrieveAllByCountry(String id) {
        return this.cityRepository.retrieveAllByCountry(id);

    }

    @Override
    public City read(String a) {
        return this.cityRepository.read(a);
    }
    // @Override
    // public Optional<City> read(String id) {
    // Optional<Student> optionalStudent
    // return this.cityRepository.findById(id);
    // }

    @Override
    public City update(City city) {
        return this.cityRepository.update(city);
    }

    @Override
    public void delete(String a) {
        this.cityRepository.delete(a);
    }

}
