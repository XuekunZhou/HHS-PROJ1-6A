import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        mainMenu();
    }


    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Menu");
        System.out.println("1) Lijst met examens");
        System.out.println("2) Lijst met studenten");
        System.out.println("3) Nieuwe student inschrijven");
        System.out.println("4) Student verwijderen");
        System.out.println("5) Examen afnemen");
        System.out.println("6) Is student geslaagd voor test?");
        System.out.println("7) Welke examens geeft student gehaald?");
        System.out.println("8) Welke student heeft de meeste examens gehaald?");
        System.out.println("0) Exit");
        System.out.print("Keuze: ");

        int keuze = scanner.nextInt();

        if (keuze == 1) {
            examenLijstMenu();
        }
        else if (keuze == 2) {
            studentenLijstMenu();
        }
        else if (keuze == 3) {
            inschrijfMenu();
        }
        else if (keuze == 4) {
            verwijderMenu();
        }
        else if (keuze == 5) {
            System.out.print("Student nummer: ");
            int student = scanner.nextInt();

            System.out.print("Examen naam: ");
            String examen = scanner.nextLine();

            Student studentTeDoen = null;
            for (Student student1: Student.getStudentenLijst()) {
                if (student == student1.getStudentNumber()) {
                    studentTeDoen = student1;
                    break;
                }
            }

            Examen examenTeDoen = null;
            for (Examen exam : Examen.getExamenLijst()) {
                if (examen.equals(exam.getNaam())) {
                    examenTeDoen = exam;
                    break;
                }
            }

            new Poging(studentTeDoen, examenTeDoen);
        }
        else if (keuze == 6) {
            studentTestMenu();
        }
        else if (keuze == 7) {
            examenStudentMenu();
        }
        else if (keuze == 8) {
            hoogsteScoreMenu();
        }
        else if (keuze == 0) {
            System.exit(0);
        }
    }



    public static void examenLijstMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Examen lijst:");

        for (Examen examen: Examen.getExamenLijst()) {
            int i = 1;
            System.out.println(i++ + ": " + examen.getNaam());
        }

        mainMenu();
    }


    public static void  studentenLijstMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Studenten lijst:");

        for (Student student: Student.getStudentenLijst()) {
            System.out.println(student.getStudentNumber() + ": " + student.getAchterNaam() + ", " + student.getNaam());
        }

        mainMenu();
    }


    public static void inschrijfMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Student inschrijven");
        System.out.print("Voornaam: ");
        String voornaam = scanner.nextLine();
        System.out.print("Achternaam: ");
        String achternaam = scanner.nextLine();

        new Student(voornaam, achternaam);

        mainMenu();
    }


    public static void verwijderMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Student verwijderen");
        System.out.print("Student nummer: ");
        int studentNummer = scanner.nextInt();
        System.out.print("Student " + studentNummer + " verwijderen? (y/n): ");
        String bevestiging = scanner.nextLine();

        if (bevestiging.equals("y")) {
            Student.verwijderStudent(studentNummer);
            System.out.println("Student " + studentNummer + "vewrijderd");
        }
        else {
            System.out.println("Student " + studentNummer + " niet vewrijderd");
        }

        mainMenu();
    }


    public static void studentTestMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Is student geslaagd voor test?");
        System.out.print("Student nummer: ");
        int studentNummer = scanner.nextInt();
        System.out.print("Examen naam: ");
        String examenNaam = scanner.nextLine();

        Examen examenDieGecheckedWordt = null;
        for (Examen exam : Examen.getExamenLijst()) {
            if (examenNaam.equals(exam.getNaam())) {
                examenDieGecheckedWordt = exam;
                break;
            }
        }


        for (Student student: Student.getStudentenLijst()) {
            if (student.getStudentNumber() == studentNummer) {
                if (student.studentExamenBehaald(examenDieGecheckedWordt)) {
                    System.out.print("Student " + studentNummer + " is geslaagd voor " + examenNaam);
                }
                else {
                    System.out.print("Student " + studentNummer + " is niet geslaagd voor " + examenNaam);
                }
            }
        }

        mainMenu();
    }


    public static void examenStudentMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welke examens geeft student gehaald?");
        System.out.print("Student nummer: ");
        int studentNummer = scanner.nextInt();

        for (Student student: Student.getStudentenLijst()) {
            if (student.getStudentNumber() == studentNummer) {
                System.out.println("Student " + studentNummer + " is geslaagd voor:");
                for (Poging poging: student.studentGeslaagd()) {
                    System.out.println(poging.getExamen().getNaam());
                }
            }
        }

        mainMenu();
    }


    public static void hoogsteScoreMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Student met de hoogste score is:");

        for (Student student: Poging.hoogsteScore()) {
            System.out.println(student.getNaam());
        }

        mainMenu();
    }
}