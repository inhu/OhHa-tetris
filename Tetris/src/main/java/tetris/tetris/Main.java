package tetris.tetris;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Ruudukko ruudukko = new Ruudukko(10,20);
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(ruudukko);
        Sovelluslogiikka sovelluslogiiikka = new Sovelluslogiikka(ruudukko);
        ruudukko.tulostaRuudukko();
        Palikka palikka = new Palikka();
        palikka.tulostaPalikka(palikka.IPalikka());
    }
}
