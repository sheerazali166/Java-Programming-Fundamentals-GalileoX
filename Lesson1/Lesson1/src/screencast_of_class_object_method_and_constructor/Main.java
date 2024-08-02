package screencast_of_class_object_method_and_constructor;

public class Main {

    public static void main(String[] args) {

        Human humanJennieSmith = new Human("Jennie", "Smith", 'F');
        humanJennieSmith.setBirthDate(1987, 1, 22);
        System.out.println(humanJennieSmith.getFullName() + " is " + humanJennieSmith.getAge() + " years old");


        Human humanJohn = new Human("John", "Brown", 'M');
        humanJohn.setBirthDate(1986, 12, 8); // December 08th, 1986

        System.out.println(humanJohn.getFullName() + " is " + humanJohn.getAge() + " years old");
        humanJennieSmith.addPartner(humanJohn);

        System.out.println(humanJennieSmith.getFullName() + "'s partner is " + humanJennieSmith.getPartnerName());
        System.out.println(humanJohn.getFullName() + "'s partner is " + humanJohn.getPartnerName());


    }

}
