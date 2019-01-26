package sut.se.team08.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.team08.entity.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByPassword(String password);
}
