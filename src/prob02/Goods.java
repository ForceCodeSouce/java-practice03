package prob02;

public class Goods {
	
	private String good;
	private int price, stock;
	
	
		
	public Goods(String good, int price, int stock) {
		super();
		this.good = good;
		this.price = price;
		this.stock = stock;
	}
	
	public String getGood() {
		return good;
	}
	public void setGood(String good) {
		this.good = good;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	@Override
	public String toString() {
		return "Goods [상품=" + good + "(가격: " + price +")이" + stock +"개 입고 되었습니다" + "]";
	}
	
}
