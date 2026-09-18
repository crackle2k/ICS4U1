/*
Author: Dinesh Sinnathamby
Date: September 18th, 2026
Description: Translation program explaining various Ojibwe terms, providing both the English meaning and a short description.
*/

package net.dinesh.unit1.assignment;

import java.util.Scanner;

public class CulturalTranslator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char playAgain;

        do {

            System.out.println("Select a term to learn:");
            System.out.println("[1] Aaniin");
            System.out.println("[2] Miigwech");
            System.out.println("[3] Akinoomaage");
            System.out.println("[4] Mino-bimaadiziwin");
            System.out.println("[5] Gichi-apiitendaagozi");

            String selection = input.nextLine();
            translate(selection);

            System.out.println("Would you like to use the calculator again?");
            playAgain = input.next().toLowerCase().charAt(0);

        } while (playAgain == 'y');

        System.out.println("Thanks for using the translator, see you later!");
        input.close();
    }

    public static void translate(String selection) {

        if (selection == "1") {
            System.out.println("Ojibwe Term: Aaniin");
            System.out.println("English Translation: Hello / I see your light");
            System.out.println("Acknowledges the spiritual presence or light within another person.");
        } else if (selection == "2") {
            System.out.println("Ojibwe Term: Miigwech");
            System.out.println("English Translation: Thank you");
            System.out.println("Expresses deep gratitude and respect toward community members or nature.");
        } else if (selection == "3") {
            System.out.println("Ojibwe Term: Akinoomaage");
            System.out.println("English Translation: To teach / To point towards the earth");
            System.out.println("Reflects the worldview that true learning comes from observing the Earth.");
        } else if (selection == "4") {
            System.out.println("Ojibwe Term: Mino-bimaadiziwin");
            System.out.println("English Translation: The good life");
            System.out.println("A central philosophy of living in balance, health, and harmony with all creation.");
        } else if (selection == "5") {
            System.out.println("Ojibwe Term: Gichi-apiitendaagozi");
            System.out.println("English Translation: They are of great value");
            System.out.println("Denotes deep respect for Elders and their irreplaceable wisdom.");
        } else {
            System.out.println("Invalid selection, please try again!");
        }
    }
}
