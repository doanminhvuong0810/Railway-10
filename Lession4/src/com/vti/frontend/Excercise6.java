package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Contact;
import com.vti.backend.VietnamesePhone;

public class Excercise6 {
	Scanner sc;

	public Excercise6() {
		sc = new Scanner(System.in);
	}
	
	public void question1() {
		loadmenuAbstract();
		}
	
	private void loadmenuAbstract() {
		
		VietnamesePhone vnPhone = new VietnamesePhone();
		while(true) {
			System.out.println("======================================================================");
					System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");
					System.out.println("=== 1. InsertContact.===");
					System.out.println("=== 2. RemoveContact.===");
					System.out.println("=== 3. UpdateContact.===");
					System.out.println("=== 4. SearchContact===");
					System.out.println("=== 5. ShowContact===");
					System.out.println("=== 6. Thoát khỏi chươngtrình. ===");
					System.out.println("======================================================================");
//			int menuChoose = Integer.parseInt(sc.nextLine());
			int menuChoose = sc.nextInt();		
			switch (menuChoose) {
		case 1:
			System.out.println("Nhập vào tên Contact: ");
			String name = sc.next();
			System.out.println("Nhập vào tên số Phone: ");
			String phone = sc.next();
			vnPhone.insertContact(name, phone);
			break;
			case 2:
				if (vnPhone.equals(null))
					System.out.println("Không có dữ liệu,làm ơn Insert dữ liệu");
				else {
					System.out.println("Nhập vào tên Contact cần remove:");
					String removeName = sc.next();
					vnPhone.removeContact(removeName);
				}
				
			break;
			case 3:
			System.out.println("Nhập tên cần Update: ");
			String name1 = sc.next();
			System.out.println("Nhập số Phone mới: ");
			String newPhone = sc.next();
			vnPhone.updateContact(name1, newPhone);
			System.out.println("Kết quả: ");
			vnPhone.searchContact(name1);
			break;
			case 4:
			System.out.println("Nhập vào tên Contact cần tìmkiếm: ");
			String searchName = sc.next();
			vnPhone.searchContact(searchName);
			break;
			case 5:
			vnPhone.printContact();
			break;
			case 6:
			return;
			default:
			System.out.println("Alarm: Lựa chọn đúng số trên menu");
			break;
			}
	    }
	}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

