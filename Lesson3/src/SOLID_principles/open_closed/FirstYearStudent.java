package SOLID_principles.open_closed;

public class FirstYearStudent implements Inscription {

    private String personalIdentityDocument;

    public FirstYearStudent(String _personalIdentityDocument) {
        this.personalIdentityDocument = _personalIdentityDocument;
    }

    @Override
    public PaperWork procedure(int id) {

        System.out.println("Inscription of new Student");

        return new PaperWork(id, false, "InProcess", "Inscription", this.personalIdentityDocument);
    }
}
