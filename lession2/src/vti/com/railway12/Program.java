package vti.com.railway12;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;





public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Department
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Manager";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Sale";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Security";

		// Position
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = PositionName.DEV;

		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = PositionName.DEV;

		Position position3 = new Position();
		position3.positionID = 1;
		position3.positionName = PositionName.TEST;

		// Account

		Account account1 = new Account();
		account1.id = 1;
		account1.email = "doanminhvuong0810@gmail.com";
		account1.userName = "MinhVuong";
		account1.fullName = "DoanMinhVuong";
		account1.department = department1;
		account1.position = position1;
		account1.CreateDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "nguyenthanhbao@gmail.com";
		account2.userName = "ThanhBao";
		account2.fullName = "NguyemThanhBao";
		account2.department = department2;
		account2.position = position2;
		account2.CreateDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 1;
		account3.email = "buituananh@gmail.com";
		account3.userName = "TuanAnh";
		account3.fullName = "BuiTuanAnh";
		account3.department = department3;
		account3.position = position3;
		account3.CreateDate = LocalDate.now();

		// Group

		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "Development";
		group1.creator = account1;
		group1.createDate = LocalDate.now();

		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "Sale";
		group2.creator = account2;
		group2.createDate = LocalDate.now();

		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "QC";
		group3.creator = account3;
		group3.createDate = LocalDate.now();

		Group[] groupofaccount1 = { group1, group2 };
		account1.groups = groupofaccount1;

		Group[] groupofaccount2 = { group2, group3 };
		account2.groups = groupofaccount2;

		Group[] groupofaccount3 = { group1, group3 };
		account3.groups = groupofaccount3;

		Account[] accountofgroup1 = { account1, account2 };
		group1.accounts = accountofgroup1;

		Account[] accountofgroup2 = { account2, account3 };
		group2.accounts = accountofgroup2;

		Account[] accountofgroup3 = { account1, account3 };
		group3.accounts = accountofgroup3;

//		for (Account account : accountofgroup1) {
//			System.out.println(account.fullName);
//		}
//		
//        LocalDate localDate = LocalDate.now();
//		DateTimeFormatter dataFormatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		System.out.println(localDate.format(dataFormatter1));
//		
//		float tienCuaToi =1524.1255f;
//		System.out.printf("%.3f",tienCuaToi);
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi ban nhap ho ten: ");
//		String a = scanner.nextLine();
//      System.out.println("Ten: " + a);

//        Random random = new Random();
//        int b = random.nextInt(100);
//        System.out.println(b);

		/*
		 * Question 1 Kiểm tra account thứ 2 Nếu không có phòng ban (tức là department
		 * == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban" Nếu không thì sẽ
		 * in ra text "Phòng ban của nhân viên này là …"
		 */

		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + account2.department.departmentName);
		}

		/*
		 * Question 2: Kiểm tra account thứ 2 Nếu không có group thì sẽ in ra text
		 * "Nhân viên này chưa có group" Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra
		 * text "Group của nhân viên này là Java Fresher, C# Fresher" Nếu có mặt trong 3
		 * Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều
		 * group" Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
		 * người hóng chuyện, tham gia tất cả các group
		 */

		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int count = accountofgroup2.length;
			if (count == 1 || count == 2) {
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			}
			if (count == 3) {
				System.out.println("Nhân viên này là người quan trọng , tham gia nhiều group");
			}
			if (count == 4) {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
		}

		/* Sử dụng toán tử ternary để làm Question 1 */

		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là: " + account2.department.departmentName) ;
		
//		SWITCH CASE
		/*Question 5:
			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
			Còn lại in ra "Nhóm có nhiều thành viên"*/
		
		
		if (group1.accounts == null) {
			System.out.println("Group chưa có thành viên nào tham gia");
			} else {
			int coungAccInGroup = group1.accounts.length;
			switch (coungAccInGroup) {
			case 1:
			System.out.println("Nhóm có một thành viên");
			break;
			case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
			case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
			default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
			}
			}
		
		/*Question 8:
			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
			họ*/
		
		Account[] accArray = {account1,account2,account3};
		for (Account account : accArray) {
			System.out.println("AccountID: " + account.id + " Email: " + account.email + " Name: " + account.fullName + " Phòng ban: "+ account.department.departmentName);
		}
		
		/*Question 11:
			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
			Thông tin department thứ 1 là:
			Id: 1
			Name: Sale
			Thông tin department thứ 2 là:
			Id: 2
			Name: Marketing*/
		
		Department[] depArray1 = { department1, department2, department3 };
		for (int i = 0; i < depArray1.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + "là:");
			System.out.println("Id: " + depArray1[i].departmentID);
			System.out.println("Name: " + depArray1[i].departmentName);
		}
		
//		Question 16-14: In ra thông tin tất cả các account có id < 4
		
		Account[] accArray3 = {account1,account2,account3};
		int i3 = 0;
		while (i3 < accArray3.length) {
			if (accArray3[i3].id < 4) {
				System.out.println("Thông tin account thứ " + (i3 + 1) + " là:");
				System.out.println("Email: " + accArray3[i3].email);
				System.out.println("Full name: " + accArray3[i3].fullName);
				System.out.println("Phòng ban: " + accArray3[i3].department.departmentName);
			}
			i3++;
		}
		
		
//		In ra thông tin các account bao gồm: Email,FullName và tên phòng ban của họ theo định dạng
		
		Account[] accArray1 = { account1,account2,account3 };
		int i = 0;
		do {
		System.out.println("Thông tin account thứ " + (i + 1) + "là:");
		System.out.println("Email: " + accArray1[i].email);
		System.out.println("Full name: " + accArray1[i].fullName);
		System.out.println("Phòng ban: " +
		accArray1[i].department.departmentName);
		i++;
		} while (i < accArray1.length);
//		
//		Exercise 2 (Optional): System out printf
		
//		Question 1:
//			Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//			nguyên đó
	
		
//		
//		int i1 = 5;
//		System.out.printf("%d", i1);
		
//		Question 2:
//			Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//			ra số nguyên đó thành định dạng như sau: 100,000,000
		
//		int i2 = 100000000;
//		System.out.printf(Locale.US, "%,d%n", i2);
		
		/* Question 5:
			Lấy thời gian bây giờ và in ra theo định dạng sau:
			24/04/2020 11h:16p:20s */
		
//		String pattern = "dd/MM/yyyy HH:mm:ss";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		String date = simpleDateFormat.format(new Date());
//		System.out.println(date);
		
//		Exercise 3 (Optional): Date Format
		
//		Locale locale = new Locale("vn", "VN");
//		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
//		String date = dateformat.format(exam1.createDate);
//		System.out.println(exam1.code + ": " + date);

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
