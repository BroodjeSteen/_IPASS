package domain;

import java.util.ArrayList;

public class Klant extends User{
    private int klantNr;
    private ArrayList<Opdracht> opdrachten = new ArrayList<>();
    private ArrayList<BeschikbareDatum> beschikbareData = new ArrayList<>();

    public Klant(int klantNr, String email, String wachtwoord, String voornaam, String achternaam, String telefoonnummer, String adres, String postcode, String plaatsnaam) {
        super(email, wachtwoord, voornaam, achternaam, telefoonnummer, adres, postcode, plaatsnaam);
        this.klantNr = klantNr;
    }

    public void addOpdracht(Opdracht opdracht) {
        opdrachten.add(opdracht);
    }

    public void addBesckikbareDatum(BeschikbareDatum beschikbareDatum) {
        beschikbareData.add(beschikbareDatum);
    }

    public ArrayList<Opdracht> getOpdrachten() {
        return opdrachten;
    }
}
