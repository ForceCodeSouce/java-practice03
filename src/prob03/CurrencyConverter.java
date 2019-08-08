package prob03;

public class CurrencyConverter {
	
	private static double rate;
	
	//static안에서 this는 소용없다.
	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}

	public static double toKRW(double d) {
		// TODO Auto-generated method stub
		double money = 0;
		money = d*rate;
		
		return money;
	}

	public static double toDollar(double d) {
		// TODO Auto-generated method stub
		
		double money = 0;
		money = d/rate;
		
		return money;
	}
	
}
