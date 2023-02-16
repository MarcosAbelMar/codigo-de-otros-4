import java.util.Scanner;
// Importar la libreria para el escanner 
public class CodigoOtros {
	public static void main(String[] args) {
		//Declarar el Scanner correctamente 
		Scanner sc = new Scanner(System.in);
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = sc.nextLine(); //Declarar correctamente la entrada de datos 

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		String j2 = sc.nextLine();

		if (j1 == j2) {
			System.out.println("Empate");
		} else {
			int g = 2;
			switch (j1) {
			case "piedra":
				if (j2 == "tijeras") {
					g = 1;
				}

			case "papel":
				if (j2 == "piedra") {
					g = 1;
				}
			case "tijera":
				if (j2.equals("papel")) {
					g = 1;
				}
				break;
			default:
			}
			System.out.println("Gana el jugador " + g);
		}
		sc.close(); //cerrar el Scanner como buena practica 
	}
}
