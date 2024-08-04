package serialize_object;

import java.io.Serializable;

public class UserProfile implements Serializable {

    private String name;
    private String email;
    private String themeColor;

    public transient String something;

    public UserProfile(String _name, String _email, String _themeColor, String _something) {

        this.name = _name;
        this.email = _email;
        this.themeColor = _themeColor;
        this.something = _something;

    }

    public String toString() {
        return "User: " + this.name +
                "\nEmail: " + this.email +
                "\nTheme Color: " + this.themeColor +
                "\nSomething (transeient): " + this.something;
    }

}
