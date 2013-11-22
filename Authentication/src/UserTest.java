import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class UserTest {
	User user;
	@Before
	public void setUp() {
		 user = new User("Checking", "Tanes", "123", 123);
	}
	
	
	@Test
	public void testGetPin() {
		assertEquals(1234,user.getPin());
	}

	@Test
	public void testToString() {
		assertEquals("User [accountType=" + "Checking" + ", username=" + "Tanes"
				+ ", password=" + "123" + ", pin=" + 123 + "]",user.toString());
	}

	
}
