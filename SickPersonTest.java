import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SickPersonTest {

	@Test
	public void testSickPerson() {
		SickPerson s = new SickPerson("Aaaa", 0, 5);
		SickPerson s2 = s;
		Assert.assertEquals(s, s2);
	}
	@Test
	public void testCompareToImpl() {
		SickPerson s = new SickPerson("Aaaa", 0, 5);
		SickPerson s2 = new SickPerson("Baaa", 0, 6);
		Assert.assertEquals(1, s.compareTo(s2));
		Assert.assertEquals(-1, s2.compareTo(s));
		HealthyPerson h = new HealthyPerson("Caaa", 0, "Test");
		Assert.assertEquals(0, s.compareTo(h));
		
	}
}
