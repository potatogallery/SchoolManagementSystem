package za.ac.cput.school_management.factory.lookup;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Name;

import static org.junit.jupiter.api.Assertions.*;

/*
Lyle Haines - 217245919
ADP3 JUNE ASSIGNMENT
NameFactoryTest.java
*/

class NameFactoryTest {

    @Test
    void createName() {

        Name name = NameFactory.createName("George", "The", "Jungle");
        System.out.println(name);
    }
}