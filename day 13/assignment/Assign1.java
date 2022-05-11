/*1
Handle exception in number Problem statement: 
Get the input String from user and parse it to integer, if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid 
format for an integer." or else print the square of that number. (Refer Sample Input and Output). 
Sample input and output 1: Enter an integer: 12 The square value is 144 The work has been done 
successfully Sample input and output 2: Enter an integer: Java Entered input is not a valid format for an 
integer.*/

import java.util.*;


class Assign1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b;

System.out.println("enter a number " );
try{

a=sc.nextInt();

b=a*a;

System.out.println("square is = " +b);

}catch(InputMismatchException e){
System.out.println("Entered input is not a valid format for an integer.");
}

System.out.println("end");
}
}