package Chapter2;

public class CommonTask {
    private String firstName;
    private String lastName;

    public CommonTask(String fName,String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }
        public void setFirstName(String firstName1){
if(firstName1.length() < 5 ){
    throw new IllegalArgumentException("Name length must be above 5");
}
            this.firstName = firstName1;

        }
        public String getFirstName(){
        return firstName;
        }

    public static void main(String[] args) {
        CommonTask task = new CommonTask("", "john");
        task.setFirstName("gloria");
        System.out.printf("%s is the first name",task.getFirstName());
    }
    }

