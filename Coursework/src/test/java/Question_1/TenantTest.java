package Question_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class TenantTest {
	@Test
	public void testEmpty() {
		try {
			Tenant tenant = new Tenant(null, null, 0, null);
			fail("NullPointerException was not thrown");
		} catch(NullPointerException e) {}
	}
	@Test
	public void testInvalid() {
		try {
			Tenant tenant = new Tenant("sam", "leach", 16, TenantType.STUDENT);
			fail("IllegalArgumentException was not thrown");
		} catch(IllegalArgumentException e) {}
	}
	@Test
	public void testValid() {
		try {
			Tenant tenant = new Tenant("Sam", "Leach", 17, TenantType.STUDENT);
		} catch(Exception e) {
			fail("error was thrown");
		}
	}
	@Test
	public void testGetters() {
		Tenant tenant = new Tenant("Sam", "Leach", 17, TenantType.STUDENT);
		assertEquals("Sam Leach", tenant.getName());
		assertEquals(TenantType.STUDENT, tenant.getType());
		assertEquals(17, tenant.getAge());
	}
}
