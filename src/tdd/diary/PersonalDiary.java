package tdd.diary;

public class PersonalDiary extends Diary{
    private String owner;

    public PersonalDiary(String username, String password, String owner) {
        super(username, password);
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }

    @Override
    public void createEntry(String title, String body) {
        super.createEntry(title, body);
    }

    @Override
    public void displayEntries() {
        System.out.println("Personal Diary for " + owner);
        super.displayEntries();
    }
}
