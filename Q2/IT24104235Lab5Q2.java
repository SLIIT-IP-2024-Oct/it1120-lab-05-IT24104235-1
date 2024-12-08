import java.util.Scanner;

   public class IT24104235Lab5Q2 {
   public static void main (String[]args) {

     int num_of_members;

     Scanner input= new Scanner(System.in);

     System.out.print("Enter the number of new members: ");
     num_of_members = input.nextInt();

     System.out.println();

     if (num_of_members<0) {
     System.out.print("Input must be a number 0 or greater"); }
     else if (num_of_members>0) {

     System.out.print("Prize is a: ");

     switch (num_of_members) {
     case 0:
     System.out.println("No prize");
     break;

     case 1:
     System.out.println("Pen");
     break;

     case 2:
     System.out.println("Umbrella");
     break;

     case 3:
     System.out.println("Bag");
     break;

     case 4:
     System.out.println("Travelling Chair");
     break;

     default:
     System.out.println("Head Phone");
     break;
     }


     }


}
}