package Lec1.q1.iit;

public class Address {

    int houseNumber;
    String street;
    int apartmentNumber;
    String city;
    String state;
    int postalCode;

    //constructor of the class Address
    public Address(int houseNumber, String street ,int apartmentNumber , String city ,String state ,int postalCode)
    {
        this.houseNumber = houseNumber;
        this.street = street;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    //constructor of the class Address without apartment number
    public Address(int houseNumber, String street , String city , String state , int postalCode)
    {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    // Print Address details
    public void printAddress() {
        System.out.println(this.street);
        System.out.println(this.city + "," + this.state + "," + this.postalCode);

    }

    // Addresses are compared by postal code
    public boolean comesBefore(Address other) {
        return (this.postalCode < other.postalCode);
    }

}
