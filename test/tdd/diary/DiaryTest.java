package tdd.diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    private Diary diary;
    @BeforeEach
   public void setUp() {
         diary = new Diary("Benson", "1234");
    }

    @Test
    public void canLockDiary() {
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void canUnlockDiary() {
        diary.unlockDiary("1234");
        assertFalse(diary.isLocked());

    }

    @Test
    public void canCreateEntry() {
        diary.createEntry("SirChi", "You cannot kill me");
        assertEquals(1, diary.getEntries().size());
    }

    @Test
    public void canDeleteEntry() {
        diary.deleteEntry(1);
        assertEquals(0, diary.getEntries().size());
    }

    @Test
    public void canFindEntryById() {
        diary.findEntryById(1);
        assertEquals(0, diary.getEntries().size());

    }

    @Test
    public void canUpdateEntry() {
        diary.updateEntry(1, "How much i love to code");
        assertEquals(0, diary.getEntries().size());

    }

    @Test
    public void canDisplayEntries() {
        diary.displayEntries();
        assertEquals(0, diary.getEntries().size());
    }
}