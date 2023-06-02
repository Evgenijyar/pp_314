package web.util;

import web.models.Role;
import web.models.User;
import web.services.UserService;

// @Component
public class DataBaseInit {

    private final UserService userService;

 //   @Autowired
    public DataBaseInit(UserService userService) {
        this.userService = userService;
    }

//   @PostConstruct
    private void postConstruct() {
        User admin = new User("admin", "admin",
                1988, "admin@mail.ru", "admin",
                new Role("ROLE_ADMIN"));
        User user = new User("user", "user",
                1988, "user@mail.ru", "user",
                new Role("ROLE_USER"));
        userService.saveUser(admin);
        userService.saveUser(user);
    }
}
