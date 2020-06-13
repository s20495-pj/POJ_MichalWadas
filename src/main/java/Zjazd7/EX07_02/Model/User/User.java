package Zjazd7.EX07_02.Model.User;

/**
 * summary: Implement exercise 07_02: User
 * author: Michal Wadas
 **/
public class User {
    private String name;
    private String lastName;
    private String login;
    private String email;
    private int trustPoints = 0;

    public String getName() {
        return name;
    }

    public User() {
    }

    public User(String name, String lastName, String login, String email, int trustPoints) {
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.email = email;
        this.trustPoints = trustPoints;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTrustPoints() {
        return trustPoints;
    }

    public void addTrustPoint() {
        trustPoints++;
    }

    public void removeTrustPoint() {
        trustPoints--;
    }
}
