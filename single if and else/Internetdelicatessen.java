/*Exercise 1 — Internet Delicatessen
You have been asked to write a program for the Sam and Ella Delicatessen. The program takes
daily orders from the Internet. It asks for the item, its price in cents, and if express delivery is
wanted. The program writes out the order and the charges. Regular delivery for items under $10
is $2.00; for items $10 or more delivery is free. For express delivery add $3.00.
Enter the item: Tuna Salad
Enter the price: 4.50
Overnight delivery (0==no, 1==yes): 1
Invoice:
 Tuna Salad 4.50
 delivery 5.00
 total 9.50
*/

import java.util.Scanner;

public class FantasyGame {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character : ");
        String name = ob.next();
        System.out.println("Enter strength (1-10): ");
        int strength = ob.nextInt();
        System.out.println("Enter health (1-10): ");
        int health = ob.nextInt();
        System.out.println("Enter luck (1-10): ");
        int luck = ob.nextInt();
        if(strength+health+luck > 15){
            System.out.println("You have to give your character too many points! Default values have been assigned: ");
            strength=health=luck = 5;
            System.out.println("Name : "+name + ". Strength :  " + strength + ". Health : "+health + ". Luck : "+ luck);
        }else{
            System.out.println("Your character points are : ");
            System.out.println("Name : "+name + ". Strength :  " + strength + ". Health : "+health + ". Luck : "+ luck);
        }
    }
}