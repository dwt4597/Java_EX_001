package com.biz.ex001;

public class GradeMethod02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intKor = 89;
		int intEng = 44;
		int intMath = 75;
		int intSci = 55;

		System.out.println(GradeSum(intKor, intEng, intMath, intSci) / 4);
		/*
		 * float avg = GradeSum(intKor, intEng, intMath, intSci) / 4;
		 * System.out.println(avg);
		 */
	}

	public static float GradeSum(int intKor, int intEng, int intMath, int intSci) {

		return ((float) (intKor + intEng + intMath + intSci));
		/*
		 * int sum = (intKor + intEng + intMath + intSci); 
		 * return sum;
		 */
	}

}
