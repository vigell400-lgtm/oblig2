package no.hvl.dat100.matriser;


public class Matriser {


    // a)
    public static void skrivUt(int[][] matrise) {

        for (int[] rad : matrise) {
            for (int tall : rad) {
                System.out.print(tall + " ");
            }
            System.out.println();
        }
    }



    // b)
    public static String tilStreng(int[][] matrise) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                sb.append(matrise[i][j]).append(" "); // legg alltid mellomrom etter tallet
            }
            sb.append("\n"); // legg alltid linjeskift etter hver rad, også siste
        }

        return sb.toString();
    }



    // c)
    public static int[][] skaler(int tall, int[][] matrise) {

        int[][] ny = new int[matrise.length][matrise[0].length];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                ny[i][j] = matrise[i][j] * tall;
            }
        }
        return ny;
    }


    // d)
    public static boolean erLik(int[][] a, int[][] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) return false;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }



    // e)
    public static int[][] speile(int[][] matrise) {


        int n = matrise.length;
        int[][] ny = new int[n][matrise[0].length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                ny[i][j] = matrise[j][i]; // speiling langs diagonal
            }
        }
        return ny;
    }



    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {
        int rader = a.length;
        int kolonner = b[0].length;
        int felles = a[0].length;

        int[][] ny = new int[rader][kolonner];

        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                int sum = 0;
                for (int k = 0; k < felles; k++) {
                    sum += a[i][k] * b[k][j];
                }
                ny[i][j] = sum;
            }
        }
        return ny;
    }
}


	
