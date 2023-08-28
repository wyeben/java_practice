package tdd.diary;

public class MainApplication {
    public static void main(String[] args) {
        Diary diary = new Diary("Benson", "1234");
        diary.createEntry("Semicolon", "Thank you!");

        PersonalDiary personalDiary = new PersonalDiary("Yila Benson", "1234", "Yila Benson");
        personalDiary.createEntry("Today", "Today is a good day.");

        System.out.println("Diary Entries:");
        diary.displayEntries();

        System.out.println("\nToday diary Entries");
        personalDiary.displayEntries();
    }
}
