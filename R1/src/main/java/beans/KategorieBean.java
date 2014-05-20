package beans;

import dao.SillyDao;
import entity.Kategoria;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.ListDataModel;


@ManagedBean
@RequestScoped
public class KategorieBean {
    private ListDataModel<Kategoria> modelKategorie = new ListDataModel<Kategoria>();

    public ListDataModel<Kategoria> getModelKategorie() {
        return modelKategorie;
    }

    public void setModelKategorie(ListDataModel<Kategoria> modelKategorie) {
        this.modelKategorie = modelKategorie;
    }

    public KategorieBean() {
        modelKategorie.setWrappedData(SillyDao.getInstance().getKategorie());
    }
}
