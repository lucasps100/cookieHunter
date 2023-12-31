package cookies.cookieHunter;

import java.util.Scanner;
import java.util.Random;

public class cookieHunter {

    public static void main(String[] args) {
        String[] rooms = {"Office", "Living Room", "Kitchen", "Garage", "Bathroom"};
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int cookieRoomNumber = random.nextInt(1,rooms.length - 1);
        System.out.println(cookieRoomNumber);
        String cookieRoom = rooms[cookieRoomNumber];
        boolean hasCookie = false;
        boolean leftOffice = false;
        boolean exit = false;
        String currentRoom = "Office";
        System.out.println("Welcome to Cookie Hunter!\n" +
                "Find the cookie and get back to the office.\n");

        while(!exit) {

            switch(currentRoom) {

                case "Office":

                    if (hasCookie) {
                        System.out.println("You win!");
                        exit = true;
                    } else if (leftOffice) {
                        System.out.println("You lose!");
                        exit = true;
                    } else {

                        System.out.println("1. Go to Living Room.\n" +
                                "2. Go to Kitchen.\n" +
                                "3. Go to Garage.\n" +
                                "4. Go to Bathroom");
                        currentRoom = rooms[Integer.parseInt(console.nextLine())];
                        leftOffice = true;
                    }
                    break;

                case "Living Room":
                    System.out.println("1. Go back to Office.\n" +
                            "2. Look around.\n" +
                            "3. Go to Kitchen.\n" +
                            "4. Go to Garage.\n" +
                            "5. Go to Bathroom");
                    currentRoom = rooms[Integer.parseInt(console.nextLine()) - 1];
                    if (currentRoom.equals("Living Room")) {
                        if (cookieRoomNumber == 1) {
                            hasCookie = true;
                            System.out.println("Congrats! Your found the cookie!");
                        } else {
                            System.out.println("No cookie!");
                        }
                    }
                        break;
                case "Kitchen":
                    System.out.println("1. Go back to Office.\n" +
                            "2. Go to Living Room.\n" +
                            "3. Look around.\n" +
                            "4. Go to Garage.\n" +
                            "5. Go to Bathroom");
                    currentRoom = rooms[Integer.parseInt(console.nextLine()) - 1];
                    if (currentRoom.equals("Kitchen")){
                        if(cookieRoomNumber == 2) {
                            hasCookie = true;
                            System.out.println("Congrats! Your found the cookie!");
                        } else {
                            System.out.println("No cookie!");
                        }
                    }
                        break;

                case "Garage":
                    System.out.println("1. Go back to Office.\n" +
                            "2. Go to Living Room.\n" +
                            "3. Go to Kitchen.\n" +
                            "4. Look around.\n" +
                            "5. Go to Bathroom");
                    currentRoom = rooms[Integer.parseInt(console.nextLine()) - 1];
                    if (currentRoom.equals("Garage")){
                        if(cookieRoomNumber == 3) {
                            hasCookie = true;
                            System.out.println("Congrats! Your found the cookie!");
                        } else {
                            System.out.println("No cookie!");
                        }
                    }
                        break;

                case "Bathroom":
                    System.out.println("Don't eat bathroom cookies!");
                    currentRoom = "Office";
                    break;
            }
        }






    }
}
