package backjoon.윤년;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int year = 0;
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		//4의 배수이면서 100의 배수가 아니라서 윤년
		if(year%4==0) {
			if(year%100!=0) System.out.println("1");
		} else System.out.println("0");
		if(year%100 == 0) {
			if(year%400 != 0) System.out.println("0");
			else System.out.println("1");
		}
	}
}
