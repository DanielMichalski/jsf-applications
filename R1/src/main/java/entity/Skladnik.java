package entity;

import java.math.BigDecimal;

/**
 * Author: Daniel
 */
public class Skladnik {
    private int ilosc;
    private BigDecimal cena;
    private Produkt produkt;
    private Zamowienie zamowienie;

    public Skladnik() {
    }

    public Skladnik(int ilosc, BigDecimal cena, Produkt produkt, Zamowienie zamowienie) {
        this.ilosc = ilosc;
        this.cena = cena;
        this.produkt = produkt;
        this.zamowienie = zamowienie;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    public Zamowienie getZamowienie() {
        return zamowienie;
    }

    public void setZamowienie(Zamowienie zamowienie) {
        this.zamowienie = zamowienie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Skladnik skladnik = (Skladnik) o;

        if (ilosc != skladnik.ilosc) return false;
        if (cena != null ? !cena.equals(skladnik.cena) : skladnik.cena != null) return false;
        if (produkt != null ? !produkt.equals(skladnik.produkt) : skladnik.produkt != null) return false;
        if (zamowienie != null ? !zamowienie.equals(skladnik.zamowienie) : skladnik.zamowienie != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = produkt != null ? produkt.hashCode() : 0;
        result = 31 * result + (zamowienie != null ? zamowienie.hashCode() : 0);
        return result;
    }
}
