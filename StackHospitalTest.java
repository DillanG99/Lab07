import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class StackHospitalTest {

	@Test
	public void testAddPatient() {
		StackHospital<Person> h = new StackHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		Person p2 = new SickPerson("Test1", 0, 3);
		Person p3 = new SickPerson("Test2", 0, 2);
		h.addPatient(p1);
		h.addPatient(p2);
		h.addPatient(p3);
		Stack<Person> s = new Stack<Person>();
		s.add(p1);
		s.add(p2);
		s.add(p3);
		Assert.assertEquals(s.pop(), h.treatNextPatient());
		Assert.assertEquals(s.pop(), h.treatNextPatient());
		Assert.assertEquals(s.pop(), h.treatNextPatient());
	}

	@Test
	public void testNextPatient() {
		StackHospital<Person> h = new StackHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		Person p2 = new SickPerson("Test1", 0, 3);
		Person p3 = new SickPerson("Test2", 0, 2);
		h.addPatient(p1);
		h.addPatient(p2);
		h.addPatient(p3);
		Assert.assertEquals(p3, h.nextPatient());
	}

	@Test
	public void testTreatNextPatient() {
		StackHospital<Person> h = new StackHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		Person p2 = new SickPerson("Test1", 0, 3);
		Person p3 = new SickPerson("Test2", 0, 2);
		h.addPatient(p1);
		h.addPatient(p2);
		h.addPatient(p3);
		Assert.assertEquals(p3, h.treatNextPatient());
		Assert.assertEquals(p2, h.treatNextPatient());
		Assert.assertEquals(p1, h.treatNextPatient());
	}

	@Test
	public void testNumPatients() {
		StackHospital<Person> h = new StackHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		Person p2 = new SickPerson("Test1", 0, 3);
		Person p3 = new SickPerson("Test2", 0, 2);
		h.addPatient(p1);
		h.addPatient(p2);
		h.addPatient(p3);
		Assert.assertEquals(3, h.numPatients());
	}

	@Test
	public void testHospitalType() {
		StackHospital<Person> h = new StackHospital<Person>();
		Assert.assertEquals(h.getClass().getName(), h.hospitalType());
	}

	@Test
	public void testAllPatientInfo() {
		StackHospital<Person> s = new StackHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		s.addPatient(p1);
		Assert.assertEquals("Test3, a 0-year old. Severity level 0", s.allPatientInfo());
	}

}
