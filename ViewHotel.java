public class ViewHotel{
	int ratePerDay;
	String hotelName;
	int rateForWeekend;
	
	public void hotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public void hotelRate(int ratePerDay) {
		this.ratePerDay = ratePerDay;
	}
	
	public void rateForWeekend(int rateForWeekend) {
		this.rateForWeekend = rateForWeekend;
	}
	
	public String toString() {
		return "Hotel" + " Name is " + hotelName + " And Rate per day is " + ratePerDay + "\n"; 
	}
}