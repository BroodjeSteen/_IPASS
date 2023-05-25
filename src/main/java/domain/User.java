package domain;

public class User {
    private String email;
    private String wachtwoord;
    private String voornaam;
    private String achternaam;
    private String telefoonnummer;
    private String adres;
    private String postcode;
    private String plaatsnaam;

    public User(String email, String wachtwoord, String voornaam, String achternaam, String telefoonnummer, String adres, String postcode, String plaatsnaam) {
        this.email = email;
        this.wachtwoord = wachtwoord; // moet gehashed worden
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.telefoonnummer = telefoonnummer;
        this.adres = adres;
        this.postcode = postcode;
        this.plaatsnaam = plaatsnaam;
    }

}
