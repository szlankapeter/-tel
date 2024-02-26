package étel;

import java.util.ArrayList;

public class Asztal {
    
    private String szin;
    private ArrayList<Etel> rendelesek;

    @Override
    public String toString() {
        return "Asztal{" + "szin=" + szin + ", rendelesek=" + rendelesek + '}';
    }

    public Asztal(String szin, ArrayList<Etel> rendelesek) {
        this.szin = szin;
        this.rendelesek = rendelesek;
    }

    public String getSzin() {
        return szin;
    }

    public ArrayList<Etel> getRendelesek() {
        return rendelesek;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public void setRendelesek(ArrayList<Etel> rendelesek) {
        this.rendelesek = rendelesek;
    }  
    
    
}
