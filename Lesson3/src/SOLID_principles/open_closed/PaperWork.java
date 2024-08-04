package SOLID_principles.open_closed;

public class PaperWork {

    private int id;
    private boolean automated;
    private String state;
    private String typeOfProcedure;
    private String information;

    public PaperWork(int _id, boolean _automated, String _state, String _typeOfProcedure, String _information) {

        this.id = _id;
        this.automated = _automated;
        this.state = _state; // "InProcess" "Aproved" "Rejected"
        this.typeOfProcedure = _typeOfProcedure; // "Inscription" "AssignCourses" "UnAssignCourses" ...
        this.information = _information; // Some data to store

    }

    public String toString() {
        return this.id + " " + this.state + " " + typeOfProcedure + " " +
                ((this.automated) ? "Automated" : "Manual") + "\n\t" + this.information;
    }
}
