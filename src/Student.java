import java.util.ArrayList;

public class Student {

    private String naam;
    private String achterNaam;
    private Integer studentNumber;
    private static Integer uniekeNummer = 1;
    private ArrayList<Student> studentenLijst;


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

    public Integer getUniekeNummer() {
        return uniekeNummer++;
    }

    public ArrayList<Student> getStudentenLijst(){
        return studentenLijst;
    }

    public Boolean studentExamenBehaald(Examen examen){

    }



}
