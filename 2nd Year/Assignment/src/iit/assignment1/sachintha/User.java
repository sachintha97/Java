package iit.assignment1.sachintha;

public abstract class User {
    // users basic details
    private String userName;
    private String userId;
    private String email;
    private String password;

    // constructor with arguments
    public User(String userName, String userId, String email, String password) {
        this.userName = userName;
        this.userId = userId;
        this.email = email;
        this.password = password;
    }

    // default constructor
    public  User(){

    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", Email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
