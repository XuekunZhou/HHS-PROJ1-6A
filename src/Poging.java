import java.util.ArrayList;
import java.util.Scanner;

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
        return this.geslaagd;
    }
    public static ArrayList<Student> hoogsteScore(){
        ArrayList studenten = new ArrayList();
        ArrayList<Integer> score = new ArrayList();

        for (Poging poging: getPogingenLijst()) {
            if (!studenten.contains(poging.getStudent())) {
                if (poging.getGeslaagd()) {
                    score.add(1);
                }
            } else {
                if (poging.getGeslaagd()) {
                    int index = studenten.indexOf(poging.getStudent());
                    int punten = score.get(index) + 1;
                    score.set(index, punten);
                }
            }
        }

        int highestScore = 0;
        for (int i : score) {
            if (i > highestScore) {
            highestScore = i;
            }
        }
        ArrayList besteStudenten = new ArrayList();
        int j = 0;
        for (int i : score) {

            if (i == highestScore) {
                besteStudenten.add(studenten.get(j));
            }
            j++;
            }

        return besteStudenten;
    }

    public void examenAfname(){
        Scanner scan = new Scanner(System.in);

        int questionGoed = 0;
        char abc = 'A';

        for(Vraag vraag: examen.getVragenLijst()) {
            System.out.println();
            System.out.println("Vraag: " + vraag.getToetsVraag());

            for (String optie : vraag.getOpties()) {
                System.out.println(abc + ": " + optie);
                abc++;
            }
            System.out.print("Antwoord: ");
            String response = scan.nextLine();

            if (response.equals("A")) {
                if (vraag.getOpties().get(0).equals(vraag.getAntwoord())) {
                    questionGoed++;
                }
            }
            else if (response.equals("B")) {
                if (vraag.getOpties().get(1).equals(vraag.getAntwoord())) {
                    questionGoed++;
                }
            }
            else if (response.equals("C")) {
                if (vraag.getOpties().get(2).equals(vraag.getAntwoord())) {
                    questionGoed++;
                }
            }
        }

        if (questionGoed >= Examen.voldoende) {
            geslaagd = true;
        } else {
            geslaagd = false;
        }
    }
    public static ArrayList<Poging> getPogingenLijst() {
        return pogingenLijst;
    }

}