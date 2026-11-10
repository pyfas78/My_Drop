package danilovich.dev.drop.service;

import danilovich.dev.drop.model.User;
import danilovich.dev.drop.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser() {
        User user = new User();
        user.setRating(5.0);
        return userRepository.save(user);
    }

}
