package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {

			//create object mapper
			ObjectMapper mapper = new ObjectMapper();

			//read JSON file and convert to JAVA POJO 
			
			Student theStudent = mapper.readValue (new 
					File("data/sample-full.json"), Student.class);
			
			//print firstName lastName
			System.out.println("First Name:"+theStudent.getFirstName());
			
			System.out.println("Last Name:"+theStudent.getLastName());
			
			System.out.println("Active:"+theStudent.getActive());
			
			System.out.println(theStudent.getAddress());
			
			for(String tempstudent : theStudent.getLanguages()) {
				System.out.println(tempstudent);
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
	}

}
