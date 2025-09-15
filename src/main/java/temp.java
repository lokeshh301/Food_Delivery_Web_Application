import com.proj.models.Menu;
<<<<<<< HEAD
import com.proj.models.Order;
import com.proj.models.OrderItem;
=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
import com.proj.models.Restaurant;
import com.proj.models.Users;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.proj.DOAImp.*;

public class temp {
	
<<<<<<< HEAD
//	static Restaurant getRestarant() {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter RestaurantId: ");
//		int restaurantId = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Name: ");
//		String name = sc.nextLine();
//		System.out.println("Enter Address: ");
//		String address = sc.nextLine();
//		System.out.println("Enter Phone: ");
//		String phone = sc.nextLine();
//		System.out.println("Enter cusineType: ");
//		String cusineType = sc.nextLine();
//		System.out.println("Enter DeliveryTime: ");
//		String minutes = sc.nextLine();
//		
//		System.out.println("Enter Admin User Id: ");
//		int adminUserId = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter rating: ");
//		String rating = sc.nextLine();
//		System.out.println("Enter isActive: ");
//		String isActive = sc.nextLine();
//		System.out.println("Enter imagePath: ");
//		String imagePath = sc.nextLine();
//
//		Restaurant r = new Restaurant(restaurantId, name, address, phone, cusineType, minutes, adminUserId, rating, isActive, imagePath );
//
//		return r;
//	}

	public static void main(String[] args) {
		
		Order order = new Order(1,2,"banglore","card",Timestamp.valueOf("2025-01-02 10:30:00"),"pending",54.6);
		
		OrderDAOImp oi = new OrderDAOImp();
		
		int i = oi.addOrder(order);
		System.out.println(i);
		
		OrderItem orderItem = new OrderItem(i,3,2,45);
		
		OrderItemDAOImp oit = new OrderItemDAOImp();
		oit.addOrderItem(orderItem);
		
		
		
		
=======
	static Restaurant getRestarant() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter RestaurantId: ");
		int restaurantId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Address: ");
		String address = sc.nextLine();
		System.out.println("Enter Phone: ");
		String phone = sc.nextLine();
		System.out.println("Enter cusineType: ");
		String cusineType = sc.nextLine();
		System.out.println("Enter DeliveryTime: ");
		String minutes = sc.nextLine();
		
		System.out.println("Enter Admin User Id: ");
		int adminUserId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter rating: ");
		String rating = sc.nextLine();
		System.out.println("Enter isActive: ");
		String isActive = sc.nextLine();
		System.out.println("Enter imagePath: ");
		String imagePath = sc.nextLine();

		Restaurant r = new Restaurant(restaurantId, name, address, phone, cusineType, minutes, adminUserId, rating, isActive, imagePath );

		return r;
	}

	public static void main(String[] args) {
		
		MenuDAOImp rest = new MenuDAOImp();
		
		List<Menu> menuRestaurant = rest.getMenuRestaurant(2);
		
		for(Menu men : menuRestaurant) {
			System.out.println(men.getItemName());
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
		}
		

			
		
		
		

	}

<<<<<<< HEAD

=======
}
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
