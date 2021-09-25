import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation{
	
	static ArrayList<ViewHotel> listOfHotels = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("Welcome to hotel reservation System");
		
		ViewHotel lakeWood = new ViewHotel();
		lakeWood.hotelName("LakeWood");
		lakeWood.hotelRate(110);
		listOfHotels.add(lakeWood);
		
		ViewHotel rightWood = new ViewHotel();
		rightWood.hotelName("rightWood");
		rightWood.hotelRate(140);
		listOfHotels.add(rightWood);
		
		ViewHotel bridgeWood = new ViewHotel();
		bridgeWood.hotelName("bridgeWood");
		bridgeWood.hotelRate(220);
		listOfHotels.add(bridgeWood);
		

		ViewHotel lakeWoodForWeekend = new ViewHotel();
		lakeWoodForWeekend.hotelName("lakeWoodForWeekendRate");
		lakeWoodForWeekend.hotelRate(90);
		listOfHotels.add(lakeWoodForWeekend);
		

		ViewHotel rightWoodForWeekend = new ViewHotel();
		rightWoodForWeekend.hotelName("rightWoodForWeekendRate");
		rightWoodForWeekend.hotelRate(100);
		listOfHotels.add(rightWoodForWeekend);
		
		ViewHotel bridgeWoodforWeekend = new ViewHotel();
		bridgeWoodforWeekend.hotelName("bridgeWoodforWeekendRate");
		bridgeWoodforWeekend.hotelRate(150);
		listOfHotels.add(bridgeWoodforWeekend);
		
		viewHotels();
		cheapHotels();
	}

	private static void cheapHotels() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days u want to stay: ");
		int days = sc.nextInt();
		
		int rateOfLakeWood = ( days * 110);
		int rateOfRightWood = ( days * 140);
		int rateOfBridgeWood = ( days * 220);
		
		if (rateOfLakeWood < rateOfRightWood || rateOfLakeWood < rateOfBridgeWood) {
			System.out.println("Best will LakeWood For you it will cost you " + rateOfLakeWood);
		} else if (rateOfRightWood < rateOfLakeWood || rateOfRightWood < rateOfBridgeWood) {
			System.out.println("Best will RightWood For you it will cost you " + rateOfRightWood);
		} else {
			System.out.println("Best will RightWood For you it will cost you " + rateOfBridgeWood);
		}
		
	}

	private static void viewHotels() {
		for (int i = 0; i<listOfHotels.size();i++) {
			System.out.println(listOfHotels.get(i));
		}
		
		
	}
}