package za.ac.cput.school_management.repository.city;
/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
CityRepository.java
*/
import za.ac.cput.school_management.domain.city.City;
import za.ac.cput.school_management.repository.IRepository;
import java.util.List;

public interface CityRepository extends IRepository<City, String> {
    List<City> findAll();
}
