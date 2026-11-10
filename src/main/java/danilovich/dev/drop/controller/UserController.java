package danilovich.dev.drop.controller;

import danilovich.dev.drop.dto.ItemCreateRequestDto;
import danilovich.dev.drop.dto.ItemResponse;
import danilovich.dev.drop.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public User createUser()
    }
}
