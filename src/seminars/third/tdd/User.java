package seminars.third.tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }

    public boolean getIsAuthenticated() {
        return isAuthenticate;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}