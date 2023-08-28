package tdd.diary;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(int id, String title, String body, LocalDateTime dateCreated) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getBody() {
        return body;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Body: " + body);
        System.out.println("Date Created: " + dateCreated);
    }
}
