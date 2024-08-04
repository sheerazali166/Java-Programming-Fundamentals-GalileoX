package SOLID_principles.open_closed;

public class ReEntryStudent implements Inscription {

    private String studentId;

    public ReEntryStudent(String _studentId) {
        this.studentId = _studentId;
    }

    @Override
    public PaperWork procedure(int id) {

        System.out.println("Inscription of ReEntry Student");

        return new PaperWork(id, true, "InProcess", "Inscription", this.studentId);
    }
}
