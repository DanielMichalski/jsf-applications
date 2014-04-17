package entity;

/**
 * Author: Daniel
 */
public class Kategoria {
    private int id;
    private String nazwa;

    public Kategoria() {}

    public Kategoria(int id, String nazwa) {
        this.id = id;
        this.nazwa = nazwa;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kategoria kategoria = (Kategoria) o;

        if (id != kategoria.id) return false;
        if (nazwa != null ? !nazwa.equals(kategoria.nazwa) : kategoria.nazwa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        return result;
    }
}
