package Base.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Base.entities.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
