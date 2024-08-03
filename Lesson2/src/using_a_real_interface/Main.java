package using_a_real_interface;

public class Main {

    public static void main(String[] args) {

        PokerCard pokerCardSevenOfSpades = new PokerCard(4, 7);
        PokerCard pokerCardElevenOfHearts = new PokerCard(3, 11);

        System.out.println(pokerCardSevenOfSpades.compareTo(pokerCardElevenOfHearts));
        System.out.println(pokerCardElevenOfHearts.compareTo(pokerCardSevenOfSpades));
        System.out.println(pokerCardSevenOfSpades.compareTo(pokerCardSevenOfSpades));

    }
}
