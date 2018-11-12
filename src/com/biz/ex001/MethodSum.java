package com.biz.ex001;

public class MethodSum {

	public static void main(String[] args) {
		int intReturn = retSum(50);
		System.out.println(intReturn);
		/*
		 * int intNum = 50; 
		 * System.out.println(retSum(intNum));
		 */
	}

	public static int retSum(int intNum) {
		intNum += 100;
		return intNum;
	}

}
