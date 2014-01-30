package tetris.tetris;

public class Ruudukko {

    int korkeus;
    int leveys;
    int[][] ruudukko;

    public Ruudukko(int x, int y) {
        leveys=x;
        korkeus=y;
        this.ruudukko = new int[x][y];
        for (int i = 0; i < leveys; i++) {
            for (int j = 0; j < korkeus; j++) {
                ruudukko[i][j] = 0;
            }
        }
    }

    public void tulostaRuudukko() {
        for (int i = 0; i < korkeus; i++) {
            for (int j = 0; j < leveys; j++) {
                System.out.print(ruudukko[j][i]);
            }
            System.out.println("");
        }
    }

    public int getKorkeus() {
        return korkeus;
    }

    public int getLeveys() {
        return leveys;
    }
}
