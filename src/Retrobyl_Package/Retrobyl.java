package Retrobyl_Package;

import java.util.Random;

/***
 * Este proyecto es un software de minijuegos creados por consola. Contiene una collecion de minijuegos 
 * 
 * @author Darian,Gabri,Sergio
 * @version 0.0.1v
 */
public class Retrobyl {


	private static Random random = new Random();



	/***
	 * Imprime el título del proyecto con un efecto retro load.
	 *
	 * @throws InterruptedException
	 * 
	 */
	public static void loadHubUserInterface() throws InterruptedException {
		System.out.println("    d8888b. d88888b d888888b d8888b.  .d88b.  d8888b. db    db db    ");
		Thread.sleep(800);
		System.out.println("    88  `8D 88'     `~~88~~' 88  `8D .8P  Y8. 88  `8D `8b  d8' 88     ");
		Thread.sleep(800);
		System.out.println("    88oobY' 88ooooo    88    88oobY' 88    88 88oooY'  `8bd8'  88     ");
		Thread.sleep(800);
		System.out.println("    88`8b   88~~~~~    88    88`8b   88    88 88~~~b.    88    88     ");
		System.out.println("    88 `88. 88.        88    88 `88. `8b  d8' 88   8D    88    88booo.");
		Thread.sleep(800);
		System.out.println("    88   YD Y88888P    YP    88   YD  `Y88P'  Y8888P'    YP    Y88888P");
		System.out.println("  -----------------------------------------------------------------------  ");
		System.out.println("---------------------------------------------------------------------------\n\n");

		System.out.println("Created By : DGS Teams COPYRIGHT LICENSED\n");
		Thread.sleep(700);
	}


	/**
	 * Imprime una serie de frases para simular un tiempo de carga usando un bucle for y numeros aleatorios para ir cambiando de frase.
	 * 
	 *
	 * @throws InterruptedException
	 */
	public static void printHubLoadingScreen() throws InterruptedException {
		String[] arrayFrases = {"CARGANDO DATOS","LLENANDO BOTELLAS DE VODKA","LUCHANDO CON OSOS","LANZANDO BOMBAS NUCLEARES A EEUU"};

		System.out.println("Cargando... 0%");
		
		for(int i=0;i<5;i++){
			System.out.println("| "+ arrayFrases[random.nextInt(4)]+ "..." + " " + ((i+1)*20)+ "%");
			Thread.sleep(random.nextInt(500)+500);
		}
		
		Thread.sleep(500);
	}


	/**
	 * Funcion en donde se imprime el menu principal de juegos
	 * 
	 * 
	 */
	public static void prinListOfGames() {

		System.out.print("\n\n\n\n");
		System.out.println(" ___________________________________________________________________________");
		System.out.println("|                             Retrobyl.exe 19.0.2               |-| |[]| |x||");
		System.out.println(" ___________________________________________________________________________");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|     -------------                                       -------------     |");
		System.out.println("|     | 1) Game 1 |                                       | 2) Game 2 |     |");
		System.out.println("|     -------------                                       -------------     |");
		System.out.println("|                                                                           |");
		System.out.println("|     -------------                                       -------------     |");
		System.out.println("|     | 2) Game 3 |                                       | 3) Game 4 |     |");
		System.out.println("|     -------------                                       -------------     |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|___________________________________________________________________________|");
		System.out.println("|___________________________________________________________________________|");

	}





	//TODO Esta funcion servira como un router para elegir los juegos, aun no hay que tocarla 
	public static int gameSelector(int gameIndex) {
		switch(gameIndex) {
		case 1: return 1;
		case 2: return 2;
		case 3: return 3;
		case 4: return 4;
		case 5: return 5;
		case 6: return 6;
		}
		return 0;
	}


	//Metodo main
	public static void main(String[] args) throws InterruptedException {

		Retrobyl.loadHubUserInterface();
		Retrobyl.printHubLoadingScreen();
		Retrobyl.prinListOfGames();

	}
}