package code_parser_sax;

public class Student {

    String id;
    String active;
    String firstName;
    String lastName;
    String location;

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + "(" + this.id + ")" + this.location + " Active: " + this.active;
    }
}
