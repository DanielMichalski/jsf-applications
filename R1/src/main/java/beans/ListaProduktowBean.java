package beans;

import dao.SillyDao;
import entity.Kategoria;
import entity.Produkt;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ListDataModel;
import java.util.List;

/**
 * Author: Daniel
 */
@ManagedBean
@SessionScoped
public class ListaProduktowBean {

    private ListDataModel<Produkt> modelProdukty = new ListDataModel<Produkt>();

    private Kategoria kategoria;

    private int strona = 0;

    private SillyDao dao = SillyDao.getInstance();

    public ListaProduktowBean() {
        refreshModel();
    }

    private void refreshModel() {
        List<Produkt> lista = dao.pobierzProduktyWgKategorii(
                kategoria, strona * SillyDao.ROZMIAR_STRONY, SillyDao.ROZMIAR_STRONY);
        this.modelProdukty.setWrappedData(lista);
    }

    public boolean isPoprzedni() {
        return this.strona > 0;
    }

    public boolean isNastepny() {
        double maksymalnaStrona = Math.ceil((
                dao.pobierzLiczbeProduktowWgKategorii(kategoria) + 0.0))
                / SillyDao.ROZMIAR_STRONY;

        return (strona < maksymalnaStrona);
    }

    public ListDataModel<Produkt> getModelProdukty() {
        return modelProdukty;
    }

    public void setModelProdukty(ListDataModel<Produkt> modelProdukty) {
        this.modelProdukty = modelProdukty;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }
}
