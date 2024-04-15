
package account;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest { 
    
    @Test
    public void testCheckUserNameCorrectlyFormatted() 
    {
        Login login = new Login("kyl_1","Ch&&sec@ke99","Shreya","Sewanker");
        assertTrue(login.checkUserName());    
    }
    
    @Test
    public void testCheckUserNameInorrectlyFormatted() 
    {
        Login login = new Login("kyle!!!!!!","Password1","Shreya","Sewsanker");
        assertFalse(login.checkUserName());
    }

    @Test
    public void testCheckPasswordComplexitySuccess() 
    {
        Login login = new Login("kyl_1","Ch&&sec@ke99","Shreya","Sewsanker");
        assertTrue(login.checkPasswordComplexity());
    }

    @Test
    public void testCheckPasswordComplexityFailure() 
    {
        Login login = new Login("kyle!!!!!!","Password1","Shreya","Sewsanker");
        assertFalse(login.checkPasswordComplexity());
    }

    @Test
    public void testLoginUserValid()  
    {
                Login login = new Login("kyl_1","Ch&&sec@ke99","Shreya","Sewsanker");
                boolean actual = login.loginUser("kyl_1","Ch&&sec@ke99");
                assertTrue(actual);
       
    }
    
    @Test
    public void testLoginUserInvalid() 
    {
                Login login = new Login("kyle!!!!!!","Password1","Shreya","Sewsanker");
                boolean actual = login.loginUser("kyl_1","Ch&&sec@ke99");
                assertFalse(actual);
    }


}

/* 
    Title: PROG5121 POE Unit testing part 1
    Author: Fatima Sheik
    Date: 11 April 2024
    Code version: 1
    Availability: https://youtu.be/sFTbCVnUbLo?si=lw0CHpDx8_9q18ds
*/ 