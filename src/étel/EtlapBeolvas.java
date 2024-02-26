package étel;

public class EtlapBeolvas {
    
    public String nev;
    public int ar;
    
    public EtlapBeolvas(String data){
        String[] split = data.split("\\|");
        nev = split[0];
        ar = Integer.parseInt(split[1]);
    }
}
