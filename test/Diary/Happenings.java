package Diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Happenings {
    private String title;
    private String body;
    private LocalDateTime timeHappened;
      private int id;

    public Happenings( int id, String title, String body) {
        this.title = title;
        this.body = body;
        this.id = id;
        timeHappened = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        String time = DateTimeFormatter.ofPattern("EEE, dd/MM/yyyy, hh:mm:ss a").format(timeHappened);


        return String.format("""
               ======================
               Entry %s
               Written on%s
               Title: %s
               Body: %s
               
               ========================""",id, time, title, body);

    }
}
