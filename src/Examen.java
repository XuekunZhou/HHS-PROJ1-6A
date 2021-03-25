import java.util.ArrayList;

public class Examen {
    private String naam;
    private static Integer voldoende = 6;
    private static ArrayList<Examen> examenLijst= new ArrayList<>();
    private ArrayList<Vraag> bevat;


    public Examen(String naam){
        this.naam = naam;
        bevat = new ArrayList<>();
        examenLijst.add(this);

    }

    public String getNaam(){
        return this.naam;
    }

    public ArrayList<Vraag> getVragenLijst(){
        return bevat;
    }

    public static Integer getVoldoende(){
        return voldoende;
    }

    public static ArrayList<Examen> getExamenLijst(){
        return examenLijst;
    }


    public void addVragen(Vraag vraag){
    bevat.add(vraag);

    }


}
