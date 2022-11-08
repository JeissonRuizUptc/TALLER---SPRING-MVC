package edu.uptc.dao;

import java.util.ArrayList;

import edu.uptc.model.Course;

public class Manager {

	private ArrayList<Course> listCuorse;

	public Manager() {
		listCuorse = new ArrayList<Course>();
	}

	public void addCourse(Course newCourse) {
		if (listCuorse == null) {
			listCuorse = new ArrayList<Course>();
			listCuorse.add(newCourse);
		}
		for (int i = 0; i < listCuorse.size(); i++) {
			if (listCuorse.get(i).getId() != newCourse.getId()) {
				if (listCuorse.get(i).getNameSchool() != newCourse.getNameSchool() && listCuorse.get(i).getName() !=newCourse.getName()) {
					listCuorse.add(newCourse);
				}break;

			}
			System.out.println("sds: " +listCuorse.size());
		}
		System.out.println(listCuorse.size());
	}

	public void adddCourse(Course newCourse) {
		listCuorse.add(newCourse);

	}

}
