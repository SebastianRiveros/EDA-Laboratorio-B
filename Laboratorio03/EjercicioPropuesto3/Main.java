public class Main {
    public static void main(String[] args) {
        Ave[] aves = {
            new Ganso("Fifi", 2, 12.4, 2.5, "blanco"),
            new Gallina("Claudia", 1, 10, 2.1, "cafe"),
            new Pato("Lucas", 2, 15, 3.0, "negro")
        };
        for(Ave x : aves){
            x.volar();
            x.hacerSonido();
        }
    }
}