package com.vcentry.arrays;

public class ArrayChallenge {

	public static void main(String[] args) {

		reverseWordsInString("This , is , my,string");

	}

	public static String[]  reverseWordsInString(String str) {

		String strArr[] = str.split(",");
		System.out.println(strArr.length);
		int startIndex = (strArr.length - 1);

		for (int i =startIndex ; i >= 0; i--) {
			System.out.printf("%S", strArr[i]);
		}
       return strArr;
	}

}
