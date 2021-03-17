import java.util.ArrayList;
class Poging {
    private Boolean geslaagd;
    public static ArrayList<Poging> pogingenLijst;
    private Examen examen;
    private Student student;

    public Poging(Student student, Examen examen){
        //Nog ff leeglaten
        this.student = student;
        this.examen  = examen;
        examenAfname();
    }
    public Student getStudent(){
        //Return de naam van de student
        return this.student;
    }
    public Examen getExamen(){
        //Return de naam van het examen
        return this.examen;
    }
    public Boolean getGeslaagd(){
        //Kijk of de poging is geslaagd
        return examen.getVoldoende();
    }
    public static ArrayList<Student> hoogsteScore(){
        //Nog ff leeglaten
    }
    public void examenAfname(){
        List<Integer> list = new ArrayList<Integer>();
        int question = 0;
        for(examen.getExamenLijst) {
            system.out.println(examen.getExamenLijst[question]);
            if(examen.getExamenLijst)
        }
    }
    public static getPogingenLijst(){
        return this.pogingenLijst;
    }

}