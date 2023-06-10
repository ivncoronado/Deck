import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
    private static List<Card> cards;

    public static void main(String[] args) {

        cards = new ArrayList<>();

        String[] palos = {"Diamantes", "Corazones", "Picas", "Treboles"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) {

            for (int i = 0; i < valores.length; i++) {

                String valor = valores[i];
                String color = "";

                if ((palo == "Picas") || (palo == "Treboles")){
                    color = "Negro";
                }else{
                    color = "Rojo";
                }
                Card card = new Card(palo, color, valor);
                cards.add(card);
            }
        }
        shuffle();
        head();
        pick();
        hand();
    }
    public static void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck");
    }
    public static void head() {
        if (cards.size() > 0) {
            Card card = cards.remove(0);
            System.out.println(card.toString());
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        }
    }
    public static void pick() {
        if (cards.size() > 0) {
            int randomIndex = (int) (Math.random() * cards.size());
            Card card = cards.remove(randomIndex);
            System.out.println(card.toString());
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        }
    }
    public static void hand() {
        if (cards.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                System.out.println(card.toString());
            }
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        }
    }
    public int getRemainingCards() {
        return cards.size();
    }
}