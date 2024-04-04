package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		
        String[] numbers = numLine.split(" "); //	공백 문자를 기준으로 분할 

        for (String numStr : numbers) {
            sum += Integer.parseInt(numStr);
        }
        
//		for (int i = 0; i < numbers.length; i++) {     
//			int num = Integer.parseInt(numbers[i]);
// 			sum += num;
//        }
//        
        
        System.out.println("합:" + sum);
		
		sc.close();
	}

}
