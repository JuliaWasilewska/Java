import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class zadd6 {


        public static void main(String[] args) {


            int dzien_tygodnia = 0;
            Scanner odczyt = new Scanner(System.in);
            System.out.print("Podaj liczbe od 1 do 7 \n");
            dzien_tygodnia = odczyt.nextInt();
            if (dzien_tygodnia == 1)
                System.out.println("Poniedziałek");
            else if (dzien_tygodnia == 2)
                System.out.println("Wtorek");
            else if (dzien_tygodnia == 3)
                System.out.println("Środa");
            else if (dzien_tygodnia == 4)
                System.out.println("Czwartek");
            else if (dzien_tygodnia == 5)
                System.out.println("Piątek");

            else if (dzien_tygodnia == 6)

                System.out.println("Sobota");
            else if (dzien_tygodnia == 7)

                System.out.println("Niedziela");
            else
                System.out.println("Nie ma takiego dnia tygodnia !");

        }
        ;
    }

