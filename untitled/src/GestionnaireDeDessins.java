import java.util.Scanner;

public class GestionnaireDeDessins {

    public static void menuDessins() {
        String menu = "1. afficher un rectangle\n2. afficher un triangle rectangle gauche\n3. afficher un triangle rectangle droit";
        System.out.println(menu);
        Scanner scanner = new Scanner(System.in);
        System.out.println("choisir un nombre entre 1 et 3, 4 pour arrêter");
        int choix = scanner.nextInt();
        if (choix < 1 || choix > 3) {
            System.out.println("Erreur,veuillez choisir un chiffre en 1 et 3");
        } else {

            switch (choix) {
                case 1:
                    System.out.println("Largeur du rectangle : ");
                    int largeur = scanner.nextInt();
                    System.out.println("Hauteur du rectangle : ");
                    int hauteur = scanner.nextInt();
                    ServiceDeDessins.afficherRectangle(largeur, hauteur);
                    break;
                case 2:
                    System.out.println("Hauteur du triangle : ");
                    int hauteurTriangleG = scanner.nextInt();
                    ServiceDeDessins.afficherTriangleRectangleGauche(hauteurTriangleG);
                    break;
                case 3:
                    System.out.println("Hauteur du triangle : ");
                    int hauteurTriangleD = scanner.nextInt();
                    ServiceDeDessins.afficherTriangleRectangleDroit(hauteurTriangleD);
                    break;
                case 4:
                    System.out.println("Fin du programme");
                    break;

            }
        }
    }
}