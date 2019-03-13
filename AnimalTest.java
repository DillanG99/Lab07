import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

	@Test
	public void testGetBreed() {
		Animal a = new Animal("Test", 4);
		Assert.assertEquals("Test", a.getBreed());
	}

	@Test
	public void testGetAge() {
		Animal a = new Animal("Test", 4);
		Assert.assertEquals(4, a.getAge());
	}

	@Test
	public void testToString() {
		Animal a = new Animal("Test", 4);
		Assert.assertEquals("A 4-year old Test.", a.toString());
	}

	@Test
	public void testCompareTo() {
		Animal a = new Animal("Test", 4);
		Animal a2 = new Animal("Test2", 5);
		Assert.assertEquals(1, a.compareTo(a2));
		
	}

}
