package étel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Etterem {

    private ArrayList<Etel> etlap = new ArrayList<>();
    private ArrayList<Asztal> asztalok = new ArrayList<>();

    public Etterem() {
        this.etlap = EtlapFeltolt();
        this.asztalok = AsztalokFeltolt();
    }

    private ArrayList<Etel> EtlapFeltolt() throws NumberFormatException {
        try {
            File myObj = new File("etlap.txt");
            try (Scanner myReader = new Scanner(myObj)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    EtlapBeolvas newData = new EtlapBeolvas(data);
                    Etel etel = new Etel(newData.nev, newData.ar);
                    etlap.add(etel);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return etlap;
    }

    private ArrayList<Asztal> AsztalokFeltolt() {

        try {
            File myObj = new File("asztalok.txt");
            try (Scanner myReader = new Scanner(myObj)) {

                myReader.useDelimiter("\\A");
                String fileContent = myReader.hasNext() ? myReader.next() : "";

                String[] sections = fileContent.split("\\n\\s*\\n");
                for (String section : sections) {
                    String[] lines = section.split("\\n");
                    ArrayList<Etel> rendelesek = new ArrayList<>();
                    for(int y =1;y<lines.length;y++){
                        rendelesek.add(new Etel(lines[y], 0));
                    }
                    asztalok.add(new Asztal(lines[0], rendelesek));
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return asztalok;
    }

    public ArrayList<Asztal> getAsztalok() {
        return asztalok;
    }

    public ArrayList<Etel> getEtlapList() {
        return etlap;
    }

}
