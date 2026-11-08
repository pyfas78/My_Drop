package danilovich.dev.drop.repository;

import danilovich.dev.drop.model.Item;
import danilovich.dev.drop.model.enums.ItemStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByStatus(ItemStatus status);
    List<Item> findBySellerId(Long sellerId);
}
