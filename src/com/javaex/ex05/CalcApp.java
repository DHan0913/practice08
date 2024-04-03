package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		String operator = "";
		while (0 < 1) {

			System.out.print(">>");
			Scanner sc = new Scanner(System.in);
			String numLine = sc.nextLine();
			if (numLine.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			} else {
				String[] numbers = numLine.split(" ");
				int num1 = Integer.parseInt(numbers[0]);
				operator = numbers[1];
				int num2 = Integer.parseInt(numbers[2]);

				switch (operator) {
				case "+":
					Add add = new Add();
					add.setValue(num1, num2);
					System.out.println(add.calculate());
					break;
				case "-":
					Sub sub = new Sub();
					sub.setValue(num1, num2);
					System.out.println(sub.calculate());
					break;
				case "*":
					Mul mul = new Mul();
					mul.setValue(num1, num2);
					System.out.println(mul.calculate());
					break;
				case "/":
					Div div = new Div();
					div.setValue(num1, num2);
					System.out.println(div.calculate());
					break;
				default:
					System.out.println("알 수 없는 연산입니다");
				}
			}
		}

	}

}
