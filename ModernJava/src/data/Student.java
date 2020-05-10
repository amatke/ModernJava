package data;

import java.util.List;

public class Student {

	private String name;
	private String gender;
	private double gpa;
	private int grade;
	private List<String> activities;

	public Student(String name, String gender, double gpa, int grade, List<String> activities) {
		this.name = name;
		this.gender = gender;
		this.gpa = gpa;
		this.grade = grade;
		this.activities = activities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}

	public void printActivities() {
		activities.forEach( s -> System.out.println(s));
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=").append(name).append(", gender=").append(gender).append(", gpa=").append(gpa)
				.append(", grade=").append(grade).append(", activities=").append(activities).append("]");
		return builder.toString();
	}

}
