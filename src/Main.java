public class Main {
    public static void main(String[] args) {

        // Made an array for a question with nested array for the options, where the first answer is the correct one.
        String[] examen1vragen =
                {
                        "Je rijdt op de rechterrijstrook van een autosnelweg. Door de verkeersdrukte hebben bestuurders moeite met invoegen. Wat doe je?",
                        "De motor van je voertuig is nog koud. Je wilt gaan rijden. Wanneer verbruik je minder brandstof?",
                        "Wat is het alarmnummer in Nederland?",
                        "Welke voertuigen moet je binnen de bebouwde kom voor laten gaan als deze bij een bushalte willen wegrijden?",
                        "Je hebt te veel gedronken en je veroorzaakt een ongeluk. Kan een verzekeringsmaatschappij zeggen dat je de schade zelf moet betalen?",
                        "Wat kun je in het verkeer beter niet doen?",
                        "Bij een verkeerslicht stopt een auto naast je. De bestuurder geeft de hele tijd gas om als eerste weg te rijden als het groen wordt. Wat doe je?",
                        "Je wilt een noodstop maken met een auto met een ABS. Hoe kun je het beste remmen?",
                        "Wanneer mag je tijdens een autorit whatsappen of sms'en?",
                        "Je rijdt op de motorrijstrook van een autosnelweg. Door de verkeersdrukte hebben bestuurders moeite met invoegen. Wat doe je?",
                        "Je rijdt met mistachterlicht aan tijdens zware regenval. Mag dat?",
                        "Wanneer kun je de controle over je auto verliezen?",
                        "Je rijdt op een smalle weg. Er staan bomen dicht langs de kant van de weg. Welke bewering is juist?",
                        "Je bent op een autosnelweg aan het inhalen. Je ziet een auto hard aan komen rijden. Hij gaat vlak achter je rijden. Wat moet je doen?",
                        "Het heeft gesneeuwd. Wat doen je voordat je instapt?",
                        "Wanneer mag je niet inhalen?",
                        "De lading op je voertuig is 2.50m breed. Mag je hiermee op een verharde weg rijden?",
                        "Welke bewering is waar?",
                        "Waarop moet je extra alert zijn in een landelijke omgeving?",
                        "Je wilt inhalen op een rechte weg. In de verte is er sprake van tegemoetkomend verkeer. Waarmee moet je rekening houden?"
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
                }, {
                        "Harde muziek draaien met de ramen open en snel optrekken bij een verkeerslicht.",
                        "Harde muziek draaien met de ramen op en toeteren in een gevaarlijke situatie."
                }, {
                        "Je doet niet mee met het spel en je rijdt normaal bij het verkeerslicht weg.",
                        "Je probeert sneller weg te zijn dan de andere bestuurder."
                }, {
                        "Je trapt zo stevig mogelijk op de rem en houd deze vast tot je stilstaat.",
                        "Je trapt de rem stevig in en zodra je tegendruk voelt van het rempedaal, laat je de rem langzaam een beetje los.",
                        "Je gaat pompend remmen waarbij je de rem telkens even loslaat."
                }, {
                        "Nooit.",
                        "Als je het andere verkeer niet in gevaar brengt.",
                        "Als je stilstaat voor een geopende brug of sluis."
                }, {
                        "Je blijft met dezelfde snelheid op de rechterrijstrook rijden.",
                        "Je gaat naar de linkerrijstrook als er ruimte is of je gaat langzamer rijden.",
                        "Je gaat langzamer rijden en schuift op naar de linkerrijstrook als er ruimte is."
                }, {
                        "NEE",
                        "JA"
                }, {
                        "Als je moe bent of alcohol hebt gebruikt.",
                        "Als je handsfree aan het bellen bent.",
                        "Als je in het donker lange tijd achter elkaar een bepaalde snelheid rijdt."
                }, {
                        "Door de tegenliggers en de bomen kun je niet uitwijken.",
                        "Door de bomen kun je de weg goed zien. Je hoeft je snelheid dus niet aan te passen.",
                        "Je kunt afstanden goed inschatten door het licht en de schaduw van de bomen."
                }, {
                        "Je gaat door met inhalen, als je hard genoeg rijdt. Daarna ga je meteen naar rechts.",
                        "Je trapt even op de rem. Zo geef je aan dat de auto meer afstand moet houden.",
                        "Je gaat langzamer rijden. Je wilt namelijk dat de bestuurder achter je meer afstand houdt."
                }, {
                        "Je haalt de sneeuw van de ruiten, de lichten, de spiegels, de kentekenplaat en het dak.",
                        "Je haalt de sneeuw van de lichten en zet de raamverwarming aan.",
                        "Je veegt je auto helemaal schoon en laat de motor alvast warm worden."
                }, {
                        "Wanneer de afstand die nodig is om in te halen niet vrij is  of niet volledig is te overzien.",
                        "Wanneer je rechts van een blokmarkering rijdt.",
                        "Wanneer je niet minimaal 30 km/h sneller kunt rijden dan het in te halen voertuig.",
                }, {
                        "JA",
                        "NEE"
                }, {
                        "Een personenauto mag maximaal 12 meter lang zijn.",
                        "Een personenauto mag maximaal 8 meter lang zijn.",
                        "Voor personenauto's is geen maximum lengte bepaald."
                }, {
                        "Vervuilde rijbanen.",
                        "Windvlagen.",
                        "Brede rijbanen waarop hard gereden wordt."
                }, {
                        "Je kunt moeilijk inschatten wat de snelheid is van het tegemoetkomend verkeer.",
                        "De bestuurder van het in te halen voertuig schrikt van het tegemoetkomend verkeer."
                }
                };

        String[] examen2vragen =
                {
                        "Wat is 12x12?",
                        "Wat is 190:10?",
                        "Wat is 417:139?",
                        "Wat is 588:84?",
                        "Wat is 718-190?",
                        "Wat is 915:15?",
                        "Wat is 864:4?",
                        "Wat is 928:8?",
                        "Wat is 354:59?",
                        "Wat is 690+160?",
                        "Wat is 5+2x3-9?",
                        "Wat is 12+11*3+12",
                        "Wat is 1+2+3*4*5",
                        "Wat is 7*7-3+2",
                        "Wat is 3*4+3*2"
                };

        String[][] examen2opties =
                {
                        {
                                "144",
                                "124",
                                "112"
                        }, {
                        "19",
                        "10",
                        "109"
                }, {
                        "3",
                        "5",
                        "9"
                },
                        {
                                "7",
                                "10",
                                "11"
                        },
                        {
                                "528",
                                "524",
                                "526"
                        }, {
                        "61",
                        "59",
                        "64"
                }, {
                        "216",
                        "210",
                        "218"
                }, {
                        "116",
                        "114",
                        "112"
                }, {
                        "6",
                        "7",
                        "9"
                }, {
                        "850",
                        "870",
                        "855"
                }, {
                        "2",
                        "13",
                        "-42"
                }, {
                        "57",
                        "81",
                        "345"
                }, {
                        "63",
                        "180",
                        "69"
                }, {
                        "48",
                        "43",
                        "42"
                }, {
                        "18",
                        "42",
                        "30"
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


        Menu.mainMenu();
    }
}