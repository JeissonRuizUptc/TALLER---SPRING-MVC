package edu.uptc.model;

public class Course {
	private int id;
	private String name;
	private String nameSchool;
	private int time;
	private String nameTeacher;
	
	public Course(int id, String name, String nameSchool, int time, String nameTeacher) {
		this.id = id;
		this.name = name;
		this.nameSchool = nameSchool;
		this.time = time;
		this.nameTeacher = nameTeacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameSchool() {
		return nameSchool;
	}

	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getNameTeacher() {
		return nameTeacher;
	}

	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}
}