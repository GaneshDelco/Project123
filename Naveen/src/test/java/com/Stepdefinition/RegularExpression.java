package com.Stepdefinition;

import io.cucumber.java.en.Given;

public class RegularExpression {
	@Given("Student name is {string}")
	public void student_name_is(String string) {
	   System.out.println("STudent name is"+ string);
	}

	@Given("Student roll number is {int}")
	public void student_roll_number_is(Integer int1) {
		   System.out.println("STudent rollnumber is"+ int1);
	
	}

	@Given("Student cgpa is {double}")
	public void student_cgpa_is(Double double1) {
		   System.out.println("STudent cgpa is"+ double1);

}


	
}
