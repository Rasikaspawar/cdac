package org.students.com;

public class Student {
	private int Stuid;
	private String name;
	private int age;
	private static String course = "cdac";
	 public Student(int Stuid, String name, int age,String course) {
		this.Stuid = Stuid;
		this.name = name;
		this.age = age;
		this.course = course;
	 }
	 public void displayinfo() {
		 System.out.println("Student id :"  + Stuid+" "  +"Name :" +name+ " " +"AGE :"+ " " +age+ " " +"course:" +course);
	 }
	public int getStuid() {
		return Stuid;
	}
	public void setStuid(int stuid) {
		Stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	 
	 }


