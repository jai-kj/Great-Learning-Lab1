package com.greatlearning.lab1.service;

import java.util.Random;

import com.greatlearning.lab1.model.Employee;

public class CredentialService {
    public char[] generatePassword() {
    	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
	
		Random random = new Random();

		char[] password = new char[8];

		for (int i = 0; i < 8; i++) 
			password[i] = values.charAt(random.nextInt(values.length()));

		return password;
    }
    
    public String generateEmailAddress(String firstName, String lastName, String department) {
    	return firstName + lastName + "@" + department + ".abc.com";
    }
    
    public void showCredentials(Employee employee, String email, char[] generatedPassword) {
    	String password = new String(generatedPassword);
    	System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows \nEmail --> "+ email + "\nPassword --> 1" + password);
    }
}