package com.helloworld.airportbaggage;

public class Test2 {

	/*
	day(0) = 5000*k
	day(i) = Day(i-1)+5000+i
	
	*/
	public static void main(String[] args) {
		int studentId = findStudentId(5, 25000);
		System.out.println(studentId);
	}
	
	public static int findStudentId(int numOfInterns, int passcode) {
		for(int id = 1; id <= numOfInterns;  id++) {
			int priorDayPasscode = 5000 * id;
			if(priorDayPasscode == passcode) {
				return id;
			}
			for(int day=1; day <50; day++) {
				int currentDayPasscode = priorDayPasscode+5000+day;
				if(currentDayPasscode == passcode) {
					return id;
				} else {
					priorDayPasscode = currentDayPasscode;
				}
			}
		}
		return -1;
	}

}
