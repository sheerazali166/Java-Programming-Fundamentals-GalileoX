package SOLID_principles.single_responsibility;

// Class is just responsible of managing worker data
public class Worker {

    private int baseSalary;
    private int workHours;
    private int extraHoursPerMonth;
    private int id;

    private String completeName;
    private String jobTitle;

    public Worker(int _id, int _baseSalary, int _workHours, String _completeName, String _jobTitle) {

        this.id = _id;
        this.baseSalary = _baseSalary;
        this.workHours = _workHours;
        this.completeName = _completeName;
        this.jobTitle = _jobTitle;

    }

    public Worker addWorkersExtraHour(int _extraHoursPerMonth) {

        this.extraHoursPerMonth += _extraHoursPerMonth;
        return this;

    }

    public void resetWorkersExtraHour() {
        this.extraHoursPerMonth = 0;
    }

    public int getWorkersBaseSalary() {
        return this.baseSalary;
    }

    public int getWorkersWorkHours() {
        return this.workHours;
    }

    public int getWorkersExtraHours() {
        return this.extraHoursPerMonth;
    }

    public String getWorkersCompleteName() {
        return this.completeName;
    }

    public String getWorkersJobTitle() {
        return this.jobTitle;
    }

    public String toString() {
        return this.completeName + " " + this.jobTitle;
    }
}
