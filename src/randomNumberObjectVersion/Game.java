//package randomNumberObjectVersion;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Game {
//
//    Scanner scanner=new Scanner(System.in);
//
//    Player ludzik=new Human("Wojtula");
//    Player comp=new Computer("Komputerek");
//    NumGenerator człowieczy=new HumanNumber();
//    NumGenerator losowy = new RandNumber();
//
//    public void play() {
//        int a=ludzik.guessNumber();
//        int b=comp.guessNumber();
//    }
//
//    private int checkRange(int a) {
//        while (a>99 || a<0) {
//            System.out.println("Podaj liczbę z właściwego zakresu: ");
//            a=scanner.nextInt();
//        }
//        return a;
//    }
//
//    public void computerGuess() {
//        System.out.println("Graczu, podaj liczbę: ");
//        int a=scanner.nextInt();
//        System.out.println("Komputer próbuje zgadnąć, jaką liczbę wpisałeś...");
//        int b;
//
//        do {
//            b=rand.nextInt(100);
//        }
//        while(a!=b);
//
//        System.out.println("Wybrałeś liczbę: " + b);
//    }
//}
