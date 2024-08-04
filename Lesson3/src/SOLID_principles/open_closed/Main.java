package SOLID_principles.open_closed;

import java.util.ArrayList;

public class Main {

    private static ArrayList<PaperWork> arrayListPaperWorkUniversityProcedures = new ArrayList<PaperWork>();
    private static int idCounter = 17000;

    public static void main(String[] args) throws Exception {

        // Inscriptions
        newInscription(new FirstYearStudent("Personal Identity Document Data"));
        newInscription(new ReEntryStudent("14101010"));
        newInscription(new TransferedStudent("Previous Study on X University"));

        System.out.println("\nProcedures");

        for (PaperWork paperWorkProcedure: arrayListPaperWorkUniversityProcedures) {
            System.out.println(paperWorkProcedure);
        }
    }

    // interface instance
    public static void newInscription(Inscription inscription) {

        arrayListPaperWorkUniversityProcedures.add(inscription.procedure(idCounter));
        idCounter = idCounter + 1;
    }

}
