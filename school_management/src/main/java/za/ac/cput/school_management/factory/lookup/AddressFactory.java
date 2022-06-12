/*
 *Keallan Saunders 219169357
 * ADP ASSIGNMENT JUNE 2022
 * AddressFactory.java
 * Due Date 18 June 2022 23:59
 * */
package za.ac.cput.school_management.factory.lookup;

import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.helper.StringHelper;
public class AddressFactory {

    public static Address build(String unitNumber,String complexName, String streetNumber, String streetName, String city){
        StringHelper.checkStringParam("unitNumber", unitNumber);
        StringHelper.checkStringParam("complexName", complexName);
        StringHelper.checkStringParam("streetNumber", streetNumber);
        StringHelper.checkStringParam("streetName", streetName);
        StringHelper.checkStringParam("city", city);

        return new Address.Builder().unitNumber(unitNumber).complexName(complexName)
                .streetNumber(streetNumber).streetName(streetName).city(city).build();
    }

}
