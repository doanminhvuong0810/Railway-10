package vti.com.baiTapBoXungLession2;

import java.util.Scanner;

public class program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Nhap vao chieu rong: ");
//		Scanner scanner = new Scanner(System.in);
//		int chieuRong = scanner.nextInt();
//		System.out.println("Nhap vao chieu dai: ");		
//		int chieuDai = scanner.nextInt();
//		int chuVi=chuViHinhChuNhat(chieuRong, chieuDai);
//		System.out.println("Chu vi hinh chu nhat bang: "+ chuVi);
		
		
//		System.out.println("Nhap vao canhHinhVuong: ");
//		Scanner scanner2 = new Scanner(System.in);
//		int canhHinhVuong  = scanner2.nextInt();
//		System.out.println("Chu vi hinh chu nhat bang: "+ dienTichHinhVuong(canhHinhVuong));
		
		
//		soChiaHet75();
		
		
//	    Scanner scanner3 = new Scanner(System.in);    
//	    System.out.println("Nhập vào số nguyên dương bất kỳ: ");
//	    int nhapSoNguyen = scanner3.nextInt();	    
//	    System.out.println("tổng các chữ số của số " + nhapSoNguyen + " là: " + tinhTong(nhapSoNguyen));
		
		TaoTaiKhoan();		
		DangNHapTaiKHoan();


	}
	
	
//	1 - viết hàm tính chu vi hình chữ nhật
	public static int chuViHinhChuNhat(int chieuRong ,int chieuDai) {
		int chuVi = (chieuDai + chieuRong)*2;
		return chuVi;
	}
	
//	2 - viết hàm tính diện tích hình vuông.	
	
	public static int dienTichHinhVuong(int canhHinhVuong) {
		int dienTich = canhHinhVuong*canhHinhVuong ;
		return dienTich ;
	}
	

//	3 - Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong đoạn 10 và 200
	
	public static void soChiaHet75() {
		int[] arr = new int[190];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= i;
			int j = i+10;
			if (j%7 ==0 & j%5 !=0) {
				System.out.println(j);
			}
		}
	}
	
//	4 - Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.
	
	public static int tinhTong(int nhapSoNguyen) {
		int soDu, tong = 0;
		while (nhapSoNguyen != 0) {
			soDu = nhapSoNguyen % 10;
			nhapSoNguyen = nhapSoNguyen / 10;
			tong += soDu;
		}
		return tong;
	}
	
	
//	6 - Viết chương trình đăng nhập tài khoản, cho phép nhập vào username và password, nếu nhập đúng thông báo đăng nhập thành công	
	
	public static String TaoTaiKhoan() {
		
		String userNam ;
		String passWord;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào username: ");
        userNam = scanner.nextLine();
        System.out.println("Nhập vào password: ");
        passWord = scanner.nextLine();
        System.out.println("Tài khoản tạo mới của bạn là:\n" + "usernam: " +userNam +"\n" + "password: " + passWord);
        String kiemTra= userNam.concat(passWord);
        System.out.println(kiemTra);
        return kiemTra;
	}
	
	
	
	
	
	
	
	public static void DangNHapTaiKHoan() {
		String usernam = "abc" , password = "123456";
		String guessUser, guessPass;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Nhập vào username: ");
			guessUser = scanner.nextLine();
			System.out.println("Nhập vào password: ");
			guessPass = scanner.nextLine();
			
		} while (guessPass.equals(password)== false & guessUser.equals(usernam));

		System.out.println("Đăng nhập thành công.");

	}
	
	
	
	
	
	

}