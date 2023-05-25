package domain;

import java.time.LocalDate;

public class Klusdag {
    private Opdracht opdracht;
    private LocalDate datum;
    private String omschrijving;

    public Klusdag(Opdracht opdracht, LocalDate datum) {
        this.opdracht = opdracht;
        this.datum = datum;
        opdracht.addKlusdag(this);
    }

    public LocalDate getDatum() {
        return datum;
    }

    public String getOmschrijving() {
        return omschrijving;
    }
}
