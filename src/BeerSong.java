public class BeerSong {
    String[] wordListOne = {"24/7", "multi-tier","30 000 foot", "B-B", "win-win","web-based", "pervasive", "smart","dynamic"};
    String[] wordListTwo = {"value-added", "shared","targeted", "cooperative", "focused","leveraged", "aligned", "distributed","empowered","sticky"};
    String[] wordListThree = {"mission", "paradigm","portal", "space", "vision","process", "tipping-point", "solution"};

    int firstListLength = wordListOne.length;
    int secondListLength = wordListTwo.length;
    int thirdListLength = wordListThree.length;

    int rand1 = (int) (Math.random() * firstListLength);
    int rand2 = (int) (Math.random() * secondListLength);
    int rand3 = (int) (Math.random() * thirdListLength);

    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
    
   public void outputRandomPhrase(){
        System.out.println(phrase);
    }


}
