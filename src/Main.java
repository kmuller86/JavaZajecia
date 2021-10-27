
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zadanie 1 */
        System.out.println("\nWitaj. W pierwszym zadaniu po uzupełnieniu wymaganych luk program wypisze Twoje dane na konsoli");
                Scanner scan = new Scanner(System.in);
                scan.useLocale(Locale.GERMAN);
        System.out.println("Podaj swoje imię: " );
                String name = scan.nextLine();
        System.out.println("Podaj swoje nazwisko: " );
                String secondName= scan.nextLine();
        System.out.println("Podaj swój wiek: ");
                int age = scan.nextInt();
        System.out.println("Podaj swój numer indeksu");
                int indeks = scan.nextInt();
                System.out.println("Cześć! Nazywam się " + name + secondName );
                System.out.println("Mam " + age + " lat");
                System.out.println("A mój numer indeksu to: " + indeks);
        System.out.printf("Cześć mam na imię %s, a moje nazwisko to %s. \n", name, secondName );
        System.out.printf("Mam %d lat. \n", age );
        System.out.printf("Mój numer indeksu : %d \n \n", indeks);


        /* zadanie 2 */
        System.out.println("Czas na drugie zadanie. \nPo wpisaniu dwóch liczb całkowitych program wyświetli Ci wyniki podstawowych działań arytmetycznych ");
        System.out.println("Podaj pierwszą liczbę całkowitą : ");
        int pierwszaLiczba = scan.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą: ");
        int drugaLiczba = scan.nextInt();
        int wynik1 = pierwszaLiczba + drugaLiczba;
        int wynik2 = pierwszaLiczba - drugaLiczba;
        int wynik3 = pierwszaLiczba * drugaLiczba;
        int wynik4 = pierwszaLiczba / drugaLiczba;
        int wynik5 = pierwszaLiczba % drugaLiczba;

        System.out.println("Wynik dodawania: " + wynik1);
        System.out.println("Wynik odejmowania " + wynik2);
        System.out.println("Wynik mnożenia " + wynik3);
        System.out.println("Wynik dzielenia: " + wynik4);
        System.out.println("Wynik modulo: " + wynik5);

            }
        }


        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */


