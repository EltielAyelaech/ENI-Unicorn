package fr.eni.ecole.unicorn;

import java.util.ArrayList;
import java.util.List;

public class UnicornPhoneBook {
    public static void main(String[] args) {
        System.out.println("1. Déclarez une variable annuaire de type List<Licorne>");
        System.out.println("2. Valorisez-la avec une instance de ArrayList");
        List<Unicorn> phoneBook = new ArrayList<Unicorn>();

        System.out.println("3. Ajoutez-y 2 Licorne");
        phoneBook.add(new Unicorn("Scootaloo", "Orange"));
        phoneBook.add(new Unicorn("Rainbow Dash", "Light Blue"));

        System.out.println("4. Affichez la liste sur la console de sortie standard");
        for (Unicorn unicorn : phoneBook) {
            System.out.println(unicorn);
        }

        System.out.println("5. Créez une 2e liste de licornes qui contient 3 autres Licorne et");
        System.out.println("   affectez-la à une variable autreAnnuaire.");
        List<Unicorn> otherPhoneBook = new ArrayList<Unicorn>();

        otherPhoneBook.add(new Unicorn("Pinkie Pie", "Pink"));
        otherPhoneBook.add(new Unicorn("Rarity", "White"));
        otherPhoneBook.add(new Unicorn("Fluttershy", "Yellow"));

        System.out.println("6. Affichez autreAnnuaire sur la console de sortie standard.");
        for (Unicorn unicorn : otherPhoneBook) {
            System.out.println(unicorn);
        }

        System.out.println("7. Ajoutez les licornes de annuaire dans autreAnnuaire");
        for (Unicorn unicorn : phoneBook) {
            otherPhoneBook.add(unicorn);
        }

        System.out.println("8. Affichez  autreAnnuaire sur la console de sortie standard.");
        for (Unicorn unicorn : otherPhoneBook) {
            System.out.println(unicorn);
        }

        System.out.println("9. Affichez la 2e licorne de autreAnnuaire");
        System.out.println(otherPhoneBook.get(1));

        System.out.println("10. Affichez autreAnnuaire sur la console de sortie standard.");
        for (Unicorn unicorn : otherPhoneBook) {
            System.out.println(unicorn);
        }

        System.out.println("11. Supprimez la 4e licorne de autreAnnuaire");
        otherPhoneBook.remove(3);

        System.out.println("12. Affichez autreAnnuaire sur la console de sortie standard.");
        for (Unicorn unicorn : otherPhoneBook) {
            System.out.println(unicorn);
        }

        System.out.println("13. Supprimez la 1ere licorne de annuaire");
        phoneBook.remove(0);

        System.out.println("14. Affichez annuaire sur la console de sortie standard.");
        for (Unicorn unicorn : phoneBook) {
            System.out.println(unicorn);
        }

        System.out.println("15. Affichez autreAnnuaire sur la console de sortie standard.");
        for (Unicorn unicorn : otherPhoneBook) {
            System.out.println(unicorn);
        }
    }
}
