import java.io.*;

class Customer implements Serializable {
    private int id;
    private String name;
    private String contactNo;
    private String address;

    public Customer(int id, String name, String contactNo, String address) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }
    public void serialize(String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(this);
            System.out.println("Serialization successful.");
        }
       catch (IOException e) {
            System.err.println("Serialization failed: " + e.getMessage());
        }
    }

}

public class serialise{
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Ptalasu", "9876543210", "Srklm");

        customer.serialize("JavaObject.txt");
    }
}