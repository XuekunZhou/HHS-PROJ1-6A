import org.testng.annotations.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;

public class ExamenTest {

    @Test
    void getNaam() {
        Examen examen1 = new Examen("Examen 1");
        assertEquals("Examen 1", examen1.getNaam());

        Examen examen2 = new Examen("Examen 2");
        assertEquals("Examen 2", examen2.getNaam());
    }

    @Test
    void getVragenLijst() {
        Examen examen1 = new Examen("Examen 1");
        ArrayList<Vraag> bevat = new ArrayList<Vraag>();
        assertEquals(bevat, examen1.getVragenLijst());

        Examen examen2 = new Examen("Examen 2");
        ArrayList<Vraag> bevat2 = new ArrayList<Vraag>();
        assertEquals(bevat2, examen2.getVragenLijst());
    }

    @Test
    void getVoldoende() {
        assertEquals((long)6, (long)Examen.getVoldoende());
    }

    @Test
    void getExamenLijst() {
        ArrayList<Examen> Examenlijst1 = new ArrayList<Examen>();
        Examen.getExamenLijst().clear();
        assertEquals(Examenlijst1, Examen.getExamenLijst());

        ArrayList<Examen> Examenlijst2 = new ArrayList<Examen>();
        assertEquals(Examenlijst2, Examen.getExamenLijst());
    }

    @Test
    void addVragen() {
        Examen examen1 = new Examen("Examen 1");
        ArrayList<Vraag> bevat = new ArrayList<Vraag>();
        String [] opties = {"optie 1", "optie 2"};
        Vraag vraag1 = new Vraag("test ?", opties);
        ArrayList<Vraag> bevat2 = new ArrayList<Vraag>();
        bevat2.add(vraag1);
        examen1.addVragen(vraag1);
        assertArrayEquals(bevat2, bevat);
    }

    private void assertArrayEquals(ArrayList<Vraag> bevat2, ArrayList<Vraag> bevat) {
    }
}