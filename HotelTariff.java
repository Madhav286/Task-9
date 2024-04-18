package javabasics.OOPS;
import java.util.Scanner;

public class HotelTariff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the room rent per day: ");
        double roomRent = scanner.nextDouble();
        System.out.print("Enter the number of days stayed: ");
        int daysStayed = scanner.nextInt();
        scanner.close();

        double totalTariff;
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                totalTariff = roomRent * daysStayed * 1.20; // 20% higher during peak season
                break;
            default:
                totalTariff = roomRent * daysStayed;
                break;
        }

        System.out.printf("Hotel tariff: %.2f\n", totalTariff);
    }
}

    
