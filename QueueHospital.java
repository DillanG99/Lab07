import java.util.ArrayList;
import java.util.Iterator;

public class QueueHospital<PatientType> extends Hospital<PatientType> {
	ArrayList<PatientType> hospital = new ArrayList<PatientType>();
	/**
	 * Add a patient to the Hospital.
	 *
	 * @param patient The patient to be added.
	 */
	@Override
	public void addPatient(PatientType patient) {
		hospital.add(patient);

	}
	/**
	 * Find and return the patient who will next be treated. Does not treat the patient (i.e. it is not
	 * removed from the collection of patients that the hospital still must treat).
	 *
	 * @return The patient who would be next treated.
	 */
	@Override
	public PatientType nextPatient() {
		return hospital.get(0);
	}
	/**
	 * Treats the next patient and removes them from the Hospital. Once someone is healed they
	 * no longer need to stay in the Hospital.
	 *
	 * @return The patient receiving treatment.
	 */
	@Override
	public PatientType treatNextPatient() {
		PatientType currPatient = hospital.get(0);
		hospital.remove(0);
		return currPatient;
	}
	/**
	 * Calculate and return the number of patients still in the hospital (untreated).
	 *
	 * @return The number of patients in the Hospital.
	 */
	@Override
	public int numPatients() {
		return hospital.size();
	}
	/**
	 * Gives a String for the hospital type.
	 *
	 * @return A string exactly matching the class name.
	 */
	@Override
	public String hospitalType() {
		return "QueueHospital";
	}
	/**
	 * Prints all patient information.
	 *
	 * @return The toString of all patients, concatenated (don't add spaces, newlines, etc...).
	 */
	@Override
	public String allPatientInfo() {
		String info = "";
		Iterator iter = hospital.iterator();
		while(iter.hasNext()) {
			info = info + iter.next().toString();
		}
		return info;
	}
}
