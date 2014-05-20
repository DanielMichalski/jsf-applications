package dao;

import entity.Kategoria;
import entity.Produkt;
import entity.Zamowienie;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class SillyDao {
    private static SillyDao instance = new SillyDao();

    private List<Kategoria> kategorie = new ArrayList<Kategoria>();

    private List<Produkt> produkty = new ArrayList<Produkt>();

    private List<Zamowienie> zamowienia = new ArrayList<Zamowienie>();

    public static final int ROZMIAR_STRONY = 3;

    {
        Kategoria procesory = new Kategoria(1, "Procesory");
        Kategoria pamieci = new Kategoria(2, "Pamięci");
        Kategoria laptopy = new Kategoria(3, "Laptopy");
        kategorie.add(procesory);
        kategorie.add(pamieci);
        kategorie.add(laptopy);

        Produkt p1 = new Produkt(1, "Procesor Quad", new BigDecimal(550), 10, procesory);
        Produkt p2 = new Produkt(2, "Procesor Duo", new BigDecimal(400), 10, procesory);
        Produkt p3 = new Produkt(3, "Procesor Single", new BigDecimal(300), 10, procesory);
        Produkt p4 = new Produkt(4, "Pamięć 4 GB", new BigDecimal(350), 10, pamieci);
        produkty.add(p1);
        produkty.add(p2);
        produkty.add(p3);
        produkty.add(p4);
    }

    private SillyDao() {
    }

    public static SillyDao getInstance() {
        return instance;
    }

    private List<Produkt> pobierzProduktyWgKategori(Kategoria kategoria) {
        if (kategoria == null) return produkty;

        List<Produkt> wybrane = new ArrayList<Produkt>();

        for (Produkt produkt : produkty) {
            if (produkt.getKategoria().equals(kategoria)) {
                wybrane.add(produkt);
            }
        }

        return wybrane;
    }

    public List<Produkt> pobierzProduktyWgKategorii(Kategoria kategoria, int start, int length) {
        List<Produkt> wybrane = pobierzProduktyWgKategori(kategoria);

        if (start >= wybrane.size()) {
            return new ArrayList<Produkt>();
        } else if (start < wybrane.size() && start + length > wybrane.size()) {
            wybrane = wybrane.subList(start, wybrane.size());
        } else {
            wybrane = wybrane.subList(start, start + length);
        }

        return wybrane;
    }

    public int pobierzLiczbeProduktowWgKategorii(Kategoria kategoria) {
        return pobierzProduktyWgKategori(kategoria).size();
    }

    public Produkt pobierzProduktWgID(int produktId) {
        for (Produkt produkt : produkty) {
            if (produkt.getId() == produktId) {
                return produkt;
            }
        }

        return null;
    }

    public List<Produkt> pobierzTopProdukty() {
        return produkty.subList(0, 2);
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        zamowienia.add(zamowienie);
    }

    public List<Kategoria> getKategorie() {
        return kategorie;
    }
}
