package danilovich.dev.drop.dto;

import danilovich.dev.drop.model.Item;
import danilovich.dev.drop.model.enums.Condition;
import danilovich.dev.drop.model.enums.Gender;
import danilovich.dev.drop.model.enums.ItemStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record ItemResponse(
        Long id,
        String title,
        String description,
        BigDecimal price,
        String brand,
        String category,
        String size,
        ItemStatus status,
        Gender gender,
        Condition condition,
        Integer chestWidth,
        Integer totalLength,
        Integer shoulderWidth,
        Integer sleeveLength,
        Double insoleLength,
        List<String> images,
        int viewCounts,
        LocalDateTime createdAt,

        Long sellerId,
        String sellerUsername,
        String sellerCity,
        Double sellerRating
) {
    public static ItemResponse fromEntity(Item item) {
        return new ItemResponse(
                item.getId(),
                item.getTitle(),
                item.getDescription(),
                item.getPrice(),
                item.getBrand(),
                item.getCategory(),
                item.getSize(),
                item.getStatus(),
                item.getGender(),
                item.getCondition(),
                item.getChestWidth(),
                item.getTotalLength(),
                item.getShoulderWidth(),
                item.getSleeveLength(),
                item.getInsoleLength(),
                item.getImages(),
                item.getViewsCount(),
                item.getCreatedAt(),
                item.getSeller().getId(),
                item.getSeller().getUsername(),
                item.getSeller().getCity(),
                item.getSeller().getRating()
        );
    }
}
