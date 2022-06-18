package za.ac.cput.school_management.service.city;

import za.ac.cput.school_management.domain.city.City;
import za.ac.cput.school_management.service.IService;
import java.util.List;
//import za.ac.cput.school_management.domain.city.Country;

public interface CityService extends IService<City, String> {

    List<City> retrieveAllByCountry(String id);

    List<City> findAll();

}