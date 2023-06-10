public class Card {
    private String palo;
    private String color;
    private String valor;
    // Constructor de la clase Carta
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }
    // Getters y setters para los atributos de la carta
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }
    // Getters y setters (omito por simplicidad)
    @Override
    public String toString() {
        return valor + " de " + palo + " " + color +")";
}
}