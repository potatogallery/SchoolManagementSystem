package za.ac.cput.school_management.factory.city;

/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CityFactory.java
*/
import za.ac.cput.school_management.domain.city.Country;
import za.ac.cput.school_management.domain.city.City;
import za.ac.cput.school_management.helper.StringHelper;

public class CityFactory {

    public static City createCity(String id, String name, Country country) {
        if (StringHelper.isEmptyOrNull(id) || StringHelper.isEmptyOrNull(name)
                || StringHelper.isEmptyOrNull(country.getId()) || StringHelper.isEmptyOrNull(country.getName())) {
            if (id == null || id.isEmpty())
                throw new IllegalArgumentException("City id is required, null or empty found!");
            if (name == null || name.isEmpty())
                name = "";

        }

        City city = new City.Builder()
                .setId(id)
                .setName(name)
                .setCountry(country)
                .build();
        return city;
    }

}
