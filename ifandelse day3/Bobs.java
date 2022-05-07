/*Exercise 2   Last Chance Gas
Al's Last Chance Gas station sits on Route 190 on the edge of Death Valley. There is no other
gas station for 200 miles. Write a program to help drivers decide if they need gas. The program
asks for:
  The capacity of the gas tank, in gallons.
  The indication of the gas gauge in percent (full= 100, three quarters full = 75, and so on).
  The miles per gallon of the car.
The program then writes out "Get Gas" or "Safe to Proceed" depending on if the car can cross
the 200 miles with the gas remaining in the tank.
Tank capacity:
12
Gage reading:
50
Miles per gallon:
30
Get Gas!
Use integers for all input and all arithmetic*/

 import java.util.*;
   class last chance
{
   public static void main(String[] args)


{

   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Tank capacity");
   int a=sc.nextInt();
   System.out.println("Enter gage reading ");
   int b=sc.nextInt();
   System.out.println("Enter miles per gallon");
   int c=sc.nextInt();
   int total=0;
   total=a+b+c;
{
   System.out.println(total);
   }
   if(total<=100 || total>75)
   {
    System.out.println("gas is full");

   }
   else if(total<=75 || total>50)
   {
   System.out.println("gas is three quater full ");

   }
   
   else if(total<50)
   {
   System.out.println("get the gas ");

   }
   else
   {
   System.out.println("No Gas present");
   }
   
   
}
}