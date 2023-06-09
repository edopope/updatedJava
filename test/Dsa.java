import ClassActivities.myArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dsa {


    @Test
    public void addItemToList(){
        myArrayList john = new myArrayList();
        john.add("bro code");
        assertEquals(1,john.size());
    }
    @Test
    public void addOneItemToList(){
        //todo given i have a list and when i want to add an item it adds according to index.
        myArrayList john = new myArrayList();
        john.add("bro code");

    }
}
