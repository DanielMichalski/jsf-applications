package beans;

import dao.SillyDao;
import entity.Produkt;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Author: Daniel
 */
@ManagedBean
@RequestScoped
public class ProduktSzczegolowyBean {
    private SillyDao dao = SillyDao.getInstance();

    private Produkt wybranyProdukt;

    @ManagedProperty("#{param.id}")
    private int produktId;

    public Produkt getWybranyProdukt() {
        return wybranyProdukt;
    }

    public void setWybranyProdukt(Produkt wybranyProdukt) {
        this.wybranyProdukt = wybranyProdukt;
    }

    public int getProduktId() {
        return produktId;
    }

    public void setProduktId(int produktId) {
        this.produktId = produktId;
        if (produktId > 0) {
            this.wybranyProdukt = dao.pobierzProduktWgID(produktId);
        }
    }
}
