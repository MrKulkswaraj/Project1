package calculator;

import java.util.Scanner;

class Arithematiccal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		int n1 = sc.nextInt();
		System.out.println("Enter the Second number");
		int n2=sc.nextInt();
		//Adding n1,n2----->n1+n2
		System.out.printf("Addition of %d and % d will be %d\n",n1,n2,add(n1,n2));
		//Subtracting n1,n2----->n1-n2
		System.out.printf("Subtraction of %d and % d will be %d\n",n1,n2,sub(n1,n2));
		//Multiplying n1,n2----->n1*n2
		System.out.printf("Multiplication of %d and % d will be %d\n",n1,n2,mul(n1,n2));
		//Dividing n1,n2----->n1/n2
		System.out.printf("Division of %d and % d will be %.1f\n",n1,n2,div(n1,n2));
		}
		// Adding of two numbers
		 static int add(int a,int b) {
			
			return (a+b);
		}
		// Subtraction of two numbers
		static int sub(int a,int b) {
			
			return (a-b);
		}
		// Multiplication of two numbers
		static int mul(int a,int b) {
		
		return (a*b);
		}
		// Division of two numbers
		static double div(int a,int b) {
		
		return (a/b);


	}

}
