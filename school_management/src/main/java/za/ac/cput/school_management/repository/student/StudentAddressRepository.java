package za.ac.cput.school_management.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.school_management.domain.Lookup.Name;
import org.springframework.stereotype.Repository;

public interface StudentAddressRepository extends IRepository <StudentAddress, String> {
}
