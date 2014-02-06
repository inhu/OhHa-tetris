package tetris.tetris;

import java.util.Random;

public class Palikka {

    int[][] palat;

    public Palikka() {
        this.palat = arvoPalikka();
    }

    public int[][] arvoPalikka() {
        Random r = new Random();
        int x = r.nextInt(6);
        if (x == 0) {
            return IPalikka();
        } else if (x == 1) {
            return JPalikka();
        } else if (x == 2) {
            return LPalikka();
        } else if (x == 3) {
            return OPalikka();
        } else if (x==4){
            return SPalikka();
        } else if (x==5){
            return TPalikka();
        } else {
            return ZPalikka();
        }
    }

    public int[][] IPalikka() {
        int[][] palikka = new int[4][4];
        for (int i = 0; i < 4; i++) {
            palikka[i][1] = 2;
        }
        return palikka;
    }

    public int[][] JPalikka() {
        int[][] palikka = new int[4][4];
        palikka[0][1] = 2;
        palikka[1][1] = 2;
        palikka[2][1] = 2;
        palikka[2][2] = 2;
        return palikka;
    }

    public int[][] LPalikka() {
        int[][] palikka = new int[4][4];
        palikka[0][1] = 2;
        palikka[1][1] = 2;
        palikka[2][1] = 2;
        palikka[0][2] = 2;
        return palikka;
    }

    public int[][] OPalikka() {
        int[][] palikka = new int[4][4];
        palikka[1][1] = 2;
        palikka[2][1] = 2;
        palikka[1][2] = 2;
        palikka[2][2] = 2;
        return palikka;
    }

    public int[][] SPalikka() {
        int[][] palikka = new int[4][4];
        palikka[2][1] = 2;
        palikka[3][1] = 2;
        palikka[1][2] = 2;
        palikka[2][2] = 2;
        return palikka;
    }

    public int[][] TPalikka() {
        int[][] palikka = new int[4][4];
        palikka[1][1] = 2;
        palikka[0][2] = 2;
        palikka[1][2] = 2;
        palikka[2][2] = 2;
        return palikka;
    }

    public int[][] ZPalikka() {
        int[][] palikka = new int[4][4];
        palikka[1][1] = 2;
        palikka[2][1] = 2;
        palikka[2][2] = 2;
        palikka[3][2] = 2;
        return palikka;
    }

    public void tulostaPalikka(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[j][i]);
            }
            System.out.println("");
        }
    }

    public void kaannaPalikka() {
        int[][] kaannetty = new int[4][4];
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                kaannetty[c][4 - 1 - r] = this.palat[r][c];
            }
        }
        this.palat = kaannetty.clone();
    }

    public int[][] getPalat() {
        return this.palat;
    }
}
