package danilovich.dev.drop.service;

import danilovich.dev.drop.dto.UserCreateRequestDto;
import danilovich.dev.drop.model.User;
import danilovich.dev.drop.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserCreateRequestDto dto) {
        User user = new User();
        user.setUsername(dto.username());
        user.setCity(dto.city());
        user.setRating(5.0);
        user.setPhone(dto.phone());
        user.setCreatedAt(LocalDate.now());
        user.setTelegramHandle(dto.telegramHandler());
        return userRepository.save(user);
    }

}
