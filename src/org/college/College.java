package org.college;

public class College {
	private void collegeName() {
		// TODO Auto-generated method stub
System.out.println("CollegeName : BIHIER");
	}
private void collegeCode() {
	// TODO Auto-generated method stub
System.out.println("collegecode : 005");
}
private void collegeRank() {
	// TODO Auto-generated method stub
System.out.println("collegerank : 1ST");
}
public static void main(String[] args) {
	College c=new College();
	Student s=new Student();
	Hostel h=new Hostel();
	Dept d=new Dept();
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	s.studentName();
	s.studentID();
	s.StudentDept();
	h.hostelName();
	d.deptName();
}
}
