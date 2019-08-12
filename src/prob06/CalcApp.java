package prob06;

import java.util.Scanner;

/*
 * 작성자 : 안태영
 * 코드명 : 자바 Console 계산기
 */
public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Add ad = new Add();
		Div dd = new Div();
		Mul md = new Mul();
		Sub sb = new Sub();

		while (true) {

			System.out.print(">> ");
			String expression = scanner.nextLine();

			String[] tokens = expression.split(" ");

			if ("quit".equals(expression)) {
				break;
			}

			// 3개가 들어가서 계산하게 되는 문제!!!
			if (tokens.length != 3) {
				System.out.println(">> 알 수 없는 식입니다.");
				continue;
			}

			/* 코드를 완성 합니다 */
			int lvalue = Integer.parseInt(tokens[0]);
			int rvalue = Integer.parseInt(tokens[2]);

			switch (tokens[1]) {
			case "+": {
				ad.add(lvalue, rvalue);
			}break;
			case "-": {
				sb.sub(lvalue, rvalue);
			}break;
			case "*": {
				md.mul(lvalue, rvalue);
			}break;
			case "/": {
				dd.div(lvalue, rvalue);
			}break;

			default: {
				System.out.println(">> 지원하지 않는 코드입니다.");
				break;
			}

			}

			//scanner.close();

		}

	}
}
