package SOLID_principles.open_closed;

public class TransferedStudent implements Inscription {

    private String previousStudies;

    public TransferedStudent(String _previousStudies) {
        this.previousStudies = _previousStudies;
    }

    @Override
    public PaperWork procedure(int id) {

        System.out.println("Transfered of Inscription Student");

        return new PaperWork(id, false, "InProcess", "Inscription", this.previousStudies);
    }
}
