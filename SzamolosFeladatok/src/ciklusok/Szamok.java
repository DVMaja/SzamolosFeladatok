package ciklusok;

import java.util.Scanner;

public class Szamok {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SarkanyosFeladat();
        //SzamosKiiratas();

    }

    private static void SarkanyosFeladat() {
        //int x = 7, y = 11;

        for (int y = 1; y <= 13; y++) {
            for (int x = 1; x <= 20; x++) {
                if (11 * y + 7*x == 145) {
                    System.out.println("7 fejűből van: "+ x);
                    System.out.println("11 fejűből van " + y);
                    System.out.println("---------------------");
                }
                //System.out.println("" + y + x);
            }
        }
    }

    private static void SzamosKiiratas() {
        //feladat: A 2,3,4 számjegyekből előállítható számok
        //3 j3gyűek, de bármely számot bárhányszór szerepelhetnek
        //csak ismétlés nélküli számokat
        //ismetlesre hány darab van
        // 27 meg 6 lesz

        //boolean ismetel = false;
        System.out.println("Ismétléssel(i/n): ");

        String v = sc.next();

        boolean ismetel = v.equals("i");
        int ismetleses = 0, ismetlesNelkül = 0;

        for (int k = 2; k <= 4; k++) {
            for (int j = 2; j <= 4; j++) {
                for (int i = 2; i <= 4; i++) {

                    if (ismetel) {
                        //System.out.println("" + k + j + i);
                        System.out.printf("%d%d%d\n", k, j, i);
                        ismetleses++;
                    } else if (k != j && k != i && j != i) {
                        System.out.printf("%d%d%d\n", k, j, i);
                        ismetlesNelkül++;
                    }

                }
            }
        }
        if (ismetel) {
            System.out.println("Ismétléssel: " + ismetleses);
        } else {
            System.out.println("Ismétlésnélkül: " + ismetlesNelkül);
        }
    }

}
