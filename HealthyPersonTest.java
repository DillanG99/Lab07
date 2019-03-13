import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class HealthyPersonTest {
	
	@Test
	public void testHealthyPerson() {
		HealthyPerson h = new HealthyPerson("Aaaa", 0, "Test");
		HealthyPerson h2 = h;
		Assert.assertEquals(h, h2);
	}
	@Test
	public void testCompareToImpl() {
		HealthyPerson h = new HealthyPerson("Aaaa", 0, "Test");
		HealthyPerson h2 = new HealthyPerson("Baaa", 0, "Test");
		Assert.assertEquals(new String("Aaaa").compareToIgnoreCase("Baaa"), h.compareToImpl(h2));
		SickPerson s = new SickPerson("Caaaa", 0, 5);
		Assert.assertEquals(0, h.compareTo(s));
	}

}
