package sut.se.team08.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.team08.entity.StaffPosition;

@RepositoryRestResource
public interface StaffPositionRepository extends JpaRepository<StaffPosition, Long> {
    StaffPosition findById(long staffPositId);
}
