package University;

import java.util.Arrays;

public class School {
	/** */
	String Name;
	/** */
	Professor[] Staff;
	/** */
	Student[] Students;
	/** */
	Department[] Departments;
	/** */
	Course[] Courses;
	/** */
	String Address;
	/** */
	String City;
	/** */
	int ZIP;
	public School(String name, Professor[] staff, Student[] students, Department[] departments, Course[] courses,
			String address, String city, int zip) {
		Name = name;
		Staff = staff;
		Students = students;
		Departments = departments;
		Courses = courses;
		Address = address;
		City = city;
		ZIP = zip;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Professor[] getStaff() {
		return Staff;
	}
	public void setStaff(Professor[] staff) {
		Staff = staff;
	}
	public Student[] getStudents() {
		return Students;
	}
	public void setStudents(Student[] students) {
		Students = students;
	}
	public Department[] getDepartments() {
		return Departments;
	}
	public void setDepartments(Department[] departments) {
		Departments = departments;
	}
	public Course[] getCourses() {
		return Courses;
	}
	public void setCourses(Course[] courses) {
		Courses = courses;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getZIP() {
		return ZIP;
	}
	public void setZIP(int zIP) {
		ZIP = zIP;
	}
	@Override
	public String toString() {
		return "School [Name=" + Name + ", Staff=" + Arrays.toString(Staff) + ", Students=" + Arrays.toString(Students)
				+ ", Departments=" + Arrays.toString(Departments) + ", Courses=" + Arrays.toString(Courses)
				+ ", Address=" + Address + ", City=" + City + ", ZIP=" + ZIP + "]";
	}
	
}
