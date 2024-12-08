import java.util.Scanner;

public class IT24104235Lab5Q1{
public static void main(String[]args) {

Scanner input= new Scanner(System.in);
int numberone,numbertwo,numberthree,smallest,largest;
System.out.print("Enter the first integer: ");
numberone=input.nextInt();

System.out.print("Enter the second integer: ");
numbertwo=input.nextInt();

System.out.print("Enter the third integer: ");
numberthree=input.nextInt();

smallest=numberone;
largest=numberone;

System.out.println("User entered numbers are :" +numberone+" " +numbertwo+" " +numberthree);

if (numbertwo<smallest) {
smallest=numbertwo; }

else if (numberthree<smallest) {
smallest=numberthree; }


System.out.println("The Smallest number is: " + smallest );

if (numbertwo>largest) {
largest=numbertwo; }

else if (numberthree>largest) {
largest=numberthree; }

System.out.println("The Largest number is: " + largest );

}
}




 
  




