package danilovich.dev.drop.dto;

import danilovich.dev.drop.model.enums.Condition;
import danilovich.dev.drop.model.enums.Gender;

import java.math.BigDecimal;
import java.util.List;

public record ItemCreateRequestDto(
        String title, String description, BigDecimal price, String brand, String category, String size, Long sellerId,
        Integer chestWidth, Integer totalLength, Integer shoulderWidth,
        Integer sleeveLength, Double insoleLength, List<String> images, Gender gender, Condition condition
) {
}
