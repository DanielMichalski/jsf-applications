package entity;

/**
 * Author: Daniel
 */
public class Uzytkownik {
    private int id;
    private String email;
    private String imie;
    private String nazwisko;
    private String adres;

    public Uzytkownik() {}

    public Uzytkownik(int id, String email, String imie, String nazwisko, String adres) {
        this.id = id;
        this.email = email;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Uzytkownik that = (Uzytkownik) o;

        if (id != that.id) return false;
        if (adres != null ? !adres.equals(that.adres) : that.adres != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        if (nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
