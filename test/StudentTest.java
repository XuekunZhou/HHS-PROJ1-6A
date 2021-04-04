import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student student;
    Student student1;

    @Before
    public void setUp() {
         student = new Student("Samsor", "Wali");
         student1 = new Student("Sam", "Wa");
    }

    @After
    public void tearDown() {
        Student.getStudentenLijst().clear();

    }

    @Test
    public void testGetNaam1() {
        String test = "Samsor";
        assertEquals(student.getNaam(), test);
    }

    @Test
    public void testGetNaam2() {
        String test = "Sam";
        assertFalse(student.getNaam().equals(test));
    }

    @Test
    public void testGetAchterNaam1() {
        String test = "Wali";
        assertEquals(student.getAchterNaam(), test);
    }

    @Test
    public void testGetAchterNaam2() {
        String test = "Wall";
        assertNotEquals(student.getAchterNaam(), test);
    }

    @Test
    public void testGetStudentNummer1() {
        assertEquals((long) student.getStudentNumber(), (long) 9);
    }

    @Test
    public void testGetStudentNummer2(){
        assertEquals((long)student1.getStudentNumber(), (long) 12);
    }

    @Test
    public void testGetStudentLijst1(){
        assertEquals(Student.getStudentenLijst().size(), 2);
    }

    @Test
    public void testGetStudentLijst2(){
        assertEquals(Student.getStudentenLijst().get(1).getNaam(), "Sam");
    }

    @Test
    public void testVerwijderStudent1(){
        assertEquals(Student.getStudentenLijst().size(), 2);
        Student.verwijderStudent(5);
        assertEquals(Student.getStudentenLijst().size(), 1);

    }

    @Test
    public void testVerwijderStudent2(){
        assertEquals(Student.getStudentenLijst().size(), 2);
        Student.verwijderStudent(2);   //deze method word niet uitgevoerd, studentnummers zijn 7 en 8
        assertEquals(Student.getStudentenLijst().get(0).getNaam(), "Samsor");
    }

}