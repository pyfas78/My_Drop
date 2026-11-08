package danilovich.dev.drop.repository;

import danilovich.dev.drop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
