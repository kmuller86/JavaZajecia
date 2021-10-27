import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/* zad.1 */
        int mójWiek= 22;
        int modulo = 3;
        int wynik = 22%3;
        System.out.println("W pierwszej kolejności sprawdzimy czy mój wiek jest podzielny przez 3");
        if (wynik == 0){
            System.out.println("Podzielny przez 3 ");
        } else {
            System.out.println("Niepodzielny przez 3");
        }
        System.out.println("Następnie sprawdzimy czy mój numer indeksu jest parzysty");
        int nrIndeksu = 56178;
        String wynik1 = nrIndeksu % 2 ==0 ? "parzysta": "nieparzysta" ;
        System.out.println(wynik1);

        System.out.println("Na końcu podążamy za poleceniemi.");
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.GERMAN);
        System.out.println("Proszę podać jedną liczbę zmiennoprzecinkową (jako separatora proszę użyć przecinka) :");
        double zmienna = scan.nextDouble();
        if (zmienna < 10 ){
            System.out.println("Wskazana liczba jest mniejsza od 5");
        } else if (zmienna == 10){
            System.out.println("Wskazana liczba jest równa 10");
        } else {
            System.out.println("Wskazana liczba jest większa od 10");
        }
        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

    }
}
