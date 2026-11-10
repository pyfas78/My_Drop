package danilovich.dev.drop.service;

import danilovich.dev.drop.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
