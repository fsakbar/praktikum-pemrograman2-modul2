package PRAK201_2010817210023_MuhammadAuliaAkbar;

public class Main {
    public static void main(String [] args){
        Buah apel = new Buah("Apel", 7000, 0.4, 40 );
        apel.display();

        Buah mangga = new Buah("Mangga", 3500, 0.2, 15);
        mangga.display();

        Buah alpukat = new Buah("Alpukat", 10000, 2.5, 12);
        alpukat.display();
    }

}
