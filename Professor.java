package University;

public class Professor {
	/** */
	String FirstName;
	/** */
	String LastName;
	/** */
	String Field;
	/** */
	int Salary;

	public Professor(String fn, String ln, String f, int s) {
		FirstName = fn;
		LastName = ln;
		Field = f;
		Salary = s;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getField() {
		return Field;
	}

	public void setField(String field) {
		Field = field;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}


	@Override
	public String toString() {
		return "Professor [FirstName=" + FirstName + ", LastName=" + LastName + ", Field=" + Field + ", Salary="
				+ Salary + "]";
	}

	public static void main(String args[]) {
		Professor P1 = new Professor("Dr.", "Grevera", "CS", 80000);
		System.out.println(P1.toString());
	}
}
