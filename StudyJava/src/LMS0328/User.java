package LMS0328;

import java.time.LocalDate;

public class User {
    private String userName;

    private String userId;

    private String userPassword;

    private String userPhonenumber;

    private String userEmail;

    private String userAddress;

    private String userStatus;

    private LocalDate userBirthdate;

    public User(){

    }


    public User(String userName, String userId, String userPassword, String userPhonenumber, String userEmail, String userAddress, String userStatus, LocalDate userBirthdate) {
        this.userName = userName;
        this.userId = userId;
        this.userPassword = userPassword;
        this.userPhonenumber = userPhonenumber;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userStatus = userStatus;
        this.userBirthdate = userBirthdate;
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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhonenumber() {
        return userPhonenumber;
    }

    public void setUserPhonenumber(String userPhonenumber) {
        this.userPhonenumber = userPhonenumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public LocalDate getUserBirthdate() {
        return userBirthdate;
    }

    public void setUserBirthdate(LocalDate userBirthdate) {
        this.userBirthdate = userBirthdate;
    }

    public String toString(){
        return userName + ", " + userId + ", " + userPassword + ", " + userPhonenumber + ", " + userEmail + ", " + userAddress + ", " + userStatus + ", " + userBirthdate.toString();
    }

}
