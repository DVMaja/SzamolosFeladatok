package ciklusok;

public class Szamok {

    public static void main(String[] args) {
        //feladat: A 2,3,4 számjegyekből előállítható számok
        //3 j3gyűek, de bármely számot bárhányszór szerepelhetnek

        for (int k = 2; k <= 4; k++) {
            for (int j = 2; j <= 3; j++) {
                for (int i = 2; i <= 4; i++) {
                    System.out.println(""+ k + j + i);

                }
            }
        }

    }

}
