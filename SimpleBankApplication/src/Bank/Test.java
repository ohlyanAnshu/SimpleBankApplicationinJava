package Bank;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name = sc.nextLine();	
		
		System.out.println("Please enter your customer Id");
		int id = sc.nextInt();	
		
		UserAccount user = new UserAccount(name, id);
		
		user.menu();

	}

}
