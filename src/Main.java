public class Main {
    public static void main(String[] args) {
        BeerSong b = new BeerSong();

        // Two ways to generate phrases
        System.out.println("way 1:");
        System.out.println(b.phrase);
        System.out.println("way 2:");
        b.outputRandomPhrase();
        }
    }