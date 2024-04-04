package com.javaex.ex05II;

import java.util.Scanner;

import com.javaex.ex05.Add;
import com.javaex.ex05.Div;
import com.javaex.ex05.Mul;
import com.javaex.ex05.Sub;

public class CalcApp {

	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		int result = 0;
		// 루프
		while (true) {
			System.out.print(">>");
			// 한 라인을 입력
			String numLine = sc.nextLine();
			// 라인이 /q면 종료
			if (numLine.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}
			String [] data = numLine.split(" ");
			int num1 = Integer.parseInt(data [0]);
			String operator = data [1];
			int num2 = Integer.parseInt(data [2]);
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
