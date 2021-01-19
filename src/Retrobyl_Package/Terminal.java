package Retrobyl_Package;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que simula una terminal en Linux. Para navegar entre directorios hay que usar siempre la ruta absoluta
 * 
 * 
 * @author Elver Galarga
 *
 */
public class Terminal {

	
	private static Scanner scanner = new Scanner(System.in);
	
	//Directorio con el que inicia la terminal
	private static String directorioActual = "./User";


	//Array donde se guardan todas las possibles rutas
	private static String[] arrayDirectorios = {
			"./User",
			"./User/Retrobyl",
			"./User/Retrobyl/Games",
			"./User/Retrobyl/SecretosNucleares"
	};


	//Metodo que imprime el prompt de la terminal
	public static void imprimirTerminal(){
		System.out.print("\nchernovyl@chernovyl:~$ ");
	}


	
	//Inicia la terminal
	public static void iniciarTerminal() {
		controladorTerminal();
	}


	//Controla cada sequencia de comandos en la terminal
	public static void controladorTerminal() {
		
		imprimirTerminal();
		String comando = scanner.nextLine();
		if(comando.length()<=0) {
		 controladorTerminal();
		}
		routerComandos(comando);
	}


	//Este metodo hace de router para usar el comando introducido por consola
	public static void routerComandos(String comando) {

		if(comando.equals("ls")) {
			comandoList();
		}
		else if (comando.equals("pwd")) {
			System.out.println("\n"+directorioActual+"\n");
			controladorTerminal();
		}
		else if(comando.charAt(0)=='c' && comando.charAt(1)=='d') {
			comandoChangeDirectory(comando.substring(3,comando.length()));
		}
		else {
			System.out.println("No existe tal comando");
			controladorTerminal();
		}
	}


	//Comando ls
	public static void comandoList() {
		if(directorioActual.equals("./User/Retrobyl/Games")) {
			System.out.println("\nJuego 1   Juego 2   Juego 3");
			System.out.println("Juego 4   Juego 5   Juego 6\n");
			controladorTerminal();
		}

		else if(directorioActual.equals("./User/Retrobyl")) {
			System.out.println("\nGames   README.me   Crack");
			System.out.println("Author   Plutionium.exe   SecretosNucleares\n");
			controladorTerminal();
		}
		
		else if(directorioActual.equals("./User")) {
			System.out.println("Retrobyl");
			controladorTerminal();
		}
		
		else {
			System.out.println("ERROR");
			controladorTerminal();
		}
	}


    //Comando cd
	public static void comandoChangeDirectory(String directory) {

		if(Arrays.asList(arrayDirectorios).contains(directory)) {
			directorioActual = directory;
			controladorTerminal();
		}
		else {
			System.out.println("\nNo existe tal directorio");
			controladorTerminal();
		}  
	}




    //Metodo MAIN
	public static void main(String[] args) {

		Terminal.iniciarTerminal();


	}

}
