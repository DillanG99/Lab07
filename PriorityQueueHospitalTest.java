import static org.junit.Assert.*;

import java.util.PriorityQueue;

import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueHospitalTest {

	@Test
	public void testAddPatient() {
		PriorityQueueHospital<Person> h = new PriorityQueueHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		Person p2 = new SickPerson("Test1", 0, 3);
		Person p3 = new SickPerson("Test2", 0, 2);
		h.addPatient(p1);
		h.addPatient(p2);
		h.addPatient(p3);
		PriorityQueue<Person> priority = new PriorityQueue<Person>();
		priority.add(p2);
		priority.add(p3);
		priority.add(p1);
		Assert.assertEquals(priority.poll() , h.treatNextPatient());
		Assert.assertEquals(priority.poll() , h.treatNextPatient());
		Assert.assertEquals(priority.poll() , h.treatNextPatient());
	}

	@Test
	public void testNextPatient() {
		PriorityQueueHospital<Person> h = new PriorityQueueHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		Person p2 = new SickPerson("Test1", 0, 3);
		Person p3 = new SickPerson("Test2", 0, 2);
		h.addPatient(p1);
		h.addPatient(p2);
		h.addPatient(p3);
		Assert.assertEquals(p2, h.nextPatient());
	}

	@Test
	public void testTreatNextPatient() {
		PriorityQueueHospital<Person> h = new PriorityQueueHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		Person p2 = new SickPerson("Test1", 0, 3);
		Person p3 = new SickPerson("Test2", 0, 2);
		h.addPatient(p1);
		h.addPatient(p2);
		h.addPatient(p3);
		PriorityQueue<Person> priority = new PriorityQueue<Person>();
		priority.add(p2);
		priority.add(p3);
		priority.add(p1);
		Assert.assertEquals(priority.poll() , h.treatNextPatient());
		Assert.assertEquals(priority.poll() , h.treatNextPatient());
		Assert.assertEquals(priority.poll() , h.treatNextPatient());
	}

	@Test
	public void testNumPatients() {
		PriorityQueueHospital<Person> h = new PriorityQueueHospital<Person>();
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
		PriorityQueueHospital<Person> h = new PriorityQueueHospital<Person>();
		Assert.assertEquals(h.getClass().getName(), h.hospitalType());
	}

	@Test
	public void testAllPatientInfo() {
		PriorityQueueHospital<Person> h = new PriorityQueueHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		h.addPatient(p1);
		Assert.assertEquals("Test3, a 0-year old. Severity level 0", h.allPatientInfo());
	}

}
