import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class QueueHospitalTest {

	@Test
	public void testAddPatient() {
		QueueHospital<Person> q = new QueueHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		Person p2 = new SickPerson("Test1", 0, 3);
		Person p3 = new SickPerson("Test2", 0, 2);
		q.addPatient(p1);
		q.addPatient(p2);
		q.addPatient(p3);
		ArrayList<Person> a = new ArrayList<Person>();
		a.add(p1);
		a.add(p2);
		a.add(p3);
		Assert.assertEquals(a.get(0) , q.treatNextPatient());
		Assert.assertEquals(a.get(1) , q.treatNextPatient());
		Assert.assertEquals(a.get(2) , q.treatNextPatient());
	}

	@Test
	public void testNextPatient() {
		QueueHospital<Person> q = new QueueHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		Person p2 = new SickPerson("Test1", 0, 3);
		Person p3 = new SickPerson("Test2", 0, 2);
		q.addPatient(p1);
		q.addPatient(p2);
		q.addPatient(p3);
		Assert.assertEquals(p1, q.nextPatient());
	}

	@Test
	public void testTreatNextPatient() {
		QueueHospital<Person> q = new QueueHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		Person p2 = new SickPerson("Test1", 0, 3);
		Person p3 = new SickPerson("Test2", 0, 2);
		q.addPatient(p1);
		q.addPatient(p2);
		q.addPatient(p3);
		Assert.assertEquals(p1, q.treatNextPatient());
		Assert.assertEquals(p2, q.treatNextPatient());
		Assert.assertEquals(p3, q.treatNextPatient());
	}

	@Test
	public void testNumPatients() {
		QueueHospital<Person> q = new QueueHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		Person p2 = new SickPerson("Test1", 0, 3);
		Person p3 = new SickPerson("Test2", 0, 2);
		q.addPatient(p1);
		q.addPatient(p2);
		q.addPatient(p3);
		Assert.assertEquals(3, q.numPatients());
	}

	@Test
	public void testHospitalType() {
		QueueHospital<Person> q = new QueueHospital<Person>();
		Assert.assertEquals(q.getClass().getName(), q.hospitalType());
	}

	@Test
	public void testAllPatientInfo() {
		QueueHospital<Person> q = new QueueHospital<Person>();
		Person p1 = new SickPerson("Test3", 0, 0);
		q.addPatient(p1);
		Assert.assertEquals("Test3, a 0-year old. Severity level 0", q.allPatientInfo());
	}

}
