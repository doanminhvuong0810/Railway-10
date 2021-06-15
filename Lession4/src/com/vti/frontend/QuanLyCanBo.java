package com.vti.frontend;

import java.util.ArrayList;

import java.util.Scanner;

import com.vti.backend.CanBo;
import com.vti.backend.CongNhan;
import com.vti.backend.Gender;
import com.vti.backend.KySu;
import com.vti.backend.NhanVien;

public class QuanLyCanBo {
	private ArrayList<CanBo>  canBos;
    private Scanner sc;
  
    
    
	public  QuanLyCanBo() {
		canBos = new ArrayList<CanBo>();	
		}
	 
	
	public void question1() {
		
	}
	public void question2() {
	menu();
	}
	
	
	
	public void menu() {
		
		while (true) {
		System.out.println("======================================================================");
		System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");
		System.out.println("=== 1. Thêm mới cán bộ.===");
		System.out.println("=== 2. Tìm kiếm theo họ tên. ===");
		System.out.println("=== 3. Hiện thị thông tin về danh sách các cán bộ. ===");
		System.out.println("=== 4. Nhập vào tên của cán bộ và delete cán bộ đó ===");
		System.out.println("=== 5. Thoát khỏi chương trình. ===");
		System.out.println("======================================================================");
		
		sc = new Scanner(System.in);
		int menuChoose = Integer.parseInt(sc.nextLine());
		switch (menuChoose) {
		case 1:
		addCanBo();
		break;case 2:
		findByName();
		break;
		case 3:
		printCanBo();
		break;
		case 4:
		deleteByName();
		break;
		case 5:
		return;
		default:
		System.out.println("Lựa chọn đúng số trên menu");
		break;
		}
	}
}
	
	private void addCanBo() {
		System.out.println("----------------------------------------------------");
		System.out.println("--------Lựa chọn chức năng bạn muốn sử dụng---------");
		System.out.println("--- 1. Thêm Kỹ Sư---");
		System.out.println("--- 2. Thêm Công Nhân---");
		System.out.println("--- 3. Thêm Nhân Viên---");
		System.out.println("----------------------------------------------------");
		
		int choose1 = Integer.parseInt(sc.nextLine());
		
		switch (choose1) {
		case 1:
		System.out.println("Nhập vào tên Kỹ Sư: ");
		
		String nameKySu = sc.nextLine();
		System.out.println("Nhập vào tuổi Kỹ Sư: ");
		int ageKySu = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập vào giới tính Kỹ Sư 1.Male, 2.Female, 3.Unknown: ");
		int flagKySu = Integer.parseInt(sc.nextLine());
		Gender genderName1 = null;
		switch (flagKySu) {
		case 1:
		genderName1 = Gender.MALE;
		break;
		case 2:
		genderName1 = Gender.FEMALE;
		break;
		case 3:
		genderName1 = Gender.UNKNOWN;
		break;
		}
		System.out.println("Nhập vào địa chỉ Kỹ Sư: ");
		
		String addressKuSu = sc.nextLine();
		System.out.println("Nhập vào chuyên ngành Kỹ Sư: ");
		
		String specializedEngineer = sc.nextLine();
		CanBo engineer = new KySu(nameKySu, ageKySu, genderName1, addressKuSu, specializedEngineer);
		canBos.add(engineer);
		
		break;
		case 2:
		System.out.println("Nhập vào tên Công Nhân: ");
		
		String nameCongNhan = sc.nextLine();
		System.out.println("Nhập vào tuổi  Công Nhân: ");
		int ageCongNhan = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập vào giới tính  Công Nhân 1.Male, 2.Female, 3.Unknown: ");
		int flagCongNhan = Integer.parseInt(sc.nextLine());
		Gender genderCongNhan = null;
		switch (flagCongNhan) {
		case 1:
		genderCongNhan = Gender.MALE;
		break;
		case 2:
		genderCongNhan = Gender.FEMALE;
		break;
		case 3:
		genderCongNhan = Gender.UNKNOWN;
		break;
		}
		System.out.println("Nhập vào địa chỉ Công Nhân: ");
		
		String addresCongNhan = sc.nextLine();
		System.out.println("Nhập vào bậc Công Nhân: ");
		int rankCongNhan = Integer.parseInt(sc.nextLine());
		CanBo worker1 = new CongNhan(nameCongNhan,ageCongNhan, genderCongNhan,addresCongNhan,rankCongNhan);
		canBos.add(worker1);
		break;
		case 3:
		System.out.println("Nhập vào tên Employee: ");
		
		String nameEmployee = sc.nextLine();
		System.out.println("Nhập vào tuổi Employee: ");
		int ageEmployee = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập vào giới tính Employee 1.Male, 2.Female, 3.Unknown: ");
		int flagEmployee = Integer.parseInt(sc.nextLine());
		Gender genderEmployee = null;
		switch (flagEmployee) {
		case 1:
		genderEmployee = Gender.MALE;
		break;
		case 2:
		genderEmployee = Gender.FEMALE;
		break;
		case 3:
		genderEmployee = Gender.UNKNOWN;
		break;
		}
		System.out.println("Nhập vào địa chỉ Employee: ");
		
		String addEmployee = sc.nextLine();
		System.out.println("Nhập vào nhiệm vụ Employee: ");
		
		String taskEmployee = sc.nextLine();
		CanBo Employee = new NhanVien(nameEmployee, ageEmployee, genderEmployee, addEmployee, taskEmployee);
		canBos.add(Employee);
		break;
		default:
		break;
		}
	}

	     

	private void findByName() {
		System.out.println("Nhập vào tên muốn tìm kiếm: ");
		String findName = sc.nextLine();
		for (CanBo canBo : canBos) {
			if (canBo.getHoTen().equals(findName)) {
				System.out.println(canBo);
			}
		}
	}
	
	
	private void printCanBo() {
		for (CanBo canBo : canBos) {
		    System.out.println(canBo);
		}
	}
	
		private void deleteByName() {
			
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
