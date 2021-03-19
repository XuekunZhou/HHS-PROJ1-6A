import java.util.Scanner;

public class Menu {

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
        System.out.println("7) Welke examens heeft student gehaald?");
        System.out.println("8) Welke student heeft de meeste examens gehaald?");
        System.out.println("0) Exit");
        System.out.print("Keuze: ");

        int keuze = scanner.nextInt();


        switch (keuze) {
            case 1 -> examenLijstMenu();
            case 2 -> studentenLijstMenu();
            case 3 -> inschrijfMenu();
            case 4 -> verwijderMenu();
            case 5 -> {
                System.out.print("Student nummer: ");
                int student = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Examen naam: ");
                String examen = scanner.nextLine();
                Student studentTeDoen = null;
                for (Student student1 : Student.getStudentenLijst()) {
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
            case 6 -> studentTestMenu();
            case 7 -> examenStudentMenu();
            case 8 -> hoogsteScoreMenu();
            case 0 -> System.exit(0);
        }
    }



    public static void examenLijstMenu() {
        System.out.println();
        System.out.println("Examen lijst:");

        int i = 1;
        for (Examen examen: Examen.getExamenLijst()) {
            System.out.println(i++ + ": " + examen.getNaam());
        }

        mainMenu();
    }


    public static void  studentenLijstMenu() {
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
        scanner.nextLine();
        System.out.print("Student " + studentNummer + " verwijderen? (y/n): ");
        String bevestiging = scanner.nextLine();

        if (bevestiging.equals("y")) {
            Student.verwijderStudent(studentNummer);
            System.out.println("Student " + studentNummer + " vewrijderd");
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
        scanner.nextLine();
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
        System.out.println();
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
        System.out.println();
        System.out.println("De studenten met de hoogste score zijn:");

        for (Student student: Poging.hoogsteScore()) {
            System.out.println("Student " + student.getStudentNumber());
        }

        mainMenu();
    }
}
