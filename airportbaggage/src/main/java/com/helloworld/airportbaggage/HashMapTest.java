package com.helloworld.airportbaggage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Srini");
		Student s2 = new Student(2,"Suresh");
		
		Map<Student, String> students = new HashMap<Student, String>();
		students.put(student1, student1.name);
		students.put(s2, s2.name);
		
		for(Entry<Student, String> entry : students.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		

	}
	
	public static class Student {
		private int id;
		private String name;
		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return id;
		}
		@Override
		public boolean equals(Object obj) {
			return ((Student)obj).id ==id ;
		}
		
		
	}

}
