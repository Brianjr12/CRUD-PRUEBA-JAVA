package User;

import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserServiceTest {
    private UserService userService;
    private User user, user2, user3;

    @BeforeEach
    void setUp(){
        userService = new UserService();
        user = new User(1,"Brian","Ojeda","brianojeda1204@gmail.com","62487101");
        user2 = new User(2,"Leo","Messi","leomessi456@gmail.com","38373");
        user3 =  new User(3,"Midu","Dev","midudev678@gmail.com","344767");
        userService.save(user);
        userService.save(user2);
        userService.save(user3);
    }

    @org.junit.jupiter.api.Test
    void getUserById() {
        User user1 = userService.getUserById(1);
        assertEquals(user1,user);
    }

    @org.junit.jupiter.api.Test
    void save() {
        User user4 = new User(4,"Midu","Dev","midudev678@gmail.com","344767");
        String saveResult = userService.save(user4);
        assertEquals("The user was saved successfully",saveResult);
        assertEquals(user4,userService.getUserById(4));
    }

    @org.junit.jupiter.api.Test
    void delete() {
        String deleteResult = userService.delete(2);

        assertEquals("The user with id=2 ,was deleted",deleteResult);
        assertFalse(userService.getAll().contains(user2));
    }

    @org.junit.jupiter.api.Test
    void getAll() {
        List<User> users = userService.getAll();
        assertEquals(3, users.size());
        assertTrue(users.contains(user));
        assertTrue(users.contains(user2));
        assertTrue(users.contains(user3));
    }
}
