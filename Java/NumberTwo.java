//1.write app that asks user to enter two integers,
//obtains them from the user and prints square of each, 
//the sum of their squares, and 
//difference of the squares first number squared minus second number squared

//2. write app that inputs three integers from user and displays sum ,
//average ,product and largest


import java.util.Scanner;
public class NumberTwo{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.println("Enter first input:");
int one=input.nextInt();

System.out.println("Enter second input:");
int two =input.nextInt();


System.out.println("Enter third input:");
int three =input.nextInt();


int product=(one*two*three);
int largest=one;
if(two>largest||three>largest){
largest=two||three;}

int sum=one+two+three;

System.out.println("sum of inputs is:", sum);
int average= sum/3;




System.out.println("Product of inputs is:", product);
System.out.println("largest is:",largest);
System.out.println("average is:",average);
}
}