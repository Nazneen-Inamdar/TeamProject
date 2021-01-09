package com.zensar;

public class StudentBean {
	private int roll_no;
	private String name;
	private String course;
	private int course_duration;
	private String gender;
	private String city;
	
	public StudentBean(int roll_no, String name, String course, int course_duration, String gender, String city) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.course = course;
		this.course_duration = course_duration;
		this.gender = gender;
		this.city = city;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getCourse_duration() {
		return course_duration;
	}

	public void setCourse_duration(int course_duration) {
		this.course_duration = course_duration;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "StudentBean [roll_no=" + roll_no + ", name=" + name + ", course=" + course + ", course_duration="
				+ course_duration + ", gender=" + gender + ", city=" + city + "]";
	}
	
	
	
	
	

}
