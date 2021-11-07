public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        // Attribute gesetzt
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        // Die Methode retourniert den Dezimalwert zum Bruch
        // Achtung: Ganzzahldivision!
        return (double) numerator/denominator;
    }

    public String print() {
        // Die Methode retourniert den Bruch als Text z.B.: "5 / 7"
        return numerator + " / " + denominator;
    }

    public Bruch multiplicate(Bruch b2) {
        //eine neue Bruch-Variable erstellt und retourniert

        return new Bruch(this.numerator * b2.getNumerator(),
                this.denominator * b2.getDenominator());
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // Bruch mit b2 und b3 multipliziert

        return new Bruch(this.numerator * b2.getNumerator() * b3.getNumerator(),
                this.denominator * b2.getDenominator() * b3.getDenominator());
    }
}
