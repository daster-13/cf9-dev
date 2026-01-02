package gr.aueb.cf.cf9.ch11;

public class User {
    private long id;
    private String firstname;
    private String Lastname;
    private String username;
    private String password;
    private boolean active;

    public User(){

    }

    public User(boolean active, String password, String username, String lastname, String firstname, long id) {
        this.active = active;
        this.password = password;
        this.username = username;
        Lastname = lastname;
        this.firstname = firstname;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}
