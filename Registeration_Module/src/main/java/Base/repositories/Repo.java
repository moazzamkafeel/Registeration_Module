package Base.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Base.entities.User;

public interface Repo extends JpaRepository<User, Long>{

}
