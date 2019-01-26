package sut.se.team08.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.team08.entity.HealthLab;

@RepositoryRestResource
public interface HealthLabRepository extends JpaRepository<HealthLab, Long> {
    HealthLab findById(long sid);
}
