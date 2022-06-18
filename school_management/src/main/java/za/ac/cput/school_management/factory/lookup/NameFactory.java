package za.ac.cput.school_management.factory.lookup;

import za.ac.cput.school_management.domain.lookup.Name;

import javax.lang.model.element.Name;

/*
Lyle Haines - 217245919
ADP3 JUNE ASSIGNMENT
NameFactory.java
*/

public class NameFactory {

    public static Name createName(String firstName, String middleName, String lastName) {

        Name name = new Name.Builder().setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
        return name;
    }
}
