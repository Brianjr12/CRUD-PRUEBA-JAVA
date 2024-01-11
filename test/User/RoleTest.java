package User;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {

    @Test
    void testToString() {
        Role roles = new Role(1,"programmer");
        String stringTest = "Role{id=1, name='programmer'}";

        assertEquals(stringTest, roles.toString());
    }
}