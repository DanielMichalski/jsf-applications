package entity;

import java.math.BigDecimal;

/**
 * Author: Daniel
 */
public class Produkt {
    private int id;
    private String nazwa;
    private BigDecimal cena;
    private int ilosc;
    private Kategoria kategoria;
    private String opis;

    public Produkt() {}

    public Produkt(int id, String nazwa, BigDecimal cena, int ilosc, Kategoria kategoria, String opis) {
        this.id = id;
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
        this.kategoria = kategoria;
        this.opis = opis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produkt produkt = (Produkt) o;

        if (id != produkt.id) return false;
        if (ilosc != produkt.ilosc) return false;
        if (cena != null ? !cena.equals(produkt.cena) : produkt.cena != null) return false;
        if (kategoria != null ? !kategoria.equals(produkt.kategoria) : produkt.kategoria != null) return false;
        if (nazwa != null ? !nazwa.equals(produkt.nazwa) : produkt.nazwa != null) return false;
        if (opis != null ? !opis.equals(produkt.opis) : produkt.opis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (cena != null ? cena.hashCode() : 0);
        result = 31 * result + ilosc;
        result = 31 * result + (kategoria != null ? kategoria.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        return result;
    }
}
