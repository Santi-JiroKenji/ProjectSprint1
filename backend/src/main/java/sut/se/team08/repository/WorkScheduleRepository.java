package sut.se.team08.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.team08.entity.WorkSchedule;

@RepositoryRestResource
public interface WorkScheduleRepository extends JpaRepository<WorkSchedule, Long>{
	WorkSchedule findById(long scheduleId);
}
