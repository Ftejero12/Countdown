
/**
Create a new program called CountDown.

Print “This is a countdown!” in quotation marks.

Use a for loop to count down from 25.

Print the numbers.

Print “Blast Off!” in quotation marks once count down ends.

 */
//Felipe Tejero
// Section 33993
public class CountDown
{
 public static void main(String[] args)
 {
     System.out.println("This is a countdown!");
     for (int i = 25; i >= 0; i--)
     {
         System.out.println(i + "");
 }
 System.out.println("Blast Off");
 rocket();

}
public static void rocket()
{
    System.out.println("   /\\");
    System.out.println("  /  \\");
    System.out.println(" /    \\");
    System.out.println("+------+");
    System.out.println("|      |");
    System.out.println("|      |");
    System.out.println("+------+");
    System.out.println("| U.S.A|");
    System.out.println("+------+");
    System.out.println("|      |");
    System.out.println("|      |");
    System.out.println("+------+");
    System.out.println("   /\\");
    System.out.println("  /  \\");
    System.out.println(" /    \\");
    
}
}
