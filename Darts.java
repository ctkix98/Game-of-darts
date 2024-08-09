import java.util.Scanner;
import java.util.Locale;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale.Builder().setLanguage("fr").setRegion("CH").build());
        final int POINTTOTAL = 301;
        final int POINTFINAL = 0;
        int pointUser = 301;
        int pointSaisi;
        int minPoint = 0;
        int maxPoint = 20;
        int point25 = 25;
        int point50 = 50;
        int flechette;
        boolean valeurOk;
        int calcul;

        System.out.println("Bonjour, votre nombre de points est de " + POINTTOTAL);
        System.out.println("Le but du jeu est d'arriver le plus rapidement (et exactement) à zéro en relevant le nombre de points réalisés.");

        do {
            do {
                System.out.println("Veuillez entrer le nombre de point(s) [0;20], 25 ou 50 :");
                pointSaisi = scanner.nextInt();
                scanner.nextLine();

                // Vérifier que la saisie utilisateur est correcte
                valeurOk = (pointSaisi >= minPoint && pointSaisi <= maxPoint) || pointSaisi == point25 || pointSaisi == point50;
                if (!valeurOk) {
                    System.out.println("Le nombre de point(s) n'est pas valide :-)");
                }
            } while (!valeurOk);

            if (pointUser >= pointSaisi) {
                if (pointSaisi >= minPoint && pointSaisi <= maxPoint) {
                    do {
                        System.out.println("Dans quelle zone se trouve la fléchette ?");
                        System.out.println("1 => Zone normale");
                        System.out.println("2 => Zone double");
                        System.out.println("3 => Zone triple");
                        flechette = scanner.nextInt();
                        scanner.nextLine();

                        if (flechette < 1 || flechette > 3) {
                            System.out.println("La zone n'est pas valide :)");
                        }
                    } while (flechette < 1 || flechette > 3);

                    calcul = flechette * pointSaisi;
                    pointUser -= calcul;
                    if (pointUser < 0) {
                        pointUser += calcul;
                        System.out.println("Dommage, vous avez dépassé le score !");
                    }
                } else if (pointSaisi == 25 || pointSaisi == 50) {
                    pointUser -= pointSaisi;
                } else if (pointSaisi == 0) {
                    System.out.println("Oups, il faut tirer sur la cible :)");
                }
            } else {
                System.out.println("Dommage, vous n'avez pas assez de points pour cette action !");
            }

            System.out.println("Nombre de points restants : " + pointUser);
        } while (pointUser != POINTFINAL);

        System.out.println("Bravo, la partie est terminée ! :)");
    }
}
