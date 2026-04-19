package L07.oop.fundamental.Task06MediumThisKeywordLab;

public class UserProfile {

    private String userName;
    private String email;
    private boolean active;

    public UserProfile (String userName, String email, boolean active) {
        this.userName = userName;
        this.email = email;
        this.active = active;
    }

    public UserProfile (String userName, String email) {
        this(userName, email, true);
    }

    public void setUserName (String userName) {
        this.userName = userName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setActive (boolean active) {
        this.active = active;
    }

    public void printInfo () {
        System.out.printf("User name : %s\nEmail : %s\nActive : %b", this.userName, this.email, this.active);
    }
}
