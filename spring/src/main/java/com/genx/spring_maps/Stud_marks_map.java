package com.genx.spring_maps;

import java.util.HashMap;

public class Stud_marks_map {
	private String name;
	private HashMap<String,Integer> marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(HashMap<String, Integer> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stud_marks_map [name=" + name + ", marks=" + marks + "]";
	}
	
}
