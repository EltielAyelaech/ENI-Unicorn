package fr.eni.ecole.unicorn;

import java.util.ArrayList;
import java.util.List;

public class UnicornPhoneBook {
    public static void main(String[] args) {
        System.out.println("\033[2m1. Déclarez une variable annuaire de type List<Licorne>\033[0m");
        System.out.println("\033[2m2. Valorisez-la avec une instance de ArrayList\033[0m");
        List<Unicorn> phoneBook = new ArrayList<Unicorn>();

        System.out.println("\033[2m3. Ajoutez-y 2 Licorne\033[0m");
        phoneBook.add(new Unicorn("\033[38;2;255;127;0mScootaloo\033[39m", "\033[38;2;255;127;0mOrange\033[39m"));
        phoneBook.add(new Unicorn("\033[38;2;127;191;255mRainbow Dash\033[39m", "\033[38;2;127;191;255mLight Blue\033[39m"));

        System.out.println("\033[2m4. Affichez la liste sur la console de sortie standard\033[0m");
        for (Unicorn unicorn : phoneBook) {
            System.out.println(unicorn);
        }

        System.out.println("\033[2m5. Créez une 2e liste de licornes qui contient 3 autres Licorne et\033[0m");
        System.out.println("\033[2m   affectez-la à une variable autreAnnuaire.\033[0m");
        List<Unicorn> otherPhoneBook = new ArrayList<Unicorn>();

        otherPhoneBook.add(new Unicorn("\033[38;2;255;191;191mPinkie Pie\033[39m", "\033[38;2;255;191;191mPink\033[39m"));
        otherPhoneBook.add(new Unicorn("\033[38;2;255;255;255mRarity\033[39m", "\033[38;2;255;255;255mWhite\033[39m"));
        otherPhoneBook.add(new Unicorn("\033[38;2;255;255;127mFluttershy\033[39m", "\033[38;2;255;255;127mYellow\033[39m"));

        System.out.println("\033[2m6. Affichez autreAnnuaire sur la console de sortie standard.\033[0m");
        for (Unicorn unicorn : otherPhoneBook) {
            System.out.println(unicorn);
        }

        System.out.println("\033[2m7. Ajoutez les licornes de annuaire dans autreAnnuaire\033[0m");
        for (Unicorn unicorn : phoneBook) {
            otherPhoneBook.add(unicorn);
        }

        System.out.println("\033[2m8. Affichez  autreAnnuaire sur la console de sortie standard.\033[0m");
        for (Unicorn unicorn : otherPhoneBook) {
            System.out.println(unicorn);
        }

        System.out.println("\033[2m9. Affichez la 2e licorne de autreAnnuaire\033[0m");
        System.out.println(otherPhoneBook.get(1));

        System.out.println("\033[2m10. Affichez autreAnnuaire sur la console de sortie standard.\033[0m");
        for (Unicorn unicorn : otherPhoneBook) {
            System.out.println(unicorn);
        }

        System.out.println("\033[2m11. Supprimez la 4e licorne de autreAnnuaire\033[0m");
        otherPhoneBook.remove(3);

        System.out.println("\033[2m12. Affichez autreAnnuaire sur la console de sortie standard.\033[0m");
        for (Unicorn unicorn : otherPhoneBook) {
            System.out.println(unicorn);
        }

        System.out.println("\033[2m13. Supprimez la 1ere licorne de annuaire\033[0m");
        phoneBook.remove(0);

        System.out.println("\033[2m14. Affichez annuaire sur la console de sortie standard.\033[0m");
        for (Unicorn unicorn : phoneBook) {
            System.out.println(unicorn);
        }

        System.out.println("\033[2m15. Affichez autreAnnuaire sur la console de sortie standard.\033[0m");
        for (Unicorn unicorn : otherPhoneBook) {
            System.out.println(unicorn);
        }
    }
}
