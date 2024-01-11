package User;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void testAddRole() {
        User user = new User(1, "brian", "ojeda", "brianojeda1204@gmail.com", "62487101");
        Role roles = new Role(1, "programmer");

        user.addRole(roles);
        assertEquals(1, user.getRoles().size());
        assertEquals(roles, user.getRoles().get(0));
    }

    @org.junit.jupiter.api.Test
    void testToString1() {
        User user = new User(1, "brian", "ojeda", "brianojeda1204@gmail.com", "62487101");
        Role roles = new Role(1, "programmer");

        user.addRole(roles);

        String stringTest = "User{id=1, First name='brian', Last name='ojeda', Email='brianojeda1204@gmail.com', " + "Phone='62487101', Roles=[Role{id=1, name='programmer'}]}";
        assertEquals(stringTest, user.toString());
    }
}