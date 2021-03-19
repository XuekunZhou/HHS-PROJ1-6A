import java.util.ArrayList;

public class Examen {
    private String naam;
    private static Integer voldoende = 6;
    private static ArrayList<Examen> examenLijst;
    private ArrayList<Vraag> bevat;

    public Examen(String naam){

        this.naam = naam;
        examenLijst = new ArrayList<Examen>();
        bevat = new ArrayList<Vraag>();
    }


    public String getNaam(){
        int examennmr = 0;
        examennmr++;
        naam = "Examen " + examennmr;
        return this.naam;
    }

    public ArrayList<String> getVragen(){
        ArrayList<String> vragenLijst = new ArrayList<>();
        fo

        return vragenLijst;
    }

    public Integer getVoldoende(){
        return voldoende;
    }

    public static ArrayList<Examen> getExamenLijst(){
        return examenLijst();
    }


    public void addVragen(Vraag vraag){
    bevat.add(Vraag.getToetsVraag());

    }


}
