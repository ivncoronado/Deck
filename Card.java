public class Card {
    private String palo;
    private String color;
    private String valor;
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }
    @Override
    public String toString() {
        return valor + " de " + palo + " " + color +")";
}
}