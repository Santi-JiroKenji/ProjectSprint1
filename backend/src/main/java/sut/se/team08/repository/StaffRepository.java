package sut.se.team08.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.team08.entity.Staff;

@RepositoryRestResource
public interface StaffRepository extends JpaRepository<Staff, Long> {
    Staff findById(long staffId);
}
