import java.util.ArrayList;
import java.util.Random;


public class Vraag{


    private String toetsVraag;
    private String antwoord;
    private ArrayList<String> opties;

    public Vraag(String toetsVraag, String[] opties) {
        this.toetsVraag = toetsVraag;
        this.antwoord = opties[0];

        this.opties = new ArrayList<>();

        for (int i = 0; i < opties.length; i++) {
            this.opties.add(opties[i]);
        }
    }
    public void schudOpties() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randint = random.nextInt(3);

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