package vti.com.baiTapBoXungLession2;

import java.util.Scanner;

public class Account {
	String userNam ;
	String passWord;
	
	public void dangNhapAccount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào username: ");
        userNam = scanner.nextLine();
        System.out.println("Nhập vào password: ");
        passWord = scanner.nextLine();
	}
	
	
	
	
	
	
	
	
}

