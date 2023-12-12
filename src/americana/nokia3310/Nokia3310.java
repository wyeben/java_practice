package americana.nokia3310;

import java.util.Scanner;

public class Nokia3310 {

    public void menu() {
        System.out.println("""
                Select
                1. Phone Book
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. Sim Services""");
    }

    public void phoneBook() {
        System.out.println("""
                1. Search
                2. Service numbers
                3. Add Name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send B'card
                8. Options
                9. Speed dials
                10. Voice tags""");
    }

    public void search() {
        System.out.println("Searching...");
    }

    public static void main(String[] args) {
        Nokia3310 nokia3310 = new Nokia3310();
        boolean exit = false;
        System.out.println("""
                Nokia
                Date/Time
                Insert Sim1
                Insert Sim2
                press 1 to insert sim""");
        do {

            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            switch (userInput) {

                case 1:
                    System.out.println("Sim inserted successfully");
                    System.out.println("press 2 to view menu");
                    break;
                case 2:
                    System.out.println("Displaying menu...");
                    nokia3310.menu();
                    System.out.println("press 0 to switch off");
                    break;
                case 0:
                    exit = true;
                    System.out.println("Goodbye...");
                default:
                    System.out.println("Invalid input");

                    break;
            }
        }while(!exit);

        }
    }

