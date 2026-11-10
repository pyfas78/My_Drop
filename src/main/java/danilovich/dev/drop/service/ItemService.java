package danilovich.dev.drop.service;

import danilovich.dev.drop.dto.ItemCreateRequestDto;
import danilovich.dev.drop.dto.ItemResponse;
import danilovich.dev.drop.model.Item;
import danilovich.dev.drop.model.User;
import danilovich.dev.drop.model.enums.ItemStatus;
import danilovich.dev.drop.repository.ItemRepository;
import danilovich.dev.drop.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;
    private final UserRepository userRepository;

    public ItemService(ItemRepository itemRepository, UserRepository userRepository) {
        this.itemRepository = itemRepository;
        this.userRepository = userRepository;
    }

    public List<ItemResponse> getAllAvailable() {
     return itemRepository.findByStatus(ItemStatus.AVAILABLE)
             .stream()
             .map(ItemResponse::fromEntity)
             .toList();
    }

    public ItemResponse createItem(ItemCreateRequestDto dto) {
        User seller = userRepository.findById(dto.sellerId())
                .orElseThrow(() -> new RuntimeException("User not found"));
        Item item = new Item(dto.title(), dto.description(), dto.price(), dto.brand(), dto.category(), dto.size(),
                dto.sellerId(), dto.chestWidth(), dto.totalLength(), dto.shoulderWidth(), dto.sleeveLength(),
                dto.insoleLength(), dto.images(), dto.gender(), dto.condition());
        item.setStatus(ItemStatus.AVAILABLE);
        Item savedItem = itemRepository.save(item);
        return ItemResponse.fromEntity(savedItem);
    }

    public ItemResponse getItemById(Long id) {
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        item.setViewsCount(item.getViewsCount() + 1);
        itemRepository.save(item);
        return ItemResponse.fromEntity(item);
    }
}
