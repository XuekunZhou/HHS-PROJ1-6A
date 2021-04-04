import org.junit.Assert;

import static org.junit.Assert.*;

public class VraagTest {

    @org.junit.Test
    public void schudOpties() {
        String[] opties = {"Amsterdam","Utrecht","Rotterdam","Den haag"};
        Vraag vraag1 = new Vraag("Wat is de hoofdstad?", opties);
        vraag1.schudOpties();
        assertArrayEquals(opties, vraag1.getOpties().toArray());
    }

    @org.junit.Test
    public void getToetsVraag() {
        String[] opties = {"Amsterdam", "Utrecht"};
        Vraag vraag1 = new Vraag("Wat is de hoofdstad?", opties);
        assertEquals("Wat is de hoofdstad?", vraag1.getToetsVraag());
    }

    @org.junit.Test
    public void getOpties() {
        String[] opties = {"Amsterdam", "Utrecht"};
        Vraag vraag1 = new Vraag("Wat is de hoofdstad?", opties);
        assertArrayEquals(opties, vraag1.getOpties().toArray());

    }

    @org.junit.Test
    public void getAntwoord1() {
        String[] opties = {"Amsterdam", "Utrecht"};
        Vraag vraag1 = new Vraag("Wat is de hoofdstad?", opties);
        assertEquals("Amsterdam", vraag1.getAntwoord());
    }

    @org.junit.Test
    public void getAntwoord2() {
        String[] opties = {"Amsterdam", "Utrecht"};
        Vraag vraag1 = new Vraag("Wat is de grootste stad?", opties);
        assertEquals("Amsterdam", vraag1.getAntwoord());
    }
}
