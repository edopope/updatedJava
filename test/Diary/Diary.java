package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private  String userName;
    private boolean isLocked = true;
    private String password;
    private List<Happenings> events;
private int counterForEvents;
    public Diary(String userName, String password) {
        this.password = password;
        events = new ArrayList<>();
        this.userName = userName;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlockedWith(String password) {
        boolean makePassword = password.equals(this.password);
        if (makePassword) isLocked = false;
    }

    public void locked() {
        isLocked = true;
    }

    public void write(String title, String body){
        if (isLocked) throw new IllegalArgumentException("OGA YOU CANT WRITE IN A LOCKED DIARY");
writeIntoDiary(title, body);

    }

        private void writeIntoDiary (String title, String body) {
            int id = numberOfHappenings() + 1;
            Happenings happens = new Happenings(id, title, body);
            events.add(happens);
        }

    public int numberOfHappenings() {
        return events.size();

    }

    public Happenings foundEntryWithId(int id) {
        for (Happenings happenings: events){
            if (happenings.getId() == id)return happenings;
        }
        return null;
    }
}