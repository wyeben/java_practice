package americana.nokia3310;

import java.util.Scanner;

public class Nokia3310 {

    public void menu(){
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
    public void phoneBook(){
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
    public void search(){
        System.out.println("Searching...");
    }

    public static void main(String[] args) {
        System.out.println("Nokia");
        Nokia3310 nokia3310 = new Nokia3310();
        nokia3310.menu();

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        switch (userInput){
            case "1":
                System.out.println("Phonebook opened");
                nokia3310.phoneBook();
                System.out.println("Press 0 to go back");
                String userInput2 = scanner.nextLine();
                switch (userInput2){
                    case "1":
                        nokia3310.search();
                        break;
                }
                break;
        }
        }
    }

