

import java.util.List;
import java.util.Scanner;

import com.proj.models.Users;

public class CRUDEOperation {

	static void printAllUsers(List<Users> list) {
		for (Users u : list) {
			printUser(u);

		}
	}

	static void printUser(Users u) {
		System.out.println("id : " + u.getUserId());
		System.out.println("Name : " + u.getUserName());
		System.out.println("User Name : " + u.getUserName());
		System.out.println("Password : " + u.getPassword());
		System.out.println("eMail : " + u.getEmail());
		System.out.println("Phone No. : " + u.getPhone());
		System.out.println("Address : " + u.getAddress());
		System.out.println("Role : " + u.getRole());
		System.out.println("Creaed Date : " + u.getCreateDate());
		System.out.println("Last Login Date : " + u.getLastLoginDate());
	}

//	static Object getInput() {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter UserId: ");
//		String userId = sc.nextLine();
//		System.out.println("Enter Name: ");
//		String name = sc.nextLine();
//		System.out.println("Enter UserName: ");
//		String userName = sc.nextLine();
//		System.out.println("Enter Password: ");
//		String password = sc.nextLine();
//		System.out.println("Enter Email: ");
//		String eMail = sc.nextLine();
//		System.out.println("Enter Phone: ");
//		String phone = sc.nextLine();
//		System.out.println("Enter Number: ");
//		String number = sc.nextLine();
//		System.out.println("Enter Address: ");
//		String address = sc.nextLine();
//		System.out.println("Enter Role: ");
//		String role = sc.nextLine();
//
//		Users u = new Users(userId, name, userName, password, eMail, phone, address, role, null, null);
//
//		return u;
//	}

}
