import java.util.Scanner;
public class zad2 {

    public static void main(String[] args) {

        double odczytTemperatury;
        int wyborFahrenheitLubCelsjusz;
        double wynik;

        Scanner input = new Scanner(System.in);

      

      
        System.out.println("1. Celsjusz do Fahrenheit:");

        wyborFahrenheitLubCelsjusz = input.nextInt();



        System.out.println("Podaj liczbę");
        odczytTemperatury = input.nextDouble();

        if (wyborFahrenheitLubCelsjusz == 1) {

            wynik = (odczytTemperatury * 9 / 5) + 32;
            System.out.println("Temperatura wynosi: " + wynik + " ℉");

        }
    }

    ;
}