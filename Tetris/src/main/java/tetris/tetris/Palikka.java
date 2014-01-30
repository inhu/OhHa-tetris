
package tetris.tetris;

import java.util.Random;

public class Palikka {
    
    int[][] palat;
    
    public Palikka(){
        this.palat=arvoPalikka();
    }

    public int[][] arvoPalikka() {
        Random r = new Random();
        int x = r.nextInt(6);
        if(x==0){
            return IPalikka();
        }
        return null;
    }

    public int[][] IPalikka() {
        int[][] palikka = new int[4][4];
        for (int i = 0; i < 4; i++) {
            palikka[i][1]=2;
        }
        return palikka;
    }
    public void tulostaPalikka(int[][] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[j][i]);
            }
            System.out.println("");
        }
    }
    
}
