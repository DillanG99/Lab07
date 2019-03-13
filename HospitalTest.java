import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class HospitalTest {

	@Test
	public void testToString() {
		Hospital h = new StackHospital();
		h.addPatient(new SickPerson("Test", 0, 5));
		h.addPatient(new SickPerson("Test1", 0, 6));
		h.addPatient(new SickPerson("Test2", 0, 7));
		Assert.assertEquals("A StackHospital-type hospital with 3 patients.", h.toString());
	}

}
