package iit.assignment1.sachintha;

public class Customer extends User {
    // customer details
    private String cAddress;
    private int cPhoneNum;

    // constructor with super class user
    public Customer(String userName, String userId, String email, String password , String cAddress, int cPhoneNum) {
        super(userName, userId, email, password);
        this.cAddress = cAddress;
        this.cPhoneNum = cPhoneNum;
    }

    // constructor
    public Customer(String cAddress, int cPhoneNum) {
        this.cAddress = cAddress;
        this.cPhoneNum = cPhoneNum;
    }

    // default constructor
    public Customer() {
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public int getcPhoneNum() {
        return cPhoneNum;
    }

    public void setcPhoneNum(int cPhoneNum) {
        this.cPhoneNum = cPhoneNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cAddress='" + cAddress + '\'' +
                ", cPhoneNum=" + cPhoneNum +
                "} " + super.toString();
    }
}
