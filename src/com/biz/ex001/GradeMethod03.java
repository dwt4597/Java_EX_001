package com.biz.ex001;

public class GradeMethod03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intKor = makeGrade();
		int intEng = makeGrade();
		int intMath = makeGrade();
		int intSci = makeGrade();
		
		int korEng = gradeSum(intKor,intEng);
		int MathSci = gradeSum(intMath,intSci);
		 // int intSum = gradeSum(intKor, intEng);
		 // intSum += gradeSum(intMath, intSci);
		
		System.out.printf("국:%d, 영:%d, 수:%d, 과:%d \n 총점 = %d\n ", intKor, intEng,intMath, intSci, korEng + MathSci);
		System.out.println("평균:" +  ((float)(korEng + MathSci) /4));
		
	}
	public static int makeGrade() {
		int turnup = (int) (Math.random() * (100 - 50 + 1)) + 50; // 50부터 100까지 return ;
		return turnup;
	}
	
	public static int gradeSum(int grade1, int grade2) { //매개변수 2개까지만?
		return grade1 + grade2;
	}
}
