import org.junit.jupiter.api.Test;

import java.util.ArrayList;
<<<<<<< Updated upstream
import static org.junit.Assert.assertEquals;
=======
>>>>>>> Stashed changes
import static org.junit.jupiter.api.Assertions.*;

class PogingTest {

    @Test
    void hoogsteScore() {
<<<<<<< Updated upstream
    Student student1 = new Student("Jan", "Smit");
    Student student2 = new Student("Bob", "Rob");
    Poging poging = new Poging(student1);
    Poging poging2 = new Poging(student1);
    Poging poging3 = new Poging(student2);

    ArrayList<Student> studenten = new ArrayList();
    studenten.add(student1);

    Assert.assertEquals(studenten, Poging.hoogsteScore());
=======
        Student student1 = new Student("Jan", "Smit");
        Student student2 = new Student("Bob", "Rob");
        Poging poging = new Poging(student1);
        Poging poging2 = new Poging(student1);
        Poging poging3 = new Poging(student2);

        ArrayList<Student> studenten = new ArrayList();
        studenten.add(student1);

        Assert.assertEquals(studenten, Poging.hoogsteScore());
>>>>>>> Stashed changes
    }

    @Test
    void getPogingenLijst() {
        Poging poging = new Poging(student1);
        ArrayList<Poging> pogingen = new ArrayList();
        pogingen.add(poging);

        Assert.assertEquals(pogingen, Poging.getPogingenLijst());
    }

}