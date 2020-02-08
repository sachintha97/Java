package lk.iit.lecture03;

public class Person {

    private String fName;
    private String lName;
    private String dob;
    private String phoneNo;
    private String address;
    private String emailId;

    public Person(String fName, String lName, String dob, String phoneNo, String address, String emailId) {
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.phoneNo = phoneNo;
        this.address = address;
        this.emailId = emailId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override    //overriding method in the super class
    public String toString() {
        return "lk.iit.lecture03.Person{" +"fName='" + fName + '\'' + ", lName='" + lName + '\'' +
                ", dob='" + dob + '\'' +", phoneNo='" + phoneNo + '\'' +", address='" + address + '\'' +
                ", emailId='" + emailId + '\'' + '}';
    }
}
