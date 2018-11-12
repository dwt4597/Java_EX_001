package com.biz.ex001;

public class RndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 0;
		int intSum = 0;
		int intAvg = 0;
		for (index = 0; index < 16; index++) {
			int intNum = (int) (Math.random() * (100 - 50 + 1)) + 50; // 50부터 100까지
			intSum += intNum;
			intAvg += intSum / 16;
			System.out.println(intNum);
		}
		System.out.println("------------------");
		System.out.println("합계 : " + intSum);
		intAvg = intSum / index;
		System.out.println(intSum / index);
	}

}
