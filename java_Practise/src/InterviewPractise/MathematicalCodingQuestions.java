package InterviewPractise;

import java.util.ArrayList;
import java.util.Arrays;

public class MathematicalCodingQuestions {

	// Armstrong number
	public static void checkArmStrong(int n) {
		int sum = 0, r = 0, temp = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + (r * r * r);

		}
		String result = sum == temp ? "is armstrong" : " is not a armstrong";
		System.out.println("given number " + result);
	}

	/*-------------------------------------------------------------------------------------------------------------*/
	// reverse number
	public static void reversTheNumber(int n) {
		int r = 0, num = 0, temp = n;
		while (n != 0) {
			r = n % 10;
			num = num * 10 + r;
			n = n / 10;
		}
		System.out.println(" reverse number is :- " + num);
	}

	/*-------------------------------------------------------------------------------------------------------------*/
	// factorial
	public static void factorialNumber(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial number of the " + fact);
	}

	/*-------------------------------------------------------------------------------------------------------------*/
	// even number and odd number
	public static void evenAndOdd(int a[]) {
		ArrayList<Integer> even = new ArrayList<Integer>();

		ArrayList<Integer> odd = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even.add(a[i]);
			} else if (a[i] % 2 != 0) {
				odd.add(a[i]);
			}

		}
		System.out.println("the even number present inside array is ");
		System.out.println(even);

		System.out.println("the odd number present inside array is ");
		System.out.println(odd);
	}

	/*-------------------------------------------------------------------------------------------------------------*/
	// prime number
	public static boolean checkPrimeNumber(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}

		return true;
	}

	/*-------------------------------------------------------------------------------------------------------------*/
	// sum of digits
	public static void sumOfDigits(int a) 
	{
		int r =0,sum=0;
		while(a!=0) {
			r=a%10;
			sum=sum+r;
			a=a/10;
		}
		System.err.println(sum);
	}

	/*-------------------------------------------------------------------------------------------------------------*/

	// palindrome (its logic is same for reverseNumber)
	public static void checkPalindrome(String str) {

		String reversedString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString = reversedString + str.charAt(i);
		}
		String result = reversedString.equals(str) ? "is a palindrome" : " is not a palindrome";
		System.out.println("the given string " + result);

	}

	/*-------------------------------------------------------------------------------------------------------------*/
	// fibonacci series

	public static void fibonacciMethod(int a) {
		int num1 = 0, num2 = 1;
		for (int i = 0; i < a; i++) {
			System.err.println(num1 + " ");
			int sumNumber = num2 + num1;
			num1 = num2;
			num2 = sumNumber;

		}
	}

	/*-------------------------------------------------------------------------------------------------------------*/
	// anagram (the both string should have same alphabets and count of them also)

	public static boolean checkAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char str1Array[] = str1.toCharArray();
		char str2Array[] = str2.toCharArray();
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		boolean result = Arrays.equals(str1Array, str2Array);
		System.out.print(result);
		return result;

	}

	
	public static void main(String args[]) {
//		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 13, 15, 45, 63, 98, 62, 36, 55, 66, 44, 77 };
//		checkArmStrong(153);
//		reversTheNumber(153264567);
//		factorialNumber(10);
//		evenAndOdd(a);
//		System.out.println(checkPrimeNumber(7));
//		checkPalindrome("ama");
//		fibonacciMethod(10);

//		String str1="shubham";
//		String str2="hsbhama";
//		checkAnagram(str1,str2);
		
//		

		sumOfDigits(15645);
	}

}
