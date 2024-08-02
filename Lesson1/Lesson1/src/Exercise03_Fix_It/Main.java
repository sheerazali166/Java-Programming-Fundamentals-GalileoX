package Exercise03_Fix_It;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Date(int year, int month, int date)
        Date birthDate = new Date(1987, 0, 22);
        Date expirationDate = new Date(2017, 0, 13);

        long id = 1287564540101L;
        Passport myPassport = new Passport(id, "Jennie", "Smith", "Austrian", birthDate, expirationDate, 'F');

        if (myPassport.isExpired() == true) {
            System.out.println("You need to renew your passport");

        } else {
            System.out.println("Your passport is still valid");
        }

        System.out.println(myPassport.firstName);
        System.out.println(myPassport.lastName);
        System.out.println(myPassport.nationality);
        System.out.println(myPassport.gender);
        System.out.println(myPassport.getGender());
        System.out.println(myPassport.passportNumber);
        System.out.println(myPassport.getFullName());
        System.out.println(myPassport.birthDate);
        System.out.println(myPassport.expirationDate);


    }
}
