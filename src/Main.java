import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Pierwszy sposób budowania tablicy */

        System.out.println("Pierwszy sposób budowania tablicy");
        double[] tab1 = {4.2,5.1,6.3,4.7,5.5};
        System.out.println(tab1.length);

        /* Drugi sposób budowania tablicy */

        System.out.println("Drugi sposób budowania tablicy");
        double[] tab2 = new double[5];
        tab2[0] = 5.4;
        tab2[1] = 4.2;
        tab2[2] = 3.1;
        tab2[3] = 2.0;
        tab2[4] = 1.9;
        System.out.println(tab2.length);
        System.out.println(tab1);
        System.out.print(tab2);;

        /* Trzeci sposób budowania tablicy */

        System.out.println("Trzeci sposób budowania tablicy");
        double[] tab3 = new double[5];
        for (double i = 0.3 ; i< tab3.length; i++){
            tab3[(int) i]=i+0.5; /* Dlaczego domaga się w środku int'a ???? zapytać na zajęciach  */
        /*
        Ponieważ wybiera pan numer indexu tablicy który jest liczbą całkowitą 0, 1, 2, 3 ... .
        Ten for jest źle napisany i powinno być liczbą całkowitą bo to jest index którym iterujemy (poruszamy się po tablicy)
        jak juz można by zrobić coś takiego:
        
        for(int i = 0; i<tab3.length; i++) {
        tab3[i] = (double) i;
        albo np. (wymyslony przyklad), ale i musi byc liczba calkowitą w tablicy --> np. tab[2]
        tab3[i] = (double) i + (i+1) / 7.2;
        }
        zawsze może pan tez użyć innej zmiennej, jakiejs dodatkowej:
        double z = 0.2;
         for(int i = 0; i<tab3.length; i++) {
         tab3[i] = z;
         z += 0.8;
         }
        
        
        */
            System.out.println(tab3[(int) i]+ "");  /* ten sam problem co wyżej !!! zapytać na zajęciach */
        }

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

    }
}
