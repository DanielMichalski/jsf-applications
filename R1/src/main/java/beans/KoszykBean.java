package beans;

import entity.Skladnik;
import entity.Zamowienie;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Author: Daniel
 */
@ManagedBean
@SessionScoped
public class KoszykBean {

    private Zamowienie zamowienie = new Zamowienie();

    private Skladnik wybranySkladnik;

    public Zamowienie getZamowienie() {
        return zamowienie;
    }

    public void setZamowienie(Zamowienie zamowienie) {
        this.zamowienie = zamowienie;
    }

    public Skladnik getWybranySkladnik() {
        return wybranySkladnik;
    }

    public void setWybranySkladnik(Skladnik wybranySkladnik) {
        this.wybranySkladnik = wybranySkladnik;
    }
}
