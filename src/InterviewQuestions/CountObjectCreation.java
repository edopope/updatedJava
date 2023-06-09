package InterviewQuestions;

public class CountObjectCreation {
    private String name;
    private String lastName;
    private static int count=0;

    public CountObjectCreation(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        ++count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getCount() {
        return count;
    }





    public static void main(String[] args) {
        CountObjectCreation firstObject = new CountObjectCreation("john","Doe");
        CountObjectCreation SecondObject = new CountObjectCreation("john","Doreen");
        CountObjectCreation thirdObject = new CountObjectCreation("jane","Dorcas");

        System.out.println(getCount() +"\n");
        System.out.println(getCount() + "\n");
        System.out.println(getCount());
        //System.out.println(CountObjectCreation.count);
    }
}
