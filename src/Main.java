import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        /* Zadanie 1 */
int zmienna1 = 3;
double zmienna2=1.5;
float   zmienna3 = 33333;
byte zmienna4 = 22;
short zmienna5 = 2525;
long zmienna6 = 999999999;
boolean zmienna7 =false;
char zmienna8  = 'f';
String zmienna9 = "Jestem Piotr";


        /* Zadanie 2 */
int liczbaA = 4;
int liczbaB = 3;
        System.out.println(liczbaA + liczbaB);
        System.out.println(liczbaA - liczbaB );
        System.out.println(liczbaA * liczbaB);
        System.out.println( liczbaA / liczbaB);
        System.out.println( liczbaA % liczbaB);


        System.out.println("\nTeraz podpunkt B\n");

double liczbaC = 8.5;
double liczbaD = 5.25;
        System.out.println( liczbaC + liczbaD);
        System.out.println( liczbaC-liczbaD);
        System.out.println( liczbaC*liczbaD);
        System.out.println( liczbaC/liczbaD);
        System.out.println(liczbaC%liczbaD);

     }
}
