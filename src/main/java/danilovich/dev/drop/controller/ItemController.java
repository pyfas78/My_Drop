package danilovich.dev.drop.controller;

import danilovich.dev.drop.dto.ItemCreateRequestDto;
import danilovich.dev.drop.dto.ItemResponse;
import danilovich.dev.drop.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    private final ItemService itemService;
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ItemResponse createItem(@RequestBody ItemCreateRequestDto dto) {
        return itemService.createItem(dto);
    }

    @GetMapping
    public List<ItemResponse> getItems() {
        return itemService.getAllAvailable();
    }


    @GetMapping("/{id}")
    public ItemResponse getItem(@PathVariable Long id) {
        return itemService.getItemById(id);
    }
}
