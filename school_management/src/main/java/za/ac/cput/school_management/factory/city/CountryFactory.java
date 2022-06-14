package za.ac.cput.school_management.factory.city;
/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CountryFactory.java
*/
import za.ac.cput.school_management.domain.city.Country;

public class CountryFactory {

    public static Country createCountry(String countryId, String name) {

        Country country = new Country.Builder()
                .setCountryId(countryId)
                .setName(name)
                .build();
        return country;
    }

}
