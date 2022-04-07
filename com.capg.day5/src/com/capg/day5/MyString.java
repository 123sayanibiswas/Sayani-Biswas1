package com.capg.day5;

public class MyString {
	public static void main(String[] args) {
		String str = "Sayani";
		String str1 = new String("Sayani");
		String str2 = "Biswas";
		if (str.equalsIgnoreCase(str1)) {
			System.out.println(str1==str2);
		} else {
			System.out.println(str1.equals(str2));
		}
		String one = "A";
		String two = "A";
		System.out.println(one.compareTo(two));
		str.charAt(0);
		System.out.println(str.concat(str2));
		System.out.println(str.contains("Say"));
		System.out.println(str.indexOf("a"));
		String str4 = "";
		System.out.println(str.length());
		str.replace("a", "u");
		System.out.println(str.replace("a", "u"));
		System.out.println(str.subSequence(1, 2));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		String str6 = " sayani biswas ";
		System.out.println(str6.trim());
		System.out.println(str6);
//index value		//0 1 2 3 4 5
//     		       //S a y  a n i
//location		   //1 2 3  4 5 6
		System.out.println(str.subSequence(0, 3));

	}

}
