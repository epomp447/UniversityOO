package University;

public class Course {
	/** */
	String CourseName;
	/** */
	Professor Teacher;
	/** */
	String CourseAcronym;
	/** */
	int CourseNumber;
	/** */
	int MaxSize;

	public Course(String name, Professor prof, String acronym, int num, int size) {
		CourseName = name;
		Teacher = prof;
		CourseAcronym = acronym;
		CourseNumber = num;
		MaxSize = size;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public Professor getTeacher() {
		return Teacher;
	}

	public void setTeacher(Professor teacher) {
		Teacher = teacher;
	}

	public String getCourseAcronym() {
		return CourseAcronym;
	}

	public void setCourseAcronym(String courseAcronym) {
		CourseAcronym = courseAcronym;
	}

	public int getCourseNumber() {
		return CourseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		CourseNumber = courseNumber;
	}

	public int getMaxSize() {
		return MaxSize;
	}

	public void setMaxSize(int maxSize) {
		MaxSize = maxSize;
	}

	@Override
	public String toString() {
		return "Course [CourseName=" + CourseName + ", \nTeacher=" + Teacher + ", \nCourseAcronym=" + CourseAcronym
				+ ", \nCourseNumber=" + CourseNumber + ", \nMaxSize=" + MaxSize + "]";
	}

	public static void main(String args[]) {
		Professor P1 = new Professor("Dr.", "Grevera", "CS", 80000);
		Course CompSystems = new Course("Computer Systems", P1, "CS", 350, 20);
		System.out.println(CompSystems.toString());
	}
}
