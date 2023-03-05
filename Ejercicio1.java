//Ejercicio resuelto No 4.

import java.util.Scanner;
public class Ejercicio1 {
            public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
                int edadJuan, edadAlberto, edadAna, edadMama;

                edadJuan = entrada.nextInt();
                edadAlberto = 2 * edadJuan / 3;
                edadAna = 4 * edadJuan / 3;
                edadMama = edadJuan + edadAlberto + edadAna;

                System.out.println("LAS EDADES SON: ALBERTO = " + edadAlberto + ", " + "JUAN = " + edadJuan + ", " + "ANA = " + edadAna + ", " + "MAMA = " + edadMama);
    }
}