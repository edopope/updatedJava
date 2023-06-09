package chapter11;

public class Phone {
private String name;
private String serialNumber;

public Phone(String myName, String number){
validationException(myName,number);
    this.name = myName;
    this.serialNumber = number;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public static void validationException(String name, String serialNumber){
    if (name.isEmpty()){
        throw new RuntimeException("name cannot be empty") {
        };

    }
   if (serialNumber.length() < 16){
       throw new RuntimeException("Serial number must be above 16 digits");


   }
    }

    public static void main(String[] args) {
        Phone telephone = new Phone("asa","12345121212887989");
        System.out.printf("%s%n%s",telephone.getName(),telephone.serialNumber);
    }
}

