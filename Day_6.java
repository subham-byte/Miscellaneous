package Miscellaneous;
import java.util.*;


public class Day_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Booking> bookings = new ArrayList<>();

        System.out.print("Enter the number of rooms: ");
        int numberOfRooms = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        for (int i = 0; i < numberOfRooms; i++) {
            System.out.println("Select room type for room " + (i + 1) + " (gold, silver, premium): ");
            String roomType = scanner.nextLine();

            Room room = new Room(roomType);
            room.displayServices();

            System.out.print("Do you want to proceed with booking this room? (yes/no): ");
            String proceed = scanner.nextLine();

            if (proceed.equalsIgnoreCase("yes")) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();

                System.out.print("Enter your phone number: ");
                String phoneNumber = scanner.nextLine();

                System.out.print("Enter your Aadhar number: ");
                String aadharNumber = scanner.nextLine();

                Booking booking = new Booking(name, phoneNumber, aadharNumber, room);
                bookings.add(booking);
            }
        }

        System.out.println("All bookings:");
        for (Booking booking : bookings) {
            booking.displayBookingDetails();
            System.out.println();
        }

        scanner.close();
    }
}

class Room {
    String type;
    double price;
    String[] services;

    Room(String type) {
        this.type = type;
        switch (type.toLowerCase()) {
            case "gold":
                this.price = 5000.00;
                this.services = new String[]{"Free Breakfast", "Free WiFi", "Swimming Pool"};
                break;
            case "silver":
                this.price = 3000.00;
                this.services = new String[]{"Free Breakfast", "Free WiFi"};
                break;
            case "premium":
                this.price = 7000.00;
                this.services = new String[]{"Free Breakfast", "Free WiFi", "Swimming Pool", "Gym Access"};
                break;
            default:
                throw new IllegalArgumentException("Invalid room type");
        }
    }

    public void displayServices() {
        System.out.println("Services for " + type + " room:");
        for (String service : services) {
            System.out.println("- " + service);
        }
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}

class Booking {
    String name;
    String phoneNumber;
    String aadharNumber;
    Room room;

    Booking(String name, String phoneNumber, String aadharNumber, Room room) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.aadharNumber = aadharNumber;
        this.room = room;
    }

    public void displayBookingDetails() {
        System.out.println("Booking Details:");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Aadhar Number: " + aadharNumber);
        System.out.println("Room Type: " + room.getType());
        System.out.println("Price: " + room.getPrice());
        room.displayServices();
    }
}
