import java.util.ArrayList;

public class Student {

    private String naam;
    private String achterNaam;
    private final Integer studentNumber;
    private static Integer uniekeNummer = 1;
    private static ArrayList<Student> studentenLijst = new ArrayList<>();


    public Student(String naam, String achterNaam){
        this.naam = naam;
        this.achterNaam = achterNaam;
        this.studentNumber = getUniekeNummer();
        studentenLijst.add(this);
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
                    poging.getExamen() == examen && poging.getStudent() == this && poging.getGeslaagd()
            ) {
                initialState = true;
                break;
            }
        }
        return initialState;
    }

    public ArrayList<Poging> studentGeslaagd() {
        ArrayList<Poging> behaaldeExamens = new ArrayList<>();
        for (Poging poging: Poging.getPogingenLijst()) {
            if (poging.getStudent().getStudentNumber().equals(studentNumber) &&
            poging.getGeslaagd()) {
                behaaldeExamens.add(poging);
            }
        }

        return behaaldeExamens;
    }

    public static void verwijderStudent(int studentNumber) {
        for (Student student: getStudentenLijst()) {
            if (student.getStudentNumber() == studentNumber) {
                getStudentenLijst().remove(student);
                break;
            }
        }

    }
}
