package americana.nokia3310;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        System.out.println("Nokia");
        System.out.print("""
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

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

//        switch (userInput){
//            case
//        }
    }
}
