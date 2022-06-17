package za.ac.cput.school_management.factory.city;

/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CountryFactory.java
*/
import za.ac.cput.school_management.domain.city.Country;
import za.ac.cput.school_management.helper.StringHelper;

public class CountryFactory {

    public static Country createCountry(String id, String name) {
        if (StringHelper.isEmptyOrNull(id) || StringHelper.isEmptyOrNull(name)) {
            if (id == null || id.isEmpty())
                throw new IllegalArgumentException("Country id is required, null or empty found!");
            if (name == null || name.isEmpty())

                name = "";
        }
        Country country = new Country.Builder()
                .setId(id)
                .setName(name)
                .build();
        return country;
    }

}
