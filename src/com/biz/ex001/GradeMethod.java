package com.biz.ex001;

public class GradeMethod {

	public static void main(String[] args) {
		int intKor = 60;
		int intEng = 90;
		int intMath = 80;

		intKor = 60;
		intEng = 90;
		intMath = 80;

		/*int intSum = gradeSum(intKor, intEng, intMath);
		System.out.println(intSum);*/
		System.out.println(gradeSum(intKor, intEng, intMath));
	}

	public static int gradeSum(int intKor, int intEng, int intMath) {
		intKor = 60;
		intEng = 90;
		intMath = 80;

		int intSum = intKor + intEng + intMath;
		//System.out.println(intSum);
		return intSum;
	}
}