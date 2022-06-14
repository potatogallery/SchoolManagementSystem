package za.ac.cput.school_management.factory.city;
/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CityFactory.java
*/
import za.ac.cput.school_management.domain.city.Country;
import za.ac.cput.school_management.domain.city.City;

public class CityFactory {

    public static City createCity(String cityId, String name, Country country) {

        City city = new City.Builder()
                .setCityId(cityId)
                .setName(name)
                .setCountry(country)
                .build();
        return city;
    }

}
