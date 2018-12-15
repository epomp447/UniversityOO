package University;

import java.util.Arrays;

public class Department {
	/** */
	String DeptName;
	/** */
	Professor[] Faculty;
	/** */
	String DeptField;
	/** */
	String DeptAcronym;
	/** */
	int DeptID;

	public Department(String name, Professor[] fac, String field, String a, int ID) {
		DeptName = name;
		Faculty = fac;
		DeptField = field;
		DeptAcronym = a;
		DeptID = ID;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		assert deptName != null;
		DeptName = deptName;
	}

	public Professor[] getFaculty() {
		return Faculty;
	}

	public void setFaculty(Professor[] faculty) {
		Faculty = faculty;
	}

	public String getDeptField() {
		return DeptField;
	}

	public void setDeptField(String deptField) {
		DeptField = deptField;
	}

	public String getDeptAcronym() {
		return DeptAcronym;
	}

	public void setDeptAcronym(String deptAcronym) {
		DeptAcronym = deptAcronym;
	}
	public int getDeptID() {
		return DeptID;
	}

	public void setDeptID(int deptID) {
		DeptID = deptID;
	}
	

	@Override
	public String toString() {
		return "Department [DeptName=" + DeptName + ", \nFaculty=" + Arrays.toString(Faculty) + ", \nDeptField=" + DeptField
				+ ", \nDeptAcronym=" + DeptAcronym + ", \nDeptID=" + DeptID + "]";
	}

	public static void main(String args[]) {
		Professor P1 = new Professor("Dr.", "Grevera", "CS", 80000);
		Professor P2 = new Professor("Dr.", "Chang", "CS", 80000);
		Professor P3 = new Professor("Dr.", "Wei", "CS", 80000);
		Professor[] P123 = { P1, P2, P3 };
		Department CS = new Department("Computer Science", P123, "Sciences", "CS",141);
		System.out.println(CS.toString());
	}
}
