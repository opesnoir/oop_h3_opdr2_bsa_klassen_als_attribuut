package models;

public class Score {
    // attribuut
    private Vak vak;
    private double cijfer;
    private int behaaldePunten;

    // constructor
    public Score(Vak vak, double cijfer) {
        this.vak = vak;
        this.cijfer = cijfer;
        if (cijfer >= vak.getCesuur()) {
            behaaldePunten = vak.getPunten();
        } else {
            behaaldePunten = 0;
        }
    }

    // getter
    public Vak getVak() {
        return vak;
    }

    public double getCijfer() {
        return cijfer;
    }

    public int getBehaaldePunten() {
        return behaaldePunten;
    }

    //




}
