package calculatrice;

import java.util.Scanner;

public class Calculatrice_en_console {

	public Calculatrice_en_console() {

	}

	public void calculatrice() {
		float acquistiondebut = 0;
		float acquisitionsuite = 0;

		String operation = null;

		Scanner scanner = new Scanner(System.in);
		// scanner pour les nombres
		Scanner scanner2 = new Scanner(System.in);
		// scanner pour les opérations
		System.out.println("Taper un nombre pour l'opération");
		acquistiondebut = scanner.nextFloat();
		// en console taper un nombre
		while (true) {
			System.out.println("Taper une operation + ou - ou c");
			// en console taper une operation

			operation = scanner2.nextLine();
			if (operation.equals("c")) {

				System.out.println("Retour à 0");
				// si on tape c on réiniatialise les variables
				acquisitionsuite = 0;
				acquistiondebut = 0;
				System.out.println("Taper un nombre pour l'opération");
				acquistiondebut = scanner.nextFloat();
				// on tape un nombre en console pour la première valeure
				System.out.println("Taper une operation + ou - ou c");
				// en console taper une operation

				operation = scanner2.nextLine();

			}

			System.out.println("Taper un nombre pour l'opération");
			// on tape une valeure en console avant le résultat
			acquisitionsuite = scanner.nextFloat();

			if (operation.equals("-")) {
				// si c'est moins on fait l'opération suivante debut-suite et on stocke la
				// valeur dans acquisitiondébut
				System.out.println("=" + (acquistiondebut - acquisitionsuite));
				acquistiondebut = acquistiondebut - acquisitionsuite;

			}
			if (operation.equals("+")) {
				// si c'est plus on fait l'opération suivante debut+suite et on stocke la valeur
				// dans acquisitiondébut
				System.out.println("=" + (acquistiondebut + acquisitionsuite));
				acquistiondebut = acquistiondebut + acquisitionsuite;
			}

		}
	}

	public static void main(String[] args) {

		new Calculatrice_en_console().calculatrice();

	}

}
