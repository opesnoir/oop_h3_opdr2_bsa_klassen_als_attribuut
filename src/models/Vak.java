package models;

public class Vak {
    private String name;
    private int punten;
    private int cesuur;

    // constructor
    public Vak(String name, int punten, int cesuur) {
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

    public int getCesuur() {
        return cesuur;
    }

}
