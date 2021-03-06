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
		 * Question 1 Ki???m tra account th??? 2 N???u kh??ng c?? ph??ng ban (t???c l?? department
		 * == null) th?? s??? in ra text "Nh??n vi??n n??y ch??a c?? ph??ng ban" N???u kh??ng th?? s???
		 * in ra text "Ph??ng ban c???a nh??n vi??n n??y l?? ???"
		 */

		if (account2.department == null) {
			System.out.println("Nh??n vi??n n??y ch??a c?? ph??ng ban");
		} else {
			System.out.println("Ph??ng ban c???a nh??n vi??n n??y l?? " + account2.department.departmentName);
		}

		/*
		 * Question 2: Ki???m tra account th??? 2 N???u kh??ng c?? group th?? s??? in ra text
		 * "Nh??n vi??n n??y ch??a c?? group" N???u c?? m???t trong 1 ho???c 2 group th?? s??? in ra
		 * text "Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher" N???u c?? m???t trong 3
		 * Group th?? s??? in ra text "Nh??n vi??n n??y l?? ng?????i quan tr???ng, tham gia nhi???u
		 * group" N???u c?? m???t trong 4 group tr??? l??n th?? s??? in ra text "Nh??n vi??n n??y l??
		 * ng?????i h??ng chuy???n, tham gia t???t c??? c??c group
		 */

		if (account2.groups == null) {
			System.out.println("Nh??n vi??n n??y ch??a c?? group");
		} else {
			int count = accountofgroup2.length;
			if (count == 1 || count == 2) {
				System.out.println("Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher");
			}
			if (count == 3) {
				System.out.println("Nh??n vi??n n??y l?? ng?????i quan tr???ng , tham gia nhi???u group");
			}
			if (count == 4) {
				System.out.println("Nh??n vi??n n??y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group");
			}
		}

		/* S??? d???ng to??n t??? ternary ????? l??m Question 1 */

		System.out.println(account2.department == null ? "Nh??n vi??n n??y ch??a c?? ph??ng ban"
				: "Ph??ng ban c???a nh??n vi??n n??y l??: " + account2.department.departmentName) ;
		
//		SWITCH CASE
		/*Question 5:
			L???y ra s??? l?????ng account trong nh??m th??? 1 v?? in ra theo format sau:
			N???u s??? l?????ng account = 1 th?? in ra "Nh??m c?? m???t th??nh vi??n"
			N???u s??? l?????ng account = 2 th?? in ra "Nh??m c?? hai th??nh vi??n"
			N???u s??? l?????ng account = 3 th?? in ra "Nh??m c?? ba th??nh vi??n"
			C??n l???i in ra "Nh??m c?? nhi???u th??nh vi??n"*/
		
		
		if (group1.accounts == null) {
			System.out.println("Group ch??a c?? th??nh vi??n n??o tham gia");
			} else {
			int coungAccInGroup = group1.accounts.length;
			switch (coungAccInGroup) {
			case 1:
			System.out.println("Nh??m c?? m???t th??nh vi??n");
			break;
			case 2:
			System.out.println("Nh??m c?? hai th??nh vi??n");
			break;
			case 3:
			System.out.println("Nh??m c?? ba th??nh vi??n");
			break;
			default:
			System.out.println("Nh??m c?? nhi???u th??nh vi??n");
			break;
			}
			}
		
		/*Question 8:
			In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a
			h???*/
		
		Account[] accArray = {account1,account2,account3};
		for (Account account : accArray) {
			System.out.println("AccountID: " + account.id + " Email: " + account.email + " Name: " + account.fullName + " Ph??ng ban: "+ account.department.departmentName);
		}
		
		/*Question 11:
			In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name theo ?????nh d???ng sau:
			Th??ng tin department th??? 1 l??:
			Id: 1
			Name: Sale
			Th??ng tin department th??? 2 l??:
			Id: 2
			Name: Marketing*/
		
		Department[] depArray1 = { department1, department2, department3 };
		for (int i = 0; i < depArray1.length; i++) {
			System.out.println("Th??ng tin department th??? " + (i + 1) + "l??:");
			System.out.println("Id: " + depArray1[i].departmentID);
			System.out.println("Name: " + depArray1[i].departmentName);
		}
		
//		Question 16-14: In ra th??ng tin t???t c??? c??c account c?? id < 4
		
		Account[] accArray3 = {account1,account2,account3};
		int i3 = 0;
		while (i3 < accArray3.length) {
			if (accArray3[i3].id < 4) {
				System.out.println("Th??ng tin account th??? " + (i3 + 1) + " l??:");
				System.out.println("Email: " + accArray3[i3].email);
				System.out.println("Full name: " + accArray3[i3].fullName);
				System.out.println("Ph??ng ban: " + accArray3[i3].department.departmentName);
			}
			i3++;
		}
		
		
//		In ra th??ng tin c??c account bao g???m: Email,FullName v?? t??n ph??ng ban c???a h??? theo ?????nh d???ng
		
		Account[] accArray1 = { account1,account2,account3 };
		int i = 0;
		do {
		System.out.println("Th??ng tin account th??? " + (i + 1) + "l??:");
		System.out.println("Email: " + accArray1[i].email);
		System.out.println("Full name: " + accArray1[i].fullName);
		System.out.println("Ph??ng ban: " +
		accArray1[i].department.departmentName);
		i++;
		} while (i < accArray1.length);
//		
//		Exercise 2 (Optional): System out printf
		
//		Question 1:
//			Khai b??o 1 s??? nguy??n = 5 v?? s??? d???ng l???nh System out printf ????? in ra s???
//			nguy??n ????
	
		
//		
//		int i1 = 5;
//		System.out.printf("%d", i1);
		
//		Question 2:
//			Khai b??o 1 s??? nguy??n = 100 000 000 v?? s??? d???ng l???nh System out printf ????? in
//			ra s??? nguy??n ???? th??nh ?????nh d???ng nh?? sau: 100,000,000
		
//		int i2 = 100000000;
//		System.out.printf(Locale.US, "%,d%n", i2);
		
		/* Question 5:
			L???y th???i gian b??y gi??? v?? in ra theo ?????nh d???ng sau:
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
