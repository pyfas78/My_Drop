package danilovich.dev.drop.dto;

public record UserCreateRequestDto(
        String username,
        String telegramHandler,
        String phone,
        String city
) {
}
