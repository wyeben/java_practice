package tdd.diary;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;
    private int entryIdCounter;

    public Diary(String username, String password){
        this.username = username;
        this.password = password;
        this.isLocked = false;
        this.entries = new ArrayList<>();
        this.entryIdCounter = 1;
    }
    public void lockDiary(){
        isLocked = true;
    }
    public void unlockDiary(String password){
        if(password.equals(this.password)){
            isLocked = false;
        }else {
            System.out.println("Incorrect password");
        }
    }
    public boolean isLocked(){
        return isLocked;
    }
    public void createEntry(String title, String body){
        if(!isLocked){
            Entry entry = new Entry(entryIdCounter++, title, body, LocalDateTime.now());
            entries.add(entry);
            System.out.println("Entry created with ID: " + entry.getId());
        }else {
            System.out.println("Diary is lock. Cannot create entry.");
        }
    }
    public void deleteEntry(int entryId){
        if(!isLocked){
            entries.removeIf(entry -> entry.getId() == entryId);
        }else {
            System.out.println("Diary is locked. Cannot delete entry.");
        }
    }
    public Entry findEntryById(int entryId){
        return entries.stream().filter(entry -> entry.getId() == entryId).findFirst().orElse(null);
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void updateEntry(int entryId, String newBody){
        if(!isLocked){
            Entry entryToUpdate = findEntryById(entryId);
            if(entryToUpdate != null){
                entryToUpdate.setBody(newBody);
                System.out.println("Entry " + entryId + " updated.");
            }else {
                System.out.println("Entry not found.");
            }
        }else {
            System.out.println("Diary is locked. Cannot update entry");
        }
    }
    public void displayEntries(){
        for(Entry entry : entries){
            entry.display();
            System.out.println();
        }
    }
}