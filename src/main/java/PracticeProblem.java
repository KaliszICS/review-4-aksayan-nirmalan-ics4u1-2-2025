import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		System.out.print("Input an integer: ");
		String word= "5";
		System.out.println(5 + word);
		int num= Integer.parseInt(word);
	}

	public static void q2() {
		//Write question 2 code here
		System.out.print("Input a number: ");
		String word= "453";
		double num= Double.parseDouble(word);
		System.out.println(num+3.4);
	
	}

	public static void q3() {
		//Write question 3 code here
		System.out.print("Input a boolean: ");
		String word="true";
		System.out.println(Boolean.parseBoolean(word)&& false);
	}

	public static void q4() {
		//Write question 4 code here
		System.out.print("Input an integer: ");
		String word= "3";
		int num= Integer.parseInt(word);
		int x=(num +2);
		System.out.println(x+2);
	}

	public static void q5() {
		//Write question 5 code here
		System.out.print("Input an integer: ");
		String word="10";
		int num=Integer.parseInt(word);
		int x=(num/2);
		//double y=parseDouble(x) ;
		System.out.println((double)x);
	}

	public static void q6() {
		//Write question 6 code here
		System.out.print("Input a number: ");
		String word= "42";
		String num=1+word; 
		Double num1=Double.parseDouble(num);
		System.out.println((int)+num1);
	
	}

}
