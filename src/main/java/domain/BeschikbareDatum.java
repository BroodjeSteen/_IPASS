package domain;

import java.time.LocalDate;

public class BeschikbareDatum {
    private Klant klant;
    private LocalDate datum;

    public BeschikbareDatum(Klant klant, LocalDate datum) {
        this.klant = klant;
        this.datum = datum;
        klant.addBesckikbareDatum(this);
    }
}
