
public class HealthyPerson extends Person {
	private String reason;
	/**
	 * Sets name, age, and reason variables. Uses Person Constructor.
	 * @param name
	 * @param age
	 * @param reason
	 */
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
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
		if (p instanceof SickPerson) {
			return 0;
		}
		else {
			return this.getName().compareToIgnoreCase(p.getName());
		}
	}
	@Override
	public String toString() {
		return String.format("%s In for %s", super.toString(), this.reason);
	}

}
