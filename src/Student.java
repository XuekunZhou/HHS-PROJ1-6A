import java.util.ArrayList;

public class Student {

    private String naam;
    private String achterNaam;
    private Integer studentNumber;
    private static Integer uniekeNummer = 1;
    private static ArrayList<Student> studentenLijst;


    public Student(String naam, String achterNaam, Integer studentNummer){
        this.naam = naam;
        this.achterNaam = achterNaam;
        this.studentNumber = getUniekeNummer();
        studentenLijst = new ArrayList<Student>();
    }

    public String getNaam() {
        return naam;
    }

    public Integer getStudentNumber(){
        return studentNumber;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public Integer getUniekeNummer() {
        return uniekeNummer++;
    }

    public static ArrayList<Student> getStudentenLijst(){
        return studentenLijst;
    }

    public Boolean studentExamenBehaald(Examen examen){
        boolean initialState = false;
        for (Poging poging: Poging.getPogingenLijst()) {
            if (
                    poging.getExamen() == examen && poging.getStudent == this && poging.getGeslaagd
            ) {
                initialState = true;
            }
        }
        return initialState;
    }

    public ArrayList<Poging> studentGeslaagd() {
        ArrayList<Poging> behaaldeExamens = new ArrayList<Poging>();
        for (Poging poging: Poging.getPogingenLijst()) {
            if (poging.getStudent().getStudentNumber() == studentNumber &&
            poging.getGeslaagd()) {
                behaaldeExamens.add(poging);
            }
        }

        return behaaldeExamens;
    }

    public static void verwijderStudent(int studentNumber) {
        for (Student student: getStudentenLijst()) {
            if (student.getStudentNumber() == studentNumber) {
                int i = getStudentenLijst().indexOf(student);
                getStudentenLijst().remove(i);
            }
        }

    }
}
