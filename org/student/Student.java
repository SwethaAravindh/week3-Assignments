package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Swetha");
	}
	public void studentDept() {
		System.out.println("Maths");
	}
	public void studentId() {
		System.out.println("AU150259");
	}
	public static void main(String[] args) {
		System.out.println("*******Student inherited to Department and Department inherited to College*******");
		Student s = new Student();
		s.studentDept();
		s.studentId();
		s.studentName();
		s.collagrRank();
		s.collegeCode();
		s.collegeName();
		s.drptName();
		System.out.println("*******Department inherited to Student*******");
		Department D= new Department();
		D.drptName();
		System.out.println("*******College inherited to Department*******");
		D.collagrRank();
		D.collegeCode();
		D.collegeName();
		System.out.println("*******Parent College*******");
		College C= new College();
		C.collagrRank();
		C.collegeCode();
		C.collegeName();
		
	}

}
