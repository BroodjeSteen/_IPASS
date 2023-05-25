package domain;

import java.util.ArrayList;

public class Opdracht {
    private Klant klant;
    private String omschrijving;
    private ArrayList<Klusdag> klusdagen = new ArrayList<>();

    public Opdracht(Klant klant, String omschrijving) {
        this.klant = klant;
        this.omschrijving = omschrijving;
        klant.addOpdracht(this);
    }

    public void addKlusdag(Klusdag klusdag) {
        klusdagen.add(klusdag);
    }

    public String getOmschrijving() {
        return omschrijving;
    }
}
