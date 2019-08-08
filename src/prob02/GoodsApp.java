package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Goods[] gs = new Goods[3]; 
		
		
			for(int i = 0; i < COUNT_GOODS; i++) {
				String info = scanner.nextLine();
				//System.out.println(info);
				
				String[] data = info.split(" ");
				
				String name = data[0];
				int price = Integer.parseInt(data[1]);
				int countStock = Integer.parseInt(data[2]);
				
				gs[i] = new Goods(name, price, countStock);
				
			}

		
		
		for(int i=0; i < gs.length; i++) {
			System.out.println(gs[i].getGood()+"(가격:"+ gs[i].getPrice() 
					+"원)이"+ gs[i].getStock() +"개 입고 되었습니다.");
		}
		
		scanner.close();
	}
}
