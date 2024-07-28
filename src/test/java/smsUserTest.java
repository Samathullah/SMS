import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class smsUserTest {

    private smsUser user;

    @BeforeEach
    void setUp() throws Exception {
        // Initialize a new smsUser instance before each test
        user = new smsUser("Name", "Password", "dvops@email.com", "Department");
    }

    @AfterEach
    void tearDown() throws Exception {
        // Set the smsUser instance to null after each test to clean up
        user = null;
    }

    @Test
    void testGetName() {
        user.setName("sama");
        assertEquals("sama", user.getName());
    }

    //@Test
    //void testSetName() {
        //user.setName("sama");
        //assertEquals("sama", user.getName());
    //}

    @Test
    void testGetPassword() {
        user.setPassword("password");
        assertEquals("password", user.getPassword());
    }

    //@Test
    //void testSetPassword() {
       // user.setPassword("password");
        //assertEquals("password", user.getPassword());
    //}

    @Test
    void testGetEmail() {
        user.setEmail("dvops@email.com");
        assertEquals("dvops@email.com", user.getEmail());
    }

    //@Test
   // void testSetEmail() {
     //  user.setEmail("dvops@email.com");
       // assertEquals("dvops@email.com", user.getEmail());
    //}

    @Test
    void testGetDepartment() {
        user.setDepartment("HR");
        assertEquals("HR", user.getDepartment());
    }

    
    }

