package ChibuzoAssignment;

public class Occurence{
    public static boolean OccurIndex(String[] names, String name){
        boolean element = false;
          for(String alphabet : names){
              if (alphabet == name) {
                  element = true;
                  break;
              }
          }
          return element;
    }


    public static void main(String[] args) {
        String[] colour = {"blue", "green","red","orange"};
        String find = "orange";
        System.out.println(OccurIndex(colour, "yellow  "));
    }

}
