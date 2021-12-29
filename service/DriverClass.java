package com.greatlearning.lab1.service;

import java.util.Scanner;

import com.greatlearning.lab1.model.Employee;

public class DriverClass {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please Enter your First Name:");
        String firstName = sc.next();
        
        System.out.println("Please Enter your Last Name:");
        String lastName = sc.next();
        
        Employee employee = new Employee(firstName, lastName);
        
        System.out.println("Please Choose the Department from the following:\n1. Technical\n2. Admin\n3. Human Resources\n4. Legal");
        int choice = sc.nextInt();
        
        CredentialService credService = new CredentialService();
        String generatedEmail = "";
        
        switch(choice) {
            case 1: generatedEmail = credService.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech");
            		break;
            
            case 2: generatedEmail = credService.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "admin");
            		break;
            
            case 3: generatedEmail = credService.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr");
            		break;
            
            case 4: generatedEmail = credService.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "legal");
            		break;
            
            default:break;
        }
        
        if(choice < 1 || choice > 4)
        	System.out.println("Invalid Choice! Program Exited.");
        else {
        	char[] generatedPassword = credService.generatePassword();
        	credService.showCredentials(employee, generatedEmail, generatedPassword);
        }
        
        sc.close();
    }
}