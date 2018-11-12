package com.biz.ex001;

public class RndStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intStars = (int) (Math.random() * (9 - 5 + 1)) + 5; // 
		makeStar(intStars);
	}

	public static void makeStar(int intStars) {
		System.out.println(intStars + "개의 별 찍기");
		for (int j = 0; j < intStars; j++) {
			for (int i = 1; i <= intStars; i++) {

				System.out.print("* ");

			}
			System.out.println();

		}
	}
}
