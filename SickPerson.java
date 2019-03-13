
public class SickPerson extends Person{
	private int severity;
	/**
	 * Sets the values of name, age and severity. Uses Person constructor.
	 * @param name
	 * @param age
	 * @param severity
	 */
	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.severity = severity;
	}
	/**
	 * Subclass implementation of Person comparison.
	 *
	 * @param p The other person to compare to.
	 * @return Standard Comparable values:
	 * 	(1) self comes "before" p: negative number
	 *  (2) self comes "after" p: positive number
	 *  (3) self and p are equivalent in ordering: 0
	 */
	@Override
	protected int compareToImpl(Person p) {
		if (!(p instanceof SickPerson)) {
			return 0;
		}
		SickPerson ref = (SickPerson)p;
		return -(this.severity - ref.severity);
	}
	@Override
	public String toString() {
		return String.format("%s Severity level %d", super.toString(), this.severity);
	}
}
