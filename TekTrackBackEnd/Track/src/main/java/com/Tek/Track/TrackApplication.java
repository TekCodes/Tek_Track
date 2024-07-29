package com.Tek.Track;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackApplication.class, args);
	}
	String solution(String[] records) {

		String result = null;
		int highestGrade = -1;

		for (String record : records) {
			String[] split = record.split(":");
			String student = split[0];
			int grade = Integer.parseInt(split[1]);

			if (grade > highestGrade) {
				highestGrade = grade;
				result = student;
			}
		}


		return result;
	}
}
