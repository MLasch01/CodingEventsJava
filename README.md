The Person class holds user information.  It extends AbstractEntity to generate a user ID like the other Models.  
It initializes fields for the users; fistName, lastName, userName, email, password, and varifies the password.

@Entity
public class Person extends AbstractEntity {

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String fistName;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String lastName;

    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters.")
    private String username;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String email;

    @Size(min = 6, message = "Password must be at least 6 characters.")
    private String password;

    @NotNull(message = "Passwords do not match.")
    private String verifyPassword;

    public User(String username, String email, String password, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }

    public String getfirstName() {
        return username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstNamee;
    }

    public String getlastName() {
        return username;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        checkPassword();
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }

    public void checkPassword() {
        if (password !=null && verifyPassword !=null && !password.equals(verifyPassword)) {
            setVerifyPassword(null);
        }
    }
    }

    The Person class would have a One-to-Many relationship with Events to select any number of available Events to attend.
    Future imporvements could add an ArrayList to Events to save users who say they will attend each event.
