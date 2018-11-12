package com.biz.ex001;

public class Gugudan {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			guguDan(i);
		}
	}

	public static void guguDan(int dan) {

		for (int j = 1; j < 10; j++) {
			System.out.println(dan + "x" + j + "=" + dan * j);
		}
		System.out.println("=======");
	}

}
