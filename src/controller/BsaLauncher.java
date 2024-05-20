package controller;

import models.Score;
import models.Vak;

import java.util.Scanner;

public class BsaLauncher {

    public static void main(String[] args) {
        final double CIJFER_ONDERGRENS = 1.0;
        final double CIJFER_BOVENGRENS = 10.0;

        Vak[] vakken = new Vak[7];
        vakken[0] = new Vak("Project Fasten Your Seatbelts", 12, 5.5);
        vakken[1] = new Vak("Programming", 3, 5.5);
        vakken[2] = new Vak("Databases", 3, 5.5);
        vakken[3] = new Vak("Personal Skills", 2, 5.5);
        vakken[4] = new Vak("Project Skills", 2, 5.5);
        vakken[5] = new Vak("OOP", 3, 5.5);
        vakken[6] = new Vak("User Interaction", 3, 5.5);

        Score[] scores = new Score[7];

        Scanner input = new Scanner(System.in);
        System.out.println("Voer de behaalde cijfers in:");
        for (int i = 0; i < scores.length; i++) {
            double behaaldeCijfer;
            do {
                System.out.printf("%s: ", vakken[i].getName());
                behaaldeCijfer = input.nextDouble();
                input.nextLine(); // enter opvangen die blijft hangen, zodat je double cijfers kunt invoeren zonder foutmelding
            } while (behaaldeCijfer < CIJFER_ONDERGRENS || behaaldeCijfer > CIJFER_BOVENGRENS);
            scores[i] = new Score(vakken[i], behaaldeCijfer); // if statement is niet nodig, de loop eindigt pas als het cijfer tussen de 1,0 en 10,0 ligt
        }

    }
}
