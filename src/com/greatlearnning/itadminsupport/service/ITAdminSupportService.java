package com.greatlearnning.itadminsupport.service;

import java.util.Random;

import com.greatlearning.itadminsupport.model.Employee;

public class ITAdminSupportService {

	public String generateEmailID(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".greatlearnig.com";
	}

	public char[] generatePassword() {
		String characters = "ABCDEFGIJKLMNOPQRSTUVWXYZ";
		characters += "abcdefghijklmnopqrstuvwxyz";
		characters += "!@#$%^&*";
		characters += "0123456789";
		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++)
			password[i] = characters.charAt(random.nextInt(characters.length()));
		return password;
	}

	public void showCredentials(Employee employee, String email, String password) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email  ---> " + email);
		System.out.println("Password ---> " + password);
	}

}
