import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class smsUserTest {

    private smsUser user;

    @BeforeEach
    void setUp() throws Exception {
        // Initialize a new smsUser instance before each test
        user = new smsUser("Initial Name", "InitialPassword", "initial@example.com", "InitialDept");
    }

    @AfterEach
    void tearDown() throws Exception {
        // Set the smsUser instance to null after each test to clean up
        user = null;
    }

    @Test
    void testGetName() {
        user.setName("John Doe");
        assertEquals("John Doe", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("Jane Doe");
        assertEquals("Jane Doe", user.getName());
    }

    @Test
    void testGetPassword() {
        user.setPassword("password123");
        assertEquals("password123", user.getPassword());
    }

    @Test
    void testSetPassword() {
        user.setPassword("password456");
        assertEquals("password456", user.getPassword());
    }

    @Test
    void testGetEmail() {
        user.setEmail("johndoe@example.com");
        assertEquals("johndoe@example.com", user.getEmail());
    }

    @Test
    void testSetEmail() {
        user.setEmail("janedoe@example.com");
        assertEquals("janedoe@example.com", user.getEmail());
    }

    @Test
    void testGetDepartment() {
        user.setDepartment("HR");
        assertEquals("HR", user.getDepartment());
    }

    @Test
    void testSetDepartment() {
        user.setDepartment("IT");
        assertEquals("IT", user.getDepartment());
    }
}
