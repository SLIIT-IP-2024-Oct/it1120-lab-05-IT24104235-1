import java.util.Scanner;

public class IT24104235Lab5Q3 {

    public static final double ROOM_CHARGE_PER_DAY = 48000;
    public static final int DISCOUNT_RATE_3_TO_4_DAYS = 10;
    public static final int DISCOUNT_RATE_5_OR_MORE_DAYS = 20;
    public static final int MIN_DATE = 1;
    public static final int MAX_DATE = 31;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter start date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter end date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < MIN_DATE || startDate > MAX_DATE || endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: Date must be between 1 and 31.");
            return; }
        

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return; } 

        int numberOfDays = endDate - startDate;

        double totalRoomCharge = numberOfDays * ROOM_CHARGE_PER_DAY;
        int discount = 0;

       
        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discount = DISCOUNT_RATE_3_TO_4_DAYS;
        } else if (numberOfDays >= 5) {
            discount = DISCOUNT_RATE_5_OR_MORE_DAYS; }
       
        double discountAmount = (discount / 100.0) * totalRoomCharge;
        double totalAmountToPay = totalRoomCharge - discountAmount;

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);
        
        System.out.println("Number of days reserved: " + numberOfDays);
       
        System.out.println("Total amount to be paid: Rs " + totalAmountToPay);
    }
}
