package danilovich.dev.drop.repository;

import danilovich.dev.drop.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
