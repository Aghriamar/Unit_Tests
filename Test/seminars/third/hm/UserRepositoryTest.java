package seminars.third.hm;
import org.junit.jupiter.api.Test;
import seminars.third.tdd.User;
import seminars.third.tdd.UserRepository;

import static org.junit.jupiter.api.Assertions.*;
public class UserRepositoryTest {

    @Test
    public void testLogoutAllUsers() {
        UserRepository repository = new UserRepository();
        User adminUser = new User("admin", "adminPassword", true);
        User regularUser1 = new User("user1", "password1", false);
        User regularUser2 = new User("user2", "password2", false);

        repository.addUser(adminUser);
        repository.addUser(regularUser1);
        repository.addUser(regularUser2);

        assertTrue(adminUser.getIsAuthenticated());
        assertTrue(regularUser1.getIsAuthenticated());
        assertTrue(regularUser2.getIsAuthenticated());

        repository.logoutNonAdminUsers();

        assertFalse(adminUser.getIsAuthenticated());
        assertFalse(regularUser1.getIsAuthenticated());
        assertFalse(regularUser2.getIsAuthenticated());
    }
}
