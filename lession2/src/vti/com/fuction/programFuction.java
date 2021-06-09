package vti.com.fuction;

import java.util.Scanner;

public class programFuction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hienThiTen();
		// System.out.println(tongCuaHaiSo(2, 6));
//		String hoTen = nhapTen();
//		System.out.println(hoTen);
		int nhap;
		do {
			System.out.println("Chào mừng bạn đến ngân hàng VTI");
			System.out.println("Mời bạn chọn chức năng");
			System.out.println("-------------------------------");
			System.out.println("1: Rút tiền");
			System.out.println("2: Chuyển tiền");
			System.out.println("3: Truy vấn số dư");
			System.out.println("4: Đóng bát họ");
			System.out.println("5: Thoát");
			Scanner scanner = new Scanner(System.in);
			nhap = scanner.nextInt();
			ATM(nhap);
		} while (nhap != 5);
	}

	public static int tongCuaHaiSo(int a, int b) {
		int tong = a + b;
		
		return tong;
	}
	// ----------------------------------------------------------
//	public static void hienThiTen() {
//		System.out.println("Toi la ai , day la dau !!!");
//		
//	}
//	
	// Viết một hàm nhập vào một tên và sau đó in tên của người đó

	public static String nhapTen() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ten");
		String hoTen = scanner.nextLine();
		return hoTen;
	}

	public static void ATM(int nhap) {
		switch (nhap) {
		case 1:
			System.out.println("Bạn vừa chọn chức năng rút tiền");
			break;

		case 2:
			System.out.println("Bạn vừa chọn chức năng chuyển tiền");
			break;

		case 3:
			System.out.println("Bạn vừa chọn chức năng truy vấn số dư");
			break;

		case 4:
			System.out.println("Bạn vừa chọn chức năng đóng bát họ");
			break;
		case 5:
			System.out.println("Cảm ơn bạn đã sử dụng dịch vụ");
			break;

		default:
			System.out.println("Mời bạn nhập từ 1 ->4");
		}
	}

}
