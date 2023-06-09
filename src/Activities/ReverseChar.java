package Activities;

public class ReverseChar {
    public static void main(String[] args) {
        char [] name = {'s','e','m','i','c','o','l','o','o','n'};
        char [] newName = new char[name.length];
        for (int i = name.length - 1; i >= 0; i--) {
            newName[i] = name[i];
        System.out.print(newName[i] + " ");
        }
    }
}
