package domain;

public class Beheerder extends User {
    private int adminNr;

    public Beheerder(int adminNr, String email, String wachtwoord, String voornaam, String achternaam, String telefoonnummer, String adres, String postcode, String plaatsnaam) {
        super(email, wachtwoord, voornaam, achternaam, telefoonnummer, adres, postcode, plaatsnaam);
        this.adminNr = adminNr;
    }
}
