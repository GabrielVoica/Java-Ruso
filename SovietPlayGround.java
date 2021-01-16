package Ejercicio;


/*
 *Es una version de prueba yo le meteria algunos cambios como en la funcion initHub poner otro arte Ascii para el welcome y decorarlo un poco mas
 *en las demas lineeas. El titulo tmb se puede cambiar lo he puesto como provisional. 
 *
 *Id haciendo cambios para tema decoracion y toda la pesca y cuando tengamos el hub hecho del todo empezamos a meter los minijuegos si os parece
 */


public class SovietPlayGround {


	//Imprime por partes el titulo del proyecto
	public static void loadHubUserInterface() throws InterruptedException {
		Thread.sleep(500);
		System.out.println(" ______ __ __   ___       _____ ___  __ __ ____   ___ ______      ____  _      ____ __ __  ____ ____   ___  __ __ ____  ___   ");
		Thread.sleep(500);
		System.out.println("|      |  |  | /  _]     / ___//   \\|  |  |    | /  _|      |    |    \\| |    /    |  |  |/    |    \\ /   \\|  |  |    \\|   \\  ");
		Thread.sleep(500);
		System.out.println("|      |  |  |/  [_     (   \\_|     |  |  ||  | /  [_|      |    |  o  | |   |  o  |  |  |   __|  D  |     |  |  |  _  |    \\ ");
		Thread.sleep(500);
		System.out.println("|_|  |_|  _  |    _]     \\__  |  O  |  |  ||  ||    _|_|  |_|    |   _/| |___|     |  ~  |  |  |    /|  O  |  |  |  |  |  D  |");
		Thread.sleep(500);
		System.out.println("  |  | |  |  |   [_      /  \\ |     |  :  ||  ||   [_  |  |      |  |  |     |  _  |___, |  |_ |    \\|     |  :  |  |  |     |");
		Thread.sleep(500);
		System.out.println("  |  | |  |  |     |     \\    |     |\\   / |  ||     | |  |      |  |  |     |  |  |     |     |  .  |     |     |  |  |     ");
		Thread.sleep(500);
		System.out.println("  |__| |__|__|_____|      \\___|\\___/  \\_/ |____|_____| |__|      |__|  |_____|__|__|____/|___,_|__|\\_|\\___/ \\__,_|__|__|_____|");
        System.out.println("\n\n\n");
        

	}


	//Funcion con la que empieza el programa, simula un tiempo de carga 
	public static void initHub() throws InterruptedException {
		System.out.println("--------------------------------");
		System.out.println("WELCOME TO THE SOVIET PLAYGROUND");
		System.out.println("--------------------------------\n");
		Thread.sleep(1000);

		System.out.println("LOADING HUB...\n");
		Thread.sleep(1000);
		System.out.println("LOADING RESOURCES...0%\n");
		Thread.sleep(300);
		System.out.println("LOADING RESOURCES...10%\n");
		Thread.sleep(1300);
		System.out.println("FILLING VODKA BOTTLES...19%\n");
		Thread.sleep(1000);
		System.out.println("FILLING VODKA BOTTLES...43%\n");
		Thread.sleep(1200);
		System.out.println("LUNCHING NUKES TO USA...67%\n");
		Thread.sleep(1500);
		System.out.println("FIGHTING WITH BEARS...97%\n");
		Thread.sleep(900);
		System.out.println("DONE!...100%\n");
		Thread.sleep(500);
		System.out.println("\n\n\n\n\n");

	}




	public static void main(String[] args) throws InterruptedException {

		SovietPlayGround.loadHubUserInterface();
		SovietPlayGround.initHub();


	}


}
