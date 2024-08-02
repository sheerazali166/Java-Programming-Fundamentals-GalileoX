public class Switch_Statement {

    public static void main(String[] args) {

        System.out.println("Program 1");
        System.out.println("Without Break");

        int birthMonth = 4;

        switch (birthMonth) {
            case 1:
                System.out.println("You were born in January");
            case 2:
                System.out.println("You were born in Fabuary");
            case 3:
                System.out.println("You were born in March");
            case 4:
                System.out.println("You were born in April");
            case 5:
                System.out.println("You were born in May");
            case 6:
                System.out.println("You were born in June");
            case 7:
                System.out.println("You were born in July");
            case 8:
                System.out.println("You were born in August");
            case 9:
                System.out.println("You were born in September");
            case 10:
                System.out.println("You were born in October");
            case 11:
                System.out.println("You were born in November");
            case 12:
                System.out.println("You were born in December");
            default:
                System.out.println("Invalid Month");
        }

        System.out.println("Program 2");
        System.out.println("With Break");

        birthMonth = 4;

        switch (birthMonth) {
            case 1:
                System.out.println("You were born in January");
                break;
            case 2:
                System.out.println("You were born in Fabuary");
                break;
            case 3:
                System.out.println("You were born in March");
                break;
            case 4:
                System.out.println("You were born in April");
                break;
            case 5:
                System.out.println("You were born in May");
                break;
            case 6:
                System.out.println("You were born in June");
                break;
            case 7:
                System.out.println("You were born in July");
                break;
            case 8:
                System.out.println("You were born in August");
                break;
            case 9:
                System.out.println("You were born in September");
                break;
            case 10:
                System.out.println("You were born in October");
                break;
            case 11:
                System.out.println("You were born in November");
                break;
            case 12:
                System.out.println("You were born in December");
                break;
            default:
                System.out.println("Invalid Month");
        }

    }
}
