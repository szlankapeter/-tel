package étel;

import java.io.IOException;
import java.util.ArrayList;

public class Cui {
    
    public static void main(String[] args) throws IOException {
        Etterem e = new Etterem();
        ArrayList<Etel> etlap = e.getEtlapList();
        for(int i=0;i<etlap.size();i++){
            System.out.println(etlap.get(i).toString());
        }
        ArrayList<Asztal> a = e.getAsztalok();
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i).toString());
        }
    }
    
}
