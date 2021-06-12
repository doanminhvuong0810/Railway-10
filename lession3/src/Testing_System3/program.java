package Testing_System3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;








public class program {
	public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
     
	public static void main(String[] args) {
		
		/*Question 1:
			Khai báo 2 số lương có kiểu dữ liệu là float.
			Khởi tạo Lương của Account 1 là 5240.5 $
			Khởi tạo Lương của Account 2 là 10970.055$
			Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
			Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra*/
	
//		float Salary1;
//		float Salary2;
//		Salary1 =  5240.5f;
//		Salary2 =  10970.055f;
//		System.out.println("Salary1: " + Salary1 + "|| Salary2: " + Salary2);
//		int roundSalary1 = (int) Salary1;
//		int roundSalary2 = (int) Salary2;
//		System.out.println("roundSalary1: " + roundSalary1 + " || roundSalary2: " + roundSalary2);
//		
		
		
		/*Question 2:
			Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
			có số 0 ở sau cho đủ 5 chữ số)*/
		
		
//		Random random = new Random();
//		int a = random.nextInt(99999);
//		while (a < 10000) {
//		a = a * 10;
//		}
//		System.out.println("Số ngẫu nhiên: " + a);
//		
//		
//		String myString = "1234";
//		int foo = Integer.parseInt(myString);
//		
//		
//		//3 cách đổi dữ liệu từ int sang string
//		String a1 = String.valueOf(foo);
//		String b = "" + foo ;
//		String c = Integer.toString(foo);

//		List<Group> listGroup = new ArrayList<Group>();
//		
//		Group group1 = new Group();
//		group1.id = 1;
//		group1.groupNam = "Phong Sale" ;
//		listGroup.add(group1);
//		
//		Group group2 = new Group();
//		group2.id = 2;
//		group2.groupNam = "Phong Sale 2" ;
//		listGroup.add(group2);
//		
//		Group group3 = new Group();
//		group3.id = 1;
//		group3.groupNam = "Phong Sale 3";
//		listGroup.add(group3);
		
//		
//		for (Group group : listGroup) {
//			System.out.println("id: " + group.id  + "    nam: " + group.groupNam);
//		}
//		
//		Collections.sort(listGroup);
//		
//		for (Group group : listGroup) {
//			System.out.println("id: " + group.id  + "    nam: " + group.groupNam);
//		}
		
		/* Exercise 2 (Optional): Default value
		Question 1:
		Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
		tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
		 Email: "Email 1"
		 Username: "User name 1"
		 FullName: "Full name 1"
		 CreateDate: now  */
		
//		Account[] accArray = new Account[5];
//		for (int i = 0; i < accArray.length; i++) {
//			Account accounti = new Account();
//			accounti.email = "Email " + i;
//			accounti.useName = "User nam " + i;
//			accounti.fullName = "Full nam " + i;
//			accounti.createDate = LocalDate.now();
//			System.out.println(accounti.createDate);
//
//		}
			
		/*Exercise 3(Optional): Boxing & Unboxing
		Question 1:
		Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
		Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
		float có 2 số sau dấu thập phân)*/
		
//		Integer Salary = 5000;
//		float doiSalary =(float)Salary;
//		System.out.println(doiSalary);
		
//		Exercise 4: String
//		Question 1:
//		Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//		thể cách nhau bằng nhiều khoảng trắng );
 	
//		
//		Scanner scanner = new Scanner(System.in);
//		String nhapXauKyTu = scanner.nextLine();
//		System.out.println(nhapXauKyTu);
//		System.out.println("Số lượng các từ trong xâu kí tự đó là: " + countWords(nhapXauKyTu));
//		
//		Question 2:
//			Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("-----------Question 2 ------------");
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("Nhập vào chuỗi 1: ");
//		String s1 = scanner.nextLine();
//		System.out.println("Nhập vào chuỗi 2: ");
//		String s2 = scanner.nextLine();
//		System.out.println("Kết quả sau khi nối chuỗi: " + s1 + " " + s2);
//		scanner.close();
		
//		
//		Question 3:
//			Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư viết hoa chữ cái đầu thì viết hoa lên
		
//		question3();
		
//		Exercise 5: Object’s Method
//		Question 1:
//		In ra thông tin của phòng ban thứ 1 (sử dụng toString())
		Department department1 = new Department();
		department1.id = 1;
		department1.nameDepartment = "Sale";
		Department department2 = new Department();
		department2.id = 2;
		department2.nameDepartment = "Marketing";
		Department department3 = new Department();
		department3.id = 3;
		department3.nameDepartment = "Boss of director";
		Department department4 = new Department();
		department4.id = 4;
		department4.nameDepartment = "Waiting room";
		Department department5 = new Department();
		department5.id = 5;
		department5.nameDepartment = "Account";
	
		List<Department> listDepartments = new ArrayList<Department>();		
		listDepartments.add(department1);
		listDepartments.add(department2);
		listDepartments.add(department3);
		listDepartments.add(department4);
		listDepartments.add(department5);
		for (Department department : listDepartments) {
			System.out.println(department.toString());
		}
		
//		Question 3:
//			In ra địa chỉ của phòng ban thứ 1
		System.out.println(department1.hashCode());
		
		exercise5question4(department1);
		
//		Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
//		không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
		exercise5question5(department1, department5);
		
//		Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
		
		Collections.sort(listDepartments);
		for (Department department : listDepartments) {
			System.out.println("Danh sách phòng ban là: " + department.nameDepartment);
		}
		
		
		
		
		
		
	}
	
	
	public static int countWords(String input) {
        if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB 
                    && input.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }
	
	
	public static void question3() {
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("Nhập Tên: ");
		name = scanner.nextLine();
		String firstCharacter = name.substring(0, 1).toUpperCase();
		String leftCharacter = name.substring(1);
		name = firstCharacter + leftCharacter;
		System.out.println(name);
		scanner.close();
	}
	
	public static void exercise5question4(Department department) {
		if (department.nameDepartment.equals("Phòng A")) {
		System.out.println("Có tên là phòng A");
		} else {
		System.out.println("Không tên là phòng A");
		}
		}
	public static void exercise5question5(Department department1, Department department2) {
		if (department1.equals(department2)) {
		System.out.println("Có bằng nhau !");
		} else {
		System.out.println("Không bằng nhau !");
		}
	}
	
	
	
	

}
