package InterviewQuestions;

import java.util.Arrays;
import java.util.Objects;

public class DuplicateString {
    public static void main(String[] args) {
      String name = "my boy is good and wise boy";
       char[] arrayName = name.toCharArray();
       int count;
        for (int i = 0; i < arrayName.length ; i++) {
            count = 1;
            int j;
            for (j = i + 1; j < arrayName.length; j++) {
                if (arrayName[i] == arrayName[j] && arrayName[i] != ' ') {
                    count++;
                    //arrayName[j] = '0';
                }
            }
            if (count > 1 && arrayName[i] != '0')
                System.out.print(arrayName[i]);

        }


       }
    }
