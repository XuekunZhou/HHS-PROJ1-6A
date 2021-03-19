import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Vraag{


    private String toetsVraag;
    private String antwoord;
    private ArrayList<String> opties;

    public Vraag(String toetsVraag, String[] opties) {
        this.toetsVraag = toetsVraag;
        this.antwoord = opties[0];

        this.opties = new ArrayList<>();

        this.opties.addAll(Arrays.asList(opties));
    }
    public void schudOpties() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randint = random.nextInt(opties.size());

            String holder = opties.get(randint);
            opties.remove(randint);
            opties.add(holder);
        }
    }


    public String getToetsVraag() {
        return this.toetsVraag;
    }

    public ArrayList<String> getOpties(){
        return opties;
    }


    public String getAntwoord() {
        return this.antwoord;
    }



}