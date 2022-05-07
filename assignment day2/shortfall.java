/*Exercise 1
The following program uses primitive data type short:
public class Shortfall
{
public static void main ( String[] args )
{
short value = 32;
System.out.println("A short: " + value);
}
}
value in this program is a variable—a name for a section of memory that holds data using a
particular data type. In this case value is the name for 16 bits of main memory that uses short
to represent an integer. (The next chapter says much more about variables.) This program puts
the value 32 into value. Then it writes out:
A short: 32
In other words, that line of the program examines the variable and writes out what it finds.
Your Job: Create a file called Shortfall.java that contains this program. (Copy and paste will
greatly speed this up.) Compile and run the program. Check what it writes onto the screen. Now
edit the program so that the 32 is changed to some other small number, say 356. Compile and run
the program. Everything should be fine.
Next change the number to 35000 and try to compile and run the program. This number is too
large to work with the data type short (in other words, it cannot be represented in 16 bits using
data type short.) What happens?
Now edit the program (don't change the 35000) so that the data type is int. Compile and run the
program. Is there a difference?
*/

public class shortfall{
public static void main(String[] args){
    short value = 32;
    System.out.println("A short:"+value);
}
}

