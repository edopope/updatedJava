package Activities;


import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int book = 0;
        while (book != -1) {
            System.out.println("WELCOME TO NOKIA 3310\n\nPRESS:1::PHONE" +
                    "BOOK\n PRESS:2::MESSAGES\n PRESS:3::CHAT\n PRESS:4::CALL REGISTE" +
                    "R\n PRESS:5::TONES\n PRESS:6::SETTINGS\n PRESS:99:: TO OFF DEVICE");
            int nokia = input.nextInt();

            switch (nokia) {
                case 1:
                    System.out.println("PHONEBOOK\n" +
                            "1:SEARCH\n 2:SERVICE NOS\n 3ADD NAME\n ERASE\n 5:EDIT\n 6:ASSIGN TONE\n 7:SEND B CARD\n" +
                            "8:OPTIONS\n     1-> TYPE OF VIEW\n     2:MEMORY STATUS   \n 9:SPEED DIAL\n 10:VOICE TAGS\n\n" +
                            "PRESS 100: TO GO BACK T MAIN MENU\n\n PRESS:99 TO EXIT");
                    int phonebook = input.nextInt();
                    if (phonebook == 100) {
                        continue;
                    } else if (phonebook == 99) {
                        break;
                    }
                    break;
                case 2:
                    System.out.println("MESSAGE\n\n 1:WRITE MESSAGES\n 2:INBOX\n 3:OUTBOX\n 4:PICTURE MESSAGES\n 5:TEMPLATES\n" +
                            "6:SMILEYS\n 7:MESSAGE SETTINGS\n      1:SET\n     1:MESSAGE CENTRE NUMBER\n     MESSAGE SENT AS\n     MESSAGE VALIDITY\n 2:   COMMON\n" +
                            "     1:DELIVERY REPORTS\n     2:REPLY VIA SAME CENTER\n      3:CHARACTER SUPPORT\n      4:INFO SERVICES\n      5:" +
                            "VOICE MAILBOX NUMBER\n      6:SERVICE COMMAND EDITOR\n PRESS 100: TO GO BACK T MAIN MENU\n  PRESS:99 TO EXIT\n");
                    int message = input.nextInt();
                    if (message == 100) {
                        continue;
                    } else if (message == 99) {
                        break;
                    }
                    break;
                case 3:
                    System.out.println("CHATS\n\n" +
                            "SERVICE COMING SOON\n PRESS 100: TO GO BACK T MAIN MENU\n  PRESS:99 TO EXIT\n");
                    int chat = input.nextInt();
                    if (chat == 100) {
                        continue;
                    } else if (chat == 99) {
                        break;
                    }
                    break;
                case 4:
                    System.out.println("CALL REGISTER\n\n 1:MISSED CALLS\n 2:RECEIVED CALLS\n 3:DIALLED NUMBER\n 4:ERASE RECENT CALL LIST\n 5:SHOW CALL DURATION\n" +
                            "     1:LAST CALL DURATION\n      2:ALL CALLS DURATION\n      3:RECEIVED CALL DURATION\n      4:DIALLED CALLS DURATION\n      5:CLEAR TIMERS\n" +
                            "6:SHOW CALL COST\n      1:LAST CALL COST\n      2:ALL CALL COST\n      3:CLEAR COUNTERS\n 7:CALL COST SETTINGS\n      1:CALL COST LIMIT\n      2:SHOW COST IN PREPAID CREDIT \n PRESS 100: TO GO BACK TO MAIN MENU\n PRESS:99 TO EXIT\n");
                    int call = input.nextInt();
                    if (call == 100) {
                        continue;
                    } else if (call == 99) {
                        break;
                    }
                    break;
                case 5:
                    System.out.println("TONES\n\n 1:RINGING TONE\n 2:RINGING VOLUME\n 3:INCOMING CALL ALERT\n 4:COMPOSER\n 5:MESSAGE ALERT TONE\n 6:KEYPAD TONE\n 7:WARMING AND GAME TONES\n" +
                            "8:VIBRATING ALERT\n 9:SCREEN SAVER\n\n  PRESS 100: TO GO BACK T MAIN MENU\n PRESS:99 TO EXIT\n");
                    int tone = input.nextInt();
                    if (tone == 100) {
                        continue;
                    } else if (tone == 99) {
                        break;
                    }
                    break;
                case 6:
                    System.out.println("SETTINGS\n\n 1:CALL SETTINGS\n      1:AUTOMATIC REDIAL\n      2:SPEED DIALLING\n      3:CALL WAITING OPTIONS\n      4:OWN NUMBER SENDING\n" +
                            "      5:PHONE LINE IN USE\n      6:AUTOMATIC ANSWER\n 2:PHONE SETTING\n      1:LANGUAGE\n      2:CELL INFO DISPLAY\n      3:WELCOME NOTES\n      4:NETWORK SELECTION\n" +
                            "     5:LIGHTS\n      6:CONFIRM SIM SERVICE ACTIONS 3:SECURITY SETTINGS\n      1:PIN CODE REQUEST\n      2:CALL BARRING SERVICE\n 3:     FIXED DIALLING\n" +
                            "4:     CLOSED USER GROUP\n 5:     PHONE SECURITY\n 6:     CHANGE ACCESS CODE\n 4:RESTORE FACTORY SETTING\n " +
                            "5:CALL DIVERT\n 6:GAMES\n 7:CALCULATOR\n 8:REMINDER\n 9:CLOCK\n  1:ALARM CLOCK\n      2:CLOCK SETTING\n      3:DATE SETTING\n 4:     STOPWATCH\n 5:     COUNTDOWN TIMER\n" +
                            "6:AUTO UPDATE OF DATE AND TIME\n 7:PROFILES\n 8: SIM SERVICES\n PRESS 100: TO GO BACK T MAIN MENU \n PRESS:99 TO EXIT\n");
                    int setting = input.nextInt();
                    if (setting == 100) {
                        continue;
                    } else if (setting == 99) {
                        break;
                    }
                case 99:
                    int quite = 99;
                    if (quite == 99) {
                        break;
                    }
            }
        }
    } 
}