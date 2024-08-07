package dom_parser;

public class Student {
    String id;
    String active;
    String firstName;
    String lastName;
    String location;

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + "(" + this.id + ")" + this.location + " active: " + this.active;
    }
}
