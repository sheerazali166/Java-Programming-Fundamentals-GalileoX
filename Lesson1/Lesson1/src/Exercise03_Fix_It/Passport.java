package Exercise03_Fix_It;

import java.util.Date;

public class Passport {

    long passportNumber;
    String firstName;
    String lastName;
    String nationality;
    Date birthDate, expirationDate;
    char gender; // 'F' for female, 'M' for male

    public Passport(long _id, String _firstName, String _lastName, String _nationality, Date _birthDate, Date _expirationDate, char _gender) {

        this.passportNumber = _id;
        this.lastName = _lastName;
        this.firstName = _firstName;
        this.nationality = _nationality;
        this.birthDate = _birthDate;
        this.expirationDate = _expirationDate;
        this.gender = _gender;
    }

    public char getGender() {
        return this.gender;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public boolean isExpired() {

        Date todayDate = new Date();

        // the current year represented by this date, minus 1900 for today.
        int currentYear = todayDate.getYear() + 1900;
        int expirationYear = expirationDate.getYear();

        if (expirationYear < currentYear) {
            return true;
        }

        while (currentYear == expirationYear) {
            int currentMonth = todayDate.getMonth();
            int expirationMonth = expirationDate.getMonth();

            if (currentMonth > expirationMonth) {
                return true;

            } else if (currentMonth == expirationMonth) {
                int currentDay = todayDate.getDate();
                int expirationDay = expirationDate.getDate();

                if (currentDay >= expirationDay) {
                    return true;
                }
            }
        }
        return true;
    }
}
