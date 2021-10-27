import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                scan.useLocale(Locale.GERMAN);
                String name = scan.nextLine();
                String secondName= scan.nextLine();
                int age = scan.nextInt();
                int indeks = scan.nextInt();
                System.out.println("Cześć! Nazywam się " + name + secondName);
                System.out.println("Mam " + age + " lat");
                System.out.println("A mój numer indeksu to: " + indeks);
        System.out.printf("Cześć mam na imię %s, a moje nazwisko to %s. \n", name, secondName );
        System.out.printf("Mam %d lat. \n", age );
        System.out.printf("Mój numer indeksu : %d \n", indeks);

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


