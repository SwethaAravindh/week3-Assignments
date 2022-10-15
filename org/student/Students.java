package org.student;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println(id);
		System.out.println(name);
	}
	public void getStudentInfo(String email,double phone) {
		System.out.println(email);
		System.out.println(phone);
	}
	public static void main(String[] args) {
		Students students = new Students();
		System.out.println("Studentid");
		students.getStudentInfo(259);
		System.out.println("Studentid & name");
		students.getStudentInfo(259, "Swetha");
		System.out.println("email, phone");
		students.getStudentInfo("swetha@gmail.com", 987456);
	}



}
