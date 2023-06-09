package Activities;
import java.util.Scanner;
public class Native {
    private int scv;
    private String name;
    private static int counter;
    public void setScv(){
    this.scv = scv;
    }
    public void setName(){
        this.name = name;
    }
    public int getScv(){
        return scv++;
    }
    public String getName(){
        return name;
    }
    public Native(){
        scv = ++counter;
    }

    public static void main(String[] args) {
        Native godwin = new Native();
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name");
        String name = input.nextLine();
        godwin.setName();
        System.out.printf("%d%s%n",godwin.getScv(),godwin.getName());
        Native sam = new Native();
        System.out.println(sam.getScv());

    }
}
