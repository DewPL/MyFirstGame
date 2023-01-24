import java.io.IOException;
import java.util.Scanner;

// Menu                                                                                                    Menu
public class Menu {

        static Scanner in = new Scanner(System.in);
        public char choice;
        public char ignore;


        void menu () throws IOException {

            // Gracze

            // Gracz 1
            Gracze gracz1 = new Gracze();
            // Gracz 2
            Gracze gracz2 = new Gracze();
            // Gracz 3
            Gracze gracz3 = new Gracze();


        // Menu

        System.out.println("Wybierz Postać:");
        System.out.println("\t 1. Harry Potter");
        System.out.println("\t 2. Hermiona Granger");
        System.out.println("\t 3. Ron Weasley");

        // Menu                                                                                                    Menu

        for (; ; ) {
            do {

                System.out.println("4. Przejrzyj karty czarów");
                System.out.println("5. Zakup karty czaru");
                System.out.println("6. Rozpocznij turę");
                System.out.println("q. Wyjście");

                choice = (char) System.in.read();
                System.out.println("Twój wybór: " + choice);
                System.out.println();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;

            switch (choice) {
                case '1': // Harry Potter
                    System.out.println(gracz1.p1);
                    System.out.println("Atak: " + gracz1.atak1);
                    System.out.println("Punkty Życia: " + gracz1.hp1);
                    System.out.println("Punkty Obrony: " + gracz1.def1);
                    System.out.println("Podstawowe karty");
                    break;

                case '2': // Hermiona Granger
                    System.out.println(gracz2.p2);
                    System.out.println("Atak: " + gracz2.atak2);
                    System.out.println("Punkty Życia: " + gracz2.hp2);
                    System.out.println("Punkty Obrony: " + gracz2.def2);
                    System.out.println("Podstawowe karty");
                    break;

                case '3': // Ron Weasley
                    System.out.println(gracz3.p3);
                    System.out.println("Atak: " + gracz3.atak3);
                    System.out.println("Punkty Życia: " + gracz3.hp3);
                    System.out.println("Punkty Obrony: " + gracz3.def3);
                    System.out.println("Podstawowe karty");
                    break;

                case '4':

                case '5':

                case '6':
                    System.out.println("Walka");



            } // Switch


        } // For
    } // void
} // class