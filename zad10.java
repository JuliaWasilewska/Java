import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class zad10 {
    static String a,b,c;
    static int x,komp,czlowiek,wynik_komp=0,wynik_czlowiek=0,licznik = 0,ponownie;

    public static void main(String args[]) throws IOException
    {

        System.out.println("Gra w  Papier Kamień  Nożyce:");

        while(licznik<1) {
            System.out.println("Do ilu wygranych chcesz grać?");
            System.out.print("=>");
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in), 1);
            a = stdin.readLine();
            try {
                x = Integer.parseInt(a);
            } catch (NumberFormatException e) {
                System.out.println("Należy podać liczbę!");
                System.exit(0);
            }
            System.out.println("Gra ustawiona jest do " + a + " wygranych.");
            while (wynik_czlowiek < x && wynik_komp < x) {
                System.out.println("\nWybieram:");
                System.out.println("1.Papier.\n2.Nożyce.\n3.Kamień.");
                System.out.print("=>");
                BufferedReader wybor = new BufferedReader(new InputStreamReader(System.in), 1);
                b = wybor.readLine();
                try {
                    czlowiek = Integer.parseInt(b);
                } catch (NumberFormatException e) {
                    System.out.println("Należy podać liczbę!");
                    System.exit(0);
                }
                Random losuj = new Random();
                komp = losuj.nextInt(3) + 1;
                if (czlowiek == 1 && komp == 3) {
                    System.out.println("Komputer wybrał Kamień. Wygrałeś!!");
                    wynik_czlowiek++;
                } else if (czlowiek == 1 && komp == 2) {
                    System.out.println("Komputer wybrał Nożyczki. Przegrałeś!!");
                    wynik_komp++;
                } else if (czlowiek == 2 && komp == 1) {
                    System.out.println("Komputer wybrał Papier. Wygrałeś!!");
                    wynik_czlowiek++;
                } else if (czlowiek == 2 && komp == 3) {
                    System.out.println("Komputer wybrał Kamień. Przegrałeś!!");
                    wynik_komp++;
                } else if (czlowiek == 3 && komp == 1) {
                    System.out.println("Komputer wybrał Papier. Przegrałeś!!");
                    wynik_komp++;
                } else if (czlowiek == 3 && komp == 2) {
                    System.out.println("Komputer wybrał Nożyczki. Wygrałeś!!");
                    wynik_czlowiek++;
                } else {
                    System.out.println("Komputer wybrał to samo. Remis!!");
                }
                System.out.println("\n Status Wygranych:\n    Komputer: " + wynik_komp + "    Gracz: " + wynik_czlowiek);
            }
            if (wynik_czlowiek > wynik_komp) {
                System.out.println(" ZWYCIĘSTWO  \n Końcowy wynik  " + wynik_komp + ":" + wynik_czlowiek + " |");

            } else if (wynik_komp > wynik_czlowiek) {
                System.out.println(" PRZEGRANA \n Końcowy wynik to  " + wynik_komp + ":" + wynik_czlowiek + " |");

            } else {
                System.out.println(" REMIS  \n Końcowy wynik to  " + wynik_komp + ":" + wynik_czlowiek + " |");
            }
            System.out.println("\nCzy chcesz zagrać ponownie ? 1-Tak 2-Nie");
            System.out.print("=>");
            BufferedReader koniec = new BufferedReader(new InputStreamReader(System.in), 1);
            c = koniec.readLine();
            try {
                ponownie = Integer.parseInt(c);
            } catch (NumberFormatException e) {
                System.out.println("Należy podać liczbę!");
                System.exit(0);
            }
            if (ponownie == 1) {
                wynik_komp = 0;
                wynik_czlowiek = 0;
            } else if (ponownie == 2) {

                licznik = 1;
            }

        }
    }
    ;
}




