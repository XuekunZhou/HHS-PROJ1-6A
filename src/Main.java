public class Main {
    public static void main(String[] args) {

	// Made an array for a question with nested array for the options, where the first answer is the correct one.
        String[] examen1vragen =
                {
                        "Je rijdt op de rechterrijstrook van een autosnelweg. Door de verkeersdrukte hebben bestuurders moeite met invoegen. Wat doe je?",
                        "De motor van je voertuig is nog koud. Je wilt gaan rijden. Wanneer verbruik je minder brandstof?",
                        "Wat is het alarmnummer in Nederland?",
                        "Welke voertuigen moet je binnen de bebouwde kom voor laten gaan als deze bij een bushalte willen wegrijden?",
                        "Je hebt te veel gedronken en je veroorzaakt een ongeluk. Kan een verzekeringsmaatschappij zeggen dat je de schade zelf moet betalen?"
                };

        String[][] examen1opties =
                {
                {
                        "Je blijft met dezelfde snelheid op de rechterrijstrook rijden.",
                        "Je gaat langzamer rijden en schruigt op naar de linkerrijstrook als er ruimte is.",
                        "Je gaat naar de linkerrijstrook als er ruimte is of je gaat langzamer rijden."
                }, {
                        "Als je meteen rustig wegrijdt, nadat je de koude motor heb gestart.",
                        "Als je eerst de motor warm laat worden en daarna pas gaat rijden.",
                        "Dat maakt voor het brandstofverbruik niet uit."
                }, {
                        "112.",
                        "06-112.",
                        "911."
                }, {
                        "Alleen lijnbussen.",
                        "Alleen touringcars.",
                        "Autobussen."
                }, {
                        "JA",
                        "NEE"
                }
        };

        String[] examen2vragen =
                {
                        "Je rijdt met mistachterlicht aan tijdens zware regenval. Mag dat?",
                        "Wanneer kun je de controle over je auto verliezen?",
                        "Je rijdt op een smalle weg. Er staan bomen dicht langs de kant van de weg. Welke bewering is juist?",
                        "Je bent op een autosnelweg aan het inhalen. Je ziet een auto hard aan komen rijden. Hij gaat vlak achter je rijden. Wat moet je doen?",
                        "Het heeft gesneeuwd. Wat doen je voordat je instapt?"
                };

        String[][] examen2opties =
                {
                        {
                                "NEE",
                                "JA"
                        },
                        {
                                "Als je moe bent of alcohol hebt gebruikt.",
                                "Als je handsfree aan het bellen bent.",
                                "Als je in het donker lange tijd achter elkaar een bepaalde snelheid rijdt."
                        },
                        {
                                "Door de tegenliggers en de bomen kun je niet uitwijken.",
                                "Door de bomen kun je de weg goed zien. Je hoeft je snelheid dus niet aan te passen.",
                                "Je kunt afstanden goed inschatten door het licht en de schaduw van de bomen."
                        },
                        {
                                "Je gaat door met inhalen, als je hard genoeg rijdt. Daarna ga je meteen naar rechts.",
                                "Je trapt even op de rem. Zo geef je aan dat de auto meer afstand moet houden.",
                                "Je gaat langzamer rijden. Je wilt namelijk dat de bestuurder achter je meer afstand houdt."
                        },
                        {
                                "Je haalt de sneeuw van de ruiten, de lichten, de spiegels, de kentekenplaat en het dak.",
                                "Je haalt de sneeuw van de lichten en zet de raamverwarming aan.",
                                "Je veegt je auto helemaal schoon en laat de motor alvast warm worden."
                        }



        };

        String[] examen3vragen =
                {
                        "Wat kun je in het verkeer beter niet doen?",
                        "Bij een verkeerslicht stopt een auto naast je. De bestuurder geeft de hele tijd gas om als eerste weg te rijden als het groen wordt. Wat doe je?",
                        "Je wilt een noodstop maken met een auto met een ABS. Hoe kun je het beste remmen?",
                        "Wanneer mag je tijdens een autorit whatsappen of sms'en?",
                        "Je rijdt op de motorrijstrook van een autosnelweg. Door de verkeersdrukte hebben bestuurders moeite met invoegen. Wat doe je?"
                };

        String[][] examen3opties =
                {
                        {
                                "Harde muziek draaien met de ramen open en snel optrekken bij een verkeerslicht.",
                                "Harde muziek draaien met de ramen op en toeteren in een gevaarlijke situatie."
                        },
                        {
                                "Je doet niet mee met het spel en je rijdt normaal bij het verkeerslicht weg.",
                                "Je probeert sneller weg te zijn dan de andere bestuurder."


                        },
                        {
                                "Je trapt zo stevig mogelijk op de rem en houd deze vast tot je stilstaat.",
                                "Je trapt de rem stevig in en zodra je tegendruk voelt van het rempedaal, laat je de rem langzaam een beetje los.",
                                "Je gaat pompend remmen waarbij je de rem telkens even loslaat."
                        },
                        {
                                "Nooit.",
                                "Als je het andere verkeer niet in gevaar brengt.",
                                "Als je stilstaat voor een geopende brug of sluis."
                        },
                        {
                                "Je blijft met dezelfde snelheid op de rechterrijstrook rijden.",
                                "Je gaat naar de linkerrijstrook als er ruimte is of je gaat langzamer rijden.",
                                "Je gaat langzamer rijden en schuift op naar de linkerrijstrook als er ruimte is."
                        }
                };

        Examen examen1 = new Examen("Toets 1");
        for (int i = 0; i < examen1vragen.length; i++) {
            examen1.addVragen(new Vraag(examen1vragen[i], examen1opties[i]));
        }

        Examen examen2 = new Examen("Toets 2");
        for (int i = 0; i < examen2vragen.length; i++) {
            examen2.addVragen(new Vraag(examen2vragen[i], examen2opties[i]));
        }

        Examen examen3 = new Examen("Toets 3");
        for (int i = 0; i < examen3vragen.length; i++) {
            examen3.addVragen(new Vraag(examen3vragen[i], examen3opties[i]));
        }

        Menu.mainMenu();
    }
}
