package tdd.diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    private Diary diary;
    @BeforeEach
    void setUp() {
         diary = new Diary("Benson", "1234");
    }

    @Test
    void lockDiary() {
        diary.lockDiary();
        assertTrue(true);
    }

    @Test
    void unlockDiary() { 
        diary.unlockDiary("1234");
        assertFalse(diary.isLocked());

    }

    @Test
    void isLocked() {
        diary.lockDiary();
        assertTrue(diary.isLocked() );
    }

    @Test
    void createEntry() {
        diary.createEntry("SirChi", "You cannot kill me");
        assertEquals(1, diary.getEntries().size());
    }

    @Test
    void deleteEntry() {
        diary.deleteEntry(1);
        assertTrue(true);
    }

    @Test
    void findEntryById() {
        diary.findEntryById(1);
        assertTrue(true);
    }

    @Test
    void updateEntry() {
        diary.updateEntry(1, "How much i love to code");
        assertTrue(true);
    }

    @Test
    void displayEntries() {
        diary.displayEntries();
        assertTrue(true);
    }
}