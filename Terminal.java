package primerproyectos;
import java.util.*;

public class Terminal {

	private static Scanner scanner = new Scanner(System.in);
	static Stack<String> stack = new Stack<String>();
	static Stack<String> dir = new Stack<String>();
	static Stack<String> archivo = new Stack<String>();
	static Stack<String> scripts = new Stack<String>();
	static int num = 2;

	//Directorio con el que inicia la terminal
	private static String directorioActual = directoriostack(stack).elementAt(num);

	//Directorio para el cat
	private static String catactual = "/";
	private static String shactual = "/";


	public static Stack<String> directoriostack(Stack<String> stack) {
		stack.add("/"); 
		stack.add("/home"); 
		stack.add("/home/admin_routeSV05"); 
		stack.add("/home/admin_routeSV05/Games");   
		return stack;   
	}

	public static Stack<String> archivostexto(Stack<String> archivo) {
		archivo.add("/home/admin_routeSV05/SecretosNucleares.txt");
		return archivo;   
	}

	public static Stack<String> archivoscript(Stack<String> sh) {
		sh.add("autor.sh");
		sh.add("/home/admin_routeSV05/./autor.sh");
		sh.add("information.sh");
		sh.add("version.sh");
		sh.add("Juego1.sh");
		sh.add("Juego2.sh");
		sh.add("Juego3.sh");
		return sh;   
	}

	public static Stack<String> directorioprohibido(Stack<String> dir) {
		dir.add("/bin");
		dir.add("/etc");
		dir.add("/lost+found");
		dir.add("/root");
		dir.add("/snap");
		dir.add("/usr");
		dir.add("/boot");
		dir.add("/mnt");
		dir.add("/run");
		dir.add("/sys");
		dir.add("/var");
		dir.add("/lib");
		dir.add("/opt");
		dir.add("/srv");
		dir.add("/dev");
		dir.add("/lib64");
		dir.add("/proc");
		dir.add("/sbin");
		dir.add("/tmp");
		return dir;   
	}


	public static void imprimirSSH() throws InterruptedException {
		System.out.print("[nchernovyl@retrobyl:~] $ ssh ");
		Thread.sleep(1000);
		System.out.print("admin");
		Thread.sleep(1000);
		System.out.print("routeSV05@");
		Thread.sleep(1000);
		System.out.print("10.0");
		Thread.sleep(1000);
		System.out.println("3.170");
		System.out.println("admin_routeSV05@10.0.3.170's password:");
		Thread.sleep(3000);
		System.out.println("Access RetroByl LTS (GNU/LINUX 3.13.0.24-generic x86_64)");
		System.out.println("\n * Documentation : https://github.com/GabrielVoica/Java-Ruso/");
		System.out.println("Last Login : Fti Apr 25 10:44:14 2020");
		System.out.println("\nbash: man: modo de empleo: ejecutar comando man");
	}
	


	//Metodo que imprime el prompt de la terminal
	public static void imprimirTerminal(){
		System.out.print("[admin_routeSV05@server05:~] $ ");
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
			System.out.println(""+directorioActual+"");
			controladorTerminal();
		}

		else if(comando.charAt(0)=='c' && comando.charAt(1)=='d' && comando.length() > 3 ) {
			comandoChangeDirectory(comando.substring(3,comando.length()));
		}

		else if(comando.charAt(0)=='c' && comando.charAt(1)=='a' && comando.charAt(2)=='t' && comando.length() > 4) {
			comandoCAT(comando.substring(4,comando.length()));
		}
		else if(comando.equals("..")) {
			comandoChangeDirectoryBack(comando);
		}

		else if(comando.charAt(0)=='.' && comando.charAt(1)=='/') {
			comandoSH(comando.substring(2,comando.length()));
		}
		else if(comando.equals("man")) {
			comandoMAN(comando);
		}
		else if (comando.equals("clear")) {
			comandoClear(comando);
		}
		else if (comando.equals("irssi")) {
			try {
				comandoirssi(comando);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("bash: " + comando + ": orden no encontrada");
			controladorTerminal();
		}
	}




	//Comando ls
	public static void comandoList() {
		if(directorioActual.equals("/home/admin_routeSV05/Games" )) {
			System.out.println("\nJuego1.sh   Juego2.sh   Juego3.sh");
			System.out.println("Juego4.sh   Juego5.sh   Juego6.sh\n");
			controladorTerminal();
		}

		else if(directorioActual.equals("/home/admin_routeSV05")) {
			System.out.println("\nGames   information.sh   version.sh");
			System.out.println("autor.sh   exit   SecretosNucleares.txt\n");
			controladorTerminal();
		}

		else if(directorioActual.equals("/home")) {
			System.out.println("admin_routeSV05");
			controladorTerminal();
		}

		else if(directorioActual.equals("/")) {
			System.out.println("bin                 etc   lost+found    root            snap    usr");
			System.out.println("boot                home  mnt           run             sys     var");
			System.out.println("desktopfs-pkgs.txt  lib   opt           rootfs-pkgs.txt srv");
			System.out.println("dev                 lib64 proc          sbin            tmp		");
			controladorTerminal();
		}


		else {
			System.out.println("bash: No exite el fichero o el directorio");
			controladorTerminal();
		}
	}

	//Comando cd
	public static void comandoChangeDirectory(String directory) {

		if(directoriostack(stack).contains(directory)) {
			directorioActual = directory;


			while(directorioActual != directoriostack(stack).elementAt(num)) {
				num++;
				directorioActual = directoriostack(stack).elementAt(num);
			}
		}
		else if(directorioprohibido(dir).contains(directory)) {
			System.out.println("Bash: cd: " + directory + ": Permiso denegado");	
		}

		else {
			System.out.println("bash: cd: No existe el fichero o el directorio" );
		}



		controladorTerminal();

	}

	//comando cd atras
	public static void comandoChangeDirectoryBack(String directory) {

		if(directorioActual == directoriostack(stack).elementAt(num)) {
			num--;
			directorioActual = directoriostack(stack).elementAt(num);
		}		

		controladorTerminal();
	}

	//Comando MAN
	public static void comandoMAN(String comando) {
		System.out.println("MAN(1)                     User Commands                     MAN(1)");
		System.out.println("Name: Description:");
		System.out.println("ls - listar elementos del directorio actual");
		System.out.println("cd - acceder a un directorio, la ruta es absoluta");
		System.out.println("pwd - ver la ruta actual");
		System.out.println("man - abrir el archivo de ayuda");
		System.out.println("cat - leer un archivo");
		System.out.println("clear - limpiar terminal");
		System.out.println("irssi - conexión IRC");
		System.out.println("./ - sirve para ejecutar un script");
		System.out.println("\nName: Example:");
		System.out.println("cd /direcorio1/subdirectorio");
		System.out.println("cat /directorio1/subdirectorio/archivetexto.txt");
		System.out.println("./Script.sh");
		controladorTerminal();
	}


	public static void comandoSH(String comando) {

		if(archivoscript(scripts).contains(comando)) {
			shactual = comando;

			if(shactual.equals("autor.sh") && directorioActual == directoriostack(stack).elementAt(2)) {
				irssitexto(comando);
				autorsh(comando);
			}
			else if(shactual.equals("version.sh") && directorioActual == directoriostack(stack).elementAt(2)) {
				irssitexto(comando);

			}
			else if(shactual.equals("information.sh") && directorioActual == directoriostack(stack).elementAt(2)) {
				irssitexto(comando);

			}
			else {
				negacion(comando);
			}
		}

		controladorTerminal();

	}

	public static void autorsh(String comando) {

	}
	public static void versionsh(String comando) {

	}
	public static void informationsh(String comando) {

	}
	public static void juegos(String comando) {

	}
	public static void negacion(String comando) {
		System.out.println("bash: cat: No existe el fichero o el directorio o la ruta es incorrecta");

	}
	

	public static void irssitexto(String comando) {
		System.out.println("No tiene acceso al archivo. Haz un comando 'irssi' para pedir permisos al general Vladimir Pikalov");

	}
	

	public static void comandoirssi(String comando) throws InterruptedException {
		Thread.sleep(1000);
		System.out.println(" Irssi v1.2.0 - https://irssi.org");
		System.out.println("-!- Irssi: Looking up chat.10.03.170");
		System.out.println("-!- Irssi: conected to #principal");
		Thread.sleep(3000);
		System.out.println("20:50 -!- vlad1mirpikal0v: ¿Que desea?");
		Thread.sleep(3000);
		System.out.println("20:50 -!- admin_route_sv05: Hola, necesito acceso a varios scripts en el terminal 5 de Chernobyl");
		Thread.sleep(3000);
		System.out.println("20:50 -!- vlad1mirpikal0v: ¿Ahora?");
		Thread.sleep(3000);
		System.out.println("20:51 -!- admin_route_sv05: Si, es urgente");
		Thread.sleep(5000);
		System.out.println("20:59 -!- vlad1mirpikal0v: Ya tienes acceso, y ahora, dejame acabar este vodka tranquilo");
		System.out.println("20:59 -!- vlad1mirpikal0v has left the chat\r\n");
		controladorTerminal();

	}


	//Comando cat
	public static void comandoCAT(String comando) {

		if(archivostexto(archivo).contains(comando)) {
			catactual = comando;

			if(catactual.equals("/home/admin_routeSV05/SecretosNucleares.txt")) {
				System.out.println("Hola");
			}
		}
		else {
			System.out.println("bash: cat: No existe el fichero o el directorio");
		}


		controladorTerminal();
	}
	//Comando clear
	public static void comandoClear(String comando) {
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		controladorTerminal();
	}


	//Metodo MAIN
	public static void main(String[] args) throws InterruptedException {
		Terminal.imprimirSSH();
		Terminal.iniciarTerminal();

	}

}
