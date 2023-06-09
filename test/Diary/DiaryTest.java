package Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary myDiary;
    @BeforeEach
    public void setUp(){
       myDiary = new Diary("Godwin","Correct password");
    }
    @Test
    public void diaryClassExist(){
        Diary myDairy = new Diary("Godwin","Correct password");
       assertNotNull(myDairy);
    }
    @Test
    public void newDiaryIsLocked(){
     assertTrue(myDiary.isLocked());
    }
    @Test
    public void lockedDiaryCanBeUnlocked(){
        assertTrue(myDiary.isLocked());
        myDiary.unlockedWith("Correct password");
        assertFalse(myDiary.isLocked());
    }

    @Test
    public void wrongPasswordCannotUnlockDiary(){
      assertTrue(myDiary.isLocked());
      myDiary.unlockedWith("wrong password");
      assertTrue(myDiary.isLocked());
    }
    @Test
    public void diaryCanBeLockedTest(){
        myDiary.unlockedWith("Correct password");
        assertFalse(myDiary.isLocked());
        myDiary.locked();
        assertTrue(myDiary.isLocked());
    }
    @Test
    public void happeningsCanBeAddedToTheDiary(){
        myDiary.unlockedWith("Correct password");
        assertFalse(myDiary.isLocked());
        myDiary.write("My break up with Simi","i would do anything to make him suffer");
        assertEquals(1,myDiary.numberOfHappenings());
    }
    @Test
    public void entriesCannotBeEnteredWhenDiaryIsLocked(){
        assertTrue(myDiary.isLocked());
myDiary.unlockedWith("Correct password");
assertFalse(myDiary.isLocked());
        myDiary.write("Good day","wahala don dey for coding o");
        assertEquals(1, myDiary.numberOfHappenings());
    }
    @Test
    public void entriesCanBeFoundById(){
        myDiary.unlockedWith("Correct password");
        assertFalse(myDiary.isLocked());
        myDiary.write("Good day","wahala don dey for coding o");
        assertEquals(1, myDiary.numberOfHappenings());
        Happenings foundEntry = myDiary.foundEntryWithId(1);
        assertEquals(1,foundEntry.getId());
        assertEquals("Good day",foundEntry.getTitle());
        assertEquals("wahala don dey for coding o",foundEntry.getBody());
    }

    @Test
    public void writingToDiaryExceptionHandling(){
        assertTrue(myDiary.isLocked());
        try {
            myDiary.write("my breakup with simi","i did not do anything to him, he just came back");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
