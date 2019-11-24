package randomNumber;

import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner scanner=new Scanner(System.in);
    Random rand = new Random();

    public void play() {
        System.out.println("Program losuje...");
        int randInt=rand.nextInt(100);

        int counter = 0;
        do {
            System.out.println("Graczu, podaj swoją liczbę w zakresie 0-99!");
            int enterInt=scanner.nextInt();
            checkRange(enterInt);
            if (randInt==enterInt) {
                System.out.println("Congratulations!");
                return;
            }
            if (randInt>enterInt) System.out.println("Za mało!");
            else System.out.println("Za dużo!");
        }
        while (counter++<7);
    }

    private int checkRange(int a) {
        while (a>99 || a<0) {
            System.out.println("Podaj liczbę z właściwego zakresu: ");
            a=scanner.nextInt();
        }
        return a;
    }

    public void computerGuess() {
        System.out.println("Graczu, podaj liczbę: ");
        int a=scanner.nextInt();
        System.out.println("Komputer próbuje zgadnąć, jaką liczbę wpisałeś...");
        int b;

        do {
            b=rand.nextInt(100);
        }
        while(a!=b);

        System.out.println("Wybrałeś liczbę: " + b);
    }
}
