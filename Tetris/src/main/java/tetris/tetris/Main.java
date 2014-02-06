package tetris.tetris;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Ruudukko ruudukko = new Ruudukko(10, 20);
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(ruudukko);
        Sovelluslogiikka sovelluslogiiikka = new Sovelluslogiikka(ruudukko);
        Palikka palikka = new Palikka();
        for (int i = 0; i < 10; i++) {
            palikka.tulostaPalikka(palikka.getPalat());
            palikka.kaannaPalikka();
            System.out.println("");
        }
        
    }
}
