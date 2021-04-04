import java.util.ArrayList;
import java.util.Scanner;

class Poging {
    private Boolean geslaagd;
    public static ArrayList<Poging> pogingenLijst = new ArrayList<>();
    private Examen examen;
    private Student student;

    public Poging(Student student, Examen examen){
        //Nog ff leeglaten
        this.student = student;
        this.examen  = examen;
        pogingenLijst.add(this);
        examenAfname();
    }

    public Poging(Student student){
        //Nog ff leeglaten
        this.student = student;
        this.examen  = null;
        pogingenLijst.add(this);
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
        ArrayList<Student> studenten = new ArrayList();
        ArrayList<Integer> score = new ArrayList();

        for (Poging poging: getPogingenLijst()) {
            if (!studenten.contains(poging.student)) {
                studenten.add(poging.student);
                if (poging.geslaagd) {
                    score.add(1);
                }
            } else {
                if (poging.geslaagd) {
                    int index = studenten.indexOf(poging.student);
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
        ArrayList<Student> besteStudenten = new ArrayList<>();
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


        for(Vraag vraag: examen.getVragenLijst()) {
            vraag.schudOpties();

            System.out.println();
            System.out.println("Vraag: " + vraag.getToetsVraag());

            char abc = 'A';

            for (String optie : vraag.getOpties()) {
                System.out.println(abc + ": " + optie);
                abc++;
            }
            System.out.print("Antwoord: ");
            String response = scan.nextLine();

            switch (response) {
                case "A":
                    if (vraag.getOpties().get(0).equals(vraag.getAntwoord())) {
                        questionGoed = questionGoed + 2;
                        System.out.println("Correct");
                    } else {
                        System.out.println("Fout");
                    }
                    break;
                case "B":
                    if (vraag.getOpties().get(1).equals(vraag.getAntwoord())) {
                        questionGoed = questionGoed + 2;
                        System.out.println("Correct");
                    } else {
                        System.out.println("Fout");
                    }
                    break;
                case "C":
                    if (vraag.getOpties().get(2).equals(vraag.getAntwoord())) {
                        questionGoed = questionGoed + 2;
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Fout!");
                    }
                    break;
            }
        }

        geslaagd = questionGoed >= Examen.getVoldoende();

        System.out.println();
        System.out.println("Score: " + questionGoed);

        Menu.mainMenu();
    }
    public static ArrayList<Poging> getPogingenLijst() {
        return pogingenLijst;
    }

}