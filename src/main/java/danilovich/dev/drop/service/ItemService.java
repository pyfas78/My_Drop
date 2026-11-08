package danilovich.dev.drop.service;

import danilovich.dev.drop.dto.ItemResponse;
import danilovich.dev.drop.model.enums.ItemStatus;
import danilovich.dev.drop.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<ItemResponse> getAllAvailable() {
     itemRepository.findByStatus(ItemStatus.AVAILABLE);
     return;
    }
}
