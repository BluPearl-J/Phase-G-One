//1.write app that asks user to enter two integers,
//obtains them from the user and prints square of each, 
//the sum of their squares, and 
//difference of the squares first number squared minus second number squared

//2. write app that inputs three integers from user and displays sum ,
//average ,product and largest


import java.util.Scanner;
public class TwoInput{

public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.println("Enter first input:");
int one=input.nextInt();

System.out.println("Enter second input:");
int two =input.nextInt();

int sumSquares=(one*one)+(two*two);
// one**2

int differenceSquares=(one*one)-(two*two);

System.out.println("Sum of squares of input is:", sumSquares);
System.out.println("Difference of squares of input is:", differenceSquares);
}
}