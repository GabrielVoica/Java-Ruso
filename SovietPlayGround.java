package Ejercicio;

public class SovietPlayGround {


	public static void initHub() throws InterruptedException {
		System.out.println("WELCOME TO THE SOVIET PLAYGROUND");
		System.out.println("--------------------------------");
		Thread.sleep(1000);
		
		System.out.println("LOADING HUB...");
		Thread.sleep(1000);
		System.out.println("LOADING RESOURCES....0%");
		Thread.sleep(300);
		System.out.println("LOADING RESOURCES....10%");
		Thread.sleep(600);
		System.out.println("FILLING VODKA BOTTLES....19%");
		Thread.sleep(1000);
		System.out.println("FILLING VODKA BOTTLES....43%");
		Thread.sleep(800);
		System.out.println("LUNCHIONG NUKES TO USA......67%");
		Thread.sleep(1000);
		System.out.println("LUNCHIONG NUKES TO USA......97%");
		Thread.sleep(800);
		System.out.println("DONE!........100%");
		Thread.sleep(500);
		System.out.println("\n\n\n\n\n");
		
	}


	public static void loadHubUserInterface() throws InterruptedException {
		Thread.sleep(500);
		System.out.println(" ______ __ __   ___       _____ ___  __ __ ____   ___ ______      ____  _      ____ __ __  ____ ____   ___  __ __ ____  ___   ");
		Thread.sleep(700);
		System.out.println("|      |  |  | /  _]     / ___//   \\|  |  |    | /  _|      |    |    \\| |    /    |  |  |/    |    \\ /   \\|  |  |    \\|   \\  ");
		Thread.sleep(700);
		System.out.println("|      |  |  |/  [_     (   \\_|     |  |  ||  | /  [_|      |    |  o  | |   |  o  |  |  |   __|  D  |     |  |  |  _  |    \\ ");
		Thread.sleep(700);
		System.out.println("|_|  |_|  _  |    _]     \\__  |  O  |  |  ||  ||    _|_|  |_|    |   _/| |___|     |  ~  |  |  |    /|  O  |  |  |  |  |  D  |");
		Thread.sleep(700);
		System.out.println("  |  | |  |  |   [_      /  \\ |     |  :  ||  ||   [_  |  |      |  |  |     |  _  |___, |  |_ |    \\|     |  :  |  |  |     |");
		Thread.sleep(700);
		System.out.println("  |  | |  |  |     |     \\    |     |\\   / |  ||     | |  |      |  |  |     |  |  |     |     |  .  |     |     |  |  |     ");
		Thread.sleep(700);
		System.out.println("  |__| |__|__|_____|      \\___|\\___/  \\_/ |____|_____| |__|      |__|  |_____|__|__|____/|___,_|__|\\_|\\___/ \\__,_|__|__|_____|");
		
		
	}


	public static void main(String[] args) throws InterruptedException {

		SovietPlayGround.initHub();
		SovietPlayGround.loadHubUserInterface();

	}


}
