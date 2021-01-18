/*
 *Es una version de prueba yo le meteria algunos cambios como en la funcion initHub poner otro arte Ascii para el welcome y decorarlo un poco mas
 *en las demas lineeas. El titulo tmb se puede cambiar lo he puesto como provisional. 
 *
 *Id haciendo cambios para tema decoracion y toda la pesca y cuando tengamos el hub hecho del todo empezamos a meter los minijuegos si os parece
 */


public class Retrobyl {


	//Imprime por partes el titulo del proyecto y sus creadores
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
		Thread.sleep(300);
		System.out.println("Members: Darian, Gabriel,Sergio\n\n");

	}


	//Funcion con la que empieza el programa, simula un tiempo de carga del programa
	public static void initHub() throws InterruptedException {
		
		Thread.sleep(1000);
		System.out.println("|LOADING HUB...                     |\n");
		Thread.sleep(1000);
		System.out.println("|LOADING RESOURCES...0%             |\n");
		Thread.sleep(300);
		System.out.println("|LOADING RESOURCES...10%            |\n");
		Thread.sleep(1300);
		System.out.println("|FILLING VODKA BOTTLES...19%        |\n");
		Thread.sleep(1000);
		System.out.println("|FILLING VODKA BOTTLES...43%        |\n");
		Thread.sleep(1200);
		System.out.println("|LUNCHING NUKES TO USA...67%        |\n");
		Thread.sleep(1500);
		System.out.println("|FIGHTING WITH BEARS...97%          |\n");
		Thread.sleep(900);
		System.out.println("|DONE!...100%                       |\n");
		Thread.sleep(500);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println();
	}
	
	
	public static void listGames() {
	
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(" ___________________________________________________________________________");
		System.out.println("|                             HUB.exe 19.0.2                    |-| |[]| |x||");
		System.out.println(" ___________________________________________________________________________");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|     -------------                          ------------                   |");
		System.out.println("|     | 1) Game 1 |                          | 2) Game 2 |                  |");
		System.out.println("|     -------------                           -----------                   |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println("|                                                                           |");
		System.out.println(" ___________________________________________________________________________");
		System.out.println(" ___________________________________________________________________________");}




	public static void main(String[] args) throws InterruptedException {

		Retrobyl.loadHubUserInterface();
		Retrobyl.initHub();
		Retrobyl.listGames();

	}


}