import org.junit.Assert;

import static org.junit.Assert.*;

public class VraagTest {

    @org.junit.Test
    public void schudOpties() {
        String[] opties = {"Amsterdam","Utrecht","Rotterdam","Den haag"};
        Vraag vraag1 = new Vraag("Wat is de hoofdstad?", opties);
        vraag1.schudOpties();
        Assert.assertArrayEquals(opties, vraag1.getOpties().toArray());
    }

    @org.junit.Test
    public void getToetsVraag() {
        String[] opties = {"Amsterdam", "Utrecht"};
        Vraag vraag1 = new Vraag("Wat is de hoofdstad?", opties);
        Assert.assertEquals("Wat is de hoofdstad?", vraag1.getToetsVraag());
    }

    @org.junit.Test
    public void getOpties() {
        String[] opties = {"Amsterdam", "Utrecht"};
        Vraag vraag1 = new Vraag("Wat is de hoofdstad?", opties);
        Assert.assertArrayEquals(opties, vraag1.getOpties().toArray());

    }

    @org.junit.Test
    public void getAntwoord1() {
        String[] opties = {"Amsterdam", "Utrecht"};
        Vraag vraag1 = new Vraag("Wat is de hoofdstad?", opties);
        Assert.assertEquals("Amsterdam", vraag1.getAntwoord());
    }

    @org.junit.Test
    public void getAntwoord2() {
        String[] opties = {"Amsterdam", "Utrecht"};
        Vraag vraag1 = new Vraag("Wat is de grootste stad?", opties);
        Assert.assertEquals("Amsterdam", vraag1.getAntwoord());
    }
}
