package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Author: Daniel
 */
public class Zamowienie {
    private int id;

    private Date data;

    private List<Skladnik> skladniki =
            new ArrayList<Skladnik>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Skladnik> getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(List<Skladnik> skladniki) {
        this.skladniki = skladniki;
    }
}
