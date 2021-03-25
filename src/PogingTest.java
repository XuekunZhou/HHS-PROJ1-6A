import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class PogingTest {

    @Test
    void hoogsteScore() {

        Student student1 = new Student("Jan", "Smit");
        Student student2 = new Student("Bob", "Rob");
        Poging poging = new Poging(student1);
        Poging poging2 = new Poging(student1);
        Poging poging3 = new Poging(student2);

        ArrayList<Student> studenten = new ArrayList();
        studenten.add(student1);

        Assert.assertEquals(studenten, Poging.hoogsteScore());
    }

    @Test
    void getPogingenLijst() {
        Student student1 = new Student("Jan", "Smit");
        Poging poging = new Poging(student1);
        ArrayList<Poging> pogingen = new ArrayList();
        pogingen.add(poging);

        Assert.assertEquals(pogingen, Poging.getPogingenLijst());
    }


}