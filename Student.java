package University;

public class Student {
	/** */
	String FirstName;
	/** */
	String LastName;
	/** */
	Double GPA;
	/** */
	int StudentID;
	/** */
	Course[] Courses; 

	public Student(String fn, String ln, double gpa, int ID, Course[] c) {
		FirstName = fn;
		LastName = ln;
		GPA = gpa;
		StudentID = ID;
		Courses = c;
		
	}

	public Course[] getCourses() {
		return Courses;
	}

	public void setCourses(Course[] courses) {
		Courses = courses;
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

	public Double getGPA() {
		return GPA;
	}

	public void setGPA(Double gPA) {
		GPA = gPA;
	}

	public int getStudentID() {
		return StudentID;
	}

	public void setStudentID(int studentID) {
		StudentID = studentID;
	}

	public static String toString(Student s) {
		String str = "";
		str += s.getFirstName() + " " + s.getLastName() + "\nGPA= \t" + s.getGPA() + "\nID: \t" + s.getStudentID();
		return str;
	}
}
