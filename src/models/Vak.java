package models;

public class Vak {
    private String name;
    private int punten;
    private double cesuur;

    // constructor
    public Vak(String name, int punten, double cesuur) {
        this.name = name;
        this.punten = punten;
        this.cesuur = cesuur;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getPunten() {
        return punten;
    }

    public double getCesuur() {
        return cesuur;
    }

}
