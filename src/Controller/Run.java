package Controller;

import Model.Calendar;
import Model.User;
import view.AuctioneerMenu;
import view.BidderMenu;

import java.time.LocalDate;
import java.util.Scanner;

public class Run {
	
	private static User user;
	private static String userType;
	public static LocalDate DATE = LocalDate.now();
	public static Calendar CALENDAR = new Calendar(DATE);
	

	public static void main(String[] args) {
		login();
		
		
		openMenu("Organization");
		
	}
	
	private static void login() {
		System.out.println("Welcome to Auction Central");
		//System.out.print("Please provide your username:");
//		Scanner scan = new Scanner(System.in);
//		String username = scan.nextLine();
		
		// retrieve user from serialized object
	}
	
	public static void openMenu(String userType) {
		if (userType == "Bidder") {
			BidderMenu bMenu = new BidderMenu();
			bMenu.launchMenu();
		} else if (userType == "Organization" ) {
			//AuctioneerMenu aMenu = new AuctioneerMenu(CALENDAR);
		//	aMenu.launchMenu();
		}
	}
}
