package com.greatlearning.itadminsupport.driver;

import java.util.Scanner;

import com.greatlearning.itadminsupport.model.Employee;
import com.greatlearnning.itadminsupport.service.ITAdminSupportService;

public class ITAdminSupportAppication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please Enter the department from the following");
		System.out.println("1.Techical" + "\n" + "2.Admin" + "\n" + "3.HR" + "\n" + "4.Legal");
		Employee employee = new Employee("pavan", "n");
		ITAdminSupportService service = new ITAdminSupportService();
		String emailId = "";
		char password[] = service.generatePassword();
		;
		int dept_choice = s.nextInt();
		switch (dept_choice) {
		case 1:
			emailId = service.generateEmailID(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech");
			break;
		case 2:
			emailId = service.generateEmailID(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admin");
			break;
		case 3:
			emailId = service.generateEmailID(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr");
			break;
		case 4:
			emailId = service.generateEmailID(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal");
			break;
		}
		service.showCredentials(employee, emailId, new String(password));
		s.close();
	}

}
