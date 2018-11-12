package com.biz.ex001;

public class GradeMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intKor = 70;
		int intEng = 70;
		int intMath = 70;
		int intSci = 55;

		System.out.println(GradeSum(intKor, intEng, intMath, intSci));
	}

	public static float GradeSum(int intKor, int intEng, int intMath, int intSci) {
		return ((float)(intKor + intEng + intMath + intSci)) / 4;

	}
	/*
	 * public static float GradeSum(float intKor, float intEng, float intMath, float intSci) {
		-> 이건 나중에 잠재적 오류발생 가능성 있음.
		
		return (intKor + intEng + intMath + intSci) / 4;

	}
	 * 
	 * */

}
