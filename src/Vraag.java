public class Vraag<opties> {

    private String toetsVraag;
    private String antwoord;
    ArrayList<String> opties = new ArrayList<String>();
    opties.add("optie1");
    opties.add("optie2");
    opties.add("optie3");
    opties.add("optie4");

    public Vraag(String toetsVraag, String optie1, String optie2, String optie3, String optie4, String antwoord){
        this.toetsVraag = toetsVraag;
        this.antwoord = antwoord;
        // this.opties = getOpties()
    }

    public schudOpties();

    public String getToetsVraag(){
        return this.toetsVraag;
    }

  //  public String getOpties(){}
  //  return this.opties

    public String getAntwoord() {
        return this.antwoord;
    }










    public static void main(String[] args) {
	// write your code here
    }
}
