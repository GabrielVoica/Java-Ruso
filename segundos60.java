package primerproyectos;

import java.util.*;

public class segundos60 {
	private static Scanner reader = new Scanner(System.in);
	static Stack<String> nombre = new Stack<String>();
	static Stack<String> apellido = new Stack<String>();

	private static int modo = 0;
	private static String tutorial = "";
	private static String start = "";
	private static String jug1nom = "";
	private static String jug1app = "";
	private static String jug2nom = "";
	private static String jug2app = "";
	private static int puntosj1 = 7;
	private static int puntosj2 = 7;
	private static int eleccionj1 = 0;
	private static int eleccionj2 = 0;

	private static int randnom = 0;
	private static int randapp = 0;

	private static int dias = 0;

	private static int vidaj1 = 100;
	private static int comidaj1 = 100;
	private static int aguaj1 = 100;
	private static int radiacionj1 = 100;
	private static int Eaguaj1 = 0;
	private static int Ecomidaj1 = 0;
	private static int Epistolaj1 = 0;
	private static int Etrajej1 = 0;


	private static int vidaj2 = 100;
	private static int comidaj2 = 100;
	private static int aguaj2 = 100;
	private static int radiacionj2 = 100;
	private static int Eaguaj2 = 0;
	private static int Ecomidaj2 = 0;
	private static int Epistolaj2 = 0;
	private static int Etrajej2 = 0;

	
	public static Stack<String> nombre(Stack<String> nombre) {
		nombre.add("Alexei");
		nombre.add("Validimir");
		nombre.add("Sergei");
		nombre.add("Dmitry");
		nombre.add("Edik");
		nombre.add("Egor");
		nombre.add("Gavrilobich");
		nombre.add("Konstantine");
		nombre.add("Ioakim");
		return nombre;
	}

	public static Stack<String> apellido(Stack<String> apellido){

		apellido.add("Melnik");
		apellido.add("Shevchenko");
		apellido.add("Bondarneko");
		apellido.add("Boyko");
		apellido.add("Olynk");
		apellido.add("Lsenko");
		apellido.add("Moroz");
		apellido.add("Koval");
		apellido.add("Tkachuk");
		return apellido;
	}


	public static Stack<String> eventos(Stack<String> eventos){
		eventos.add("Un par de ladrones te han robado - Pierdes 2 de comida y 1 de agua");
		eventos.add("Alguien llama a la puerta, es un mendigo --> Pierdes 1 de comida");
		eventos.add("El ejercito necesita equipamiento --> Pierdes una pistola ");
		eventos.add("El ejercito necesita equipamiento --> Pierdes una pistola ");
		eventos.add("Una rata entra en tu bunker y te infecta --> Pierdes 50 de vida ");
		eventos.add("Entra un fantasma y bebe de tu agua para sobrevivir otros mil años --> Pierdes 1 de agua ");
		eventos.add("Chuck Norris quiere que le des 1 de comida --> Pierdes 1 de comida ");
		eventos.add("Tu exmujer te pide el traje para su boda nuclear --> Pierdes 1 de traje antiradiacción");
		eventos.add("Te estas volviendo loco y tiras agua y comida por todas partes --> Pierdes 1 de comida y 1 de agua");
		eventos.add("Un perro esta arañando la puerta en busca de comida y tu lo tienes que matar --> Pierdes 1 pistola");
		eventos.add("Un tio religioso viene y te da comida en nombre de su religion --> Ganas 2 de comida");
		eventos.add("Un tio religioso viene y te da agua en nombre de su religion --> Ganas 2 de agua");
		eventos.add("Un papa noel vagabundo te da una pistola a cambio de 1 de comida --> Ganas 1 pistola y pierdes 1 de comida");
		eventos.add("Cae un drop justo en tu puerta con un traje --> Ganas 1 trade antiradiacción");
		eventos.add("Unos ladrones quieren robarte pero te ven con esa cara y te regalan 1 de comida --> Ganas 1 de comida");
		eventos.add("Unos ladrones quieren robarte pero te ven con esa cara y te regalan 1 de agua --> Ganas 1 de agua");
		eventos.add("Aparece magicamente 1 de comida --> Ganas 1 de comida");
		eventos.add("Aparece magicamente 1 de agua --> Ganas 1 de agua");
		eventos.add("Una ONG te da un traje gratis --> Ganas 1 traje antiradiacción");
		eventos.add("Cj activa el truco de armas y te da una pistola --> Ganas 1 pistola");

		return eventos;
	}

	public static Stack<String> eventossalir(Stack<String> eventossal){
		eventossal.add("Encuenstras una caja llena de comida --> Ganas 3 de comida");
		eventossal.add("Encuentras una caja llena de agua --> Ganas 3 de agua");
		eventossal.add("Te enfrentas brutalmente contra una abuela por comida y te gana--> Ganas 3 de agua");
		eventossal.add("Vas a una fabrica y obtienes muchos alimentos--> Ganas 2 de agua y 2 de comida");
		eventossal.add("--> Entrás a una casa y robas a unos ancianos 2 de comida --> Ganas 2 de comida");
		eventossal.add("--> Eres secuestrado por unos canibales que te intentan comer, pero al final escapas con heridas --> Pierdes 30 de vida");
		eventossal.add("--> Te clavas una astilla --> Pierdes 5 de vida");
		eventossal.add("--> Tiran una granada y la metralla te alcanza --> Pierdes 50 de vida");
		eventossal.add("--> Te peleas con Rick Sanchéz por un trozo de pan y pierdes --> Pierdes 25 de vida");
		eventossal.add("--> Un niño llamado Morty te dispara con la nave de su abuelo --> Pierdes 40 de vida");

		return eventossal;
	}



	public static void intrologo() throws InterruptedException {
		Thread.sleep(1000);
		System.out.print(" $$$$$$\\   $$$$$$\\   $$$$$$\\                                                $$\\                     \r\n"
				+ "$$  __$$\\ $$$ __$$\\ $$  __$$\\                                               $$ |                    \r\n"
				+ "$$ /  \\__|$$$$\\ $$ |$$ /  \\__| $$$$$$\\   $$$$$$\\  $$\\   $$\\ $$$$$$$\\   $$$$$$$ | $$$$$$\\   $$$$$$$\\ \r\n"
				+ "$$$$$$$\\  $$\\$$\\$$ |\\$$$$$$\\  $$  __$$\\ $$  __$$\\ $$ |  $$ |$$  __$$\\ $$  __$$ |$$  __$$\\ $$  _____|\r\n"
				+ "$$  __$$\\ $$ \\$$$$ | \\____$$\\ $$$$$$$$ |$$ /  $$ |$$ |  $$ |$$ |  $$ |$$ /  $$ |$$ /  $$ |\\$$$$$$\\  \r\n"
				+ "$$ /  $$ |$$ |\\$$$ |$$\\   $$ |$$   ____|$$ |  $$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |$$ |  $$ | \\____$$\\ \r\n"
				+ " $$$$$$  |\\$$$$$$  /\\$$$$$$  |\\$$$$$$$\\ \\$$$$$$$ |\\$$$$$$  |$$ |  $$ |\\$$$$$$$ |\\$$$$$$  |$$$$$$$  |\r\n"
				+ " \\______/  \\______/  \\______/  \\_______| \\____$$ | \\______/ \\__|  \\__| \\_______| \\______/ \\_______/ \r\n"
				+ "                                        $$\\   $$ |                                                  \r\n"
				+ "                                        \\$$$$$$  |                                                  \r\n"
				+ "                                         \\______/");

		Thread.sleep(1000);
		System.out.println("\n____________________________________________________________________________________________________");

		Thread.sleep(1000);
	}


	public static void introletra() throws InterruptedException {
		System.out.println("\n-!-:  Presiona cualquier letra para comenzar -!-");
		System.out.print("-!-: ");
		start = reader.nextLine();


	}

	public static void modo() throws InterruptedException {

		while(start.matches(".*[^a-z].*") && start.matches(".*[^A-Z].*") ){
			System.out.println("-!-: No has seleccionado ninguna letra");
			introletra();
		}

		System.out.print("\n");
		System.out.println("-!-: Elige modo");
		System.out.println("-!-: 1- Jugador1 vs Jugador2");
		System.out.println("-!-: 2- Jugador1 vs JugadorIA");
		System.out.println("-!-: 3- Exit");
		System.out.print("-!-: ");
		modo = reader.nextInt();

		modonum();

	}

	public static void modonum () throws InterruptedException {
		while(modo > 3 || modo < 1 ) {
			System.out.println("-!-: Modo no existente");
			System.out.print("-!-: ");
			modo = reader.nextInt();

		}

		reader.nextLine();

		if(modo == 1) {
			jugador1();
			jugador2();

		}
		else if (modo == 2) {
			jugador1();
			jugadoria();
		}
		else if (modo == 3) {
			System.out.println("-!-: Saliendo del juego");
			Terminal.iniciarTerminal();
		}
	}



	public static void jugador1() {
		System.out.println("\n-!-: Jugador 1 personalización");

		System.out.println("-!-: ¿Hola, cual es tu nombre?");
		System.out.print("-!-: ");
		jug1nom = reader.nextLine();

		System.out.println("-!-: ¿Y cual tu apellido?");
		System.out.print("-!-: ");
		jug1app = reader.nextLine();
	}

	public static void jugador2 () {
		System.out.println("\n-!-: Jugador 2 personalización");
		System.out.println("-!-: ¿Hola, cual es tu nombre?");
		System.out.print("-!-: ");
		jug2nom = reader.nextLine();


		System.out.println("-!-: ¿Y cual tu apellido?");
		System.out.print("-!-: ");
		jug2app = reader.nextLine();

	}

	public static void jugadoria() {
		randnom = (int)(Math.random() * 9) + 0;
		randapp = (int)(Math.random() * 9) + 0;

		jug2nom = nombre(nombre).elementAt(randnom);
		jug2app = apellido(apellido).elementAt(randapp);



	}


	public static void infojug() throws InterruptedException {
		System.out.print("\n-!-: Jugador 1 : ");
		System.out.print(jug1nom + " " + jug1app);
		System.out.println("");
		System.out.print("-!-: Jugador 2 : ");
		System.out.print(jug2nom + " " + jug2app);
		System.out.println("\n");
		infojughist();
	}


	public static void infojughist() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("\"-!-:*Alguien llama a la puerta*");
		System.out.println("\"-!-:*Toc toc*");
		System.out.println("-!-: " + jug1nom + jug1app + ": !Soy yo, rápido, Chernobyl esta apunto de explotar!");
		System.out.println("-!-: " + jug2nom + jug2app + ": !Espera!, ahora voy");
		System.out.println("-!-: " + jug1nom + jug1app + ": !Rápido joder, ya estoy escuchando a los bomberos!");
		System.out.println("-!-: " + jug2nom + jug2app + ": !Lo siento, te quedas afuera!");
		System.out.println("-!-: " + jug1nom + jug1app + ": !Hijo de mil padres, oh no, debo ir a mi casa!");
		System.out.println("-!-: " + jug1nom + jug1app + ": *Corre rapidamente hacia su casa*");
		System.out.println("-!-: " + jug1nom + jug1app + ": *Abré, la puerta*");

	}



	public static void decisiontutorial() throws InterruptedException {

		System.out.println("\n-!-: Tutorial disponbile ¿Quieres leerlo?  si/no");
		System.out.print("-!-: ");
		tutorial = reader.nextLine();

		if(tutorial.equals("si")){
			tutorial();
			distribucionj1();

		}
		else if (tutorial.equals("no")) {
			distribucionj1();
		}

		else {
			System.out.print("-!-: Opcion incorrecta");
			decisiontutorial();
		}

	}

	public static void tutorial() {
		System.out.println("\n-!-: Tienes que sobrevivir 30 días");
		System.out.println("\n-!-: Tienes 7 puntos para gastar en materiales");
		System.out.println("-!-: Agua --> 1 punto");
		System.out.println("-!-: Comida --> 1 punto");
		System.out.println("-!-: Botiquin --> 2 puntos");
		System.out.println("-!-: Pistola --> 3 puntos");
		System.out.println("-!-: Traje antiradiación --> 5 puntos");
		System.out.println("-!-: Pistola --> 3 puntos");
		System.out.println("\n-!-: Vida --> 100");
		System.out.println("-!-: Comina --> 100");
		System.out.println("-!-: Agua --> 100");
		System.out.println("-!-: Radiación --> 100");
		System.out.println("\n-!-: 1 agua --> 100 de agua");
		System.out.println("-!-: 1 comida --> 100 de comida");
		System.out.println("-!-: 1 botiquin --> 100 de salud");
		System.out.println("-!-: 1 radiación --> no radiación");
		System.out.println("\n-!-: Si comida menor de 25 - baja 25 vida cada día");
		System.out.println("-!-: Si agua menor de 25 - baja 25 vida cada día");
		System.out.println("-!-: Si radiación menor de 25 - baja 25 vida cada día");
		System.out.println("\n-!-: Opcion 1 --> consumir alimentos disponibles");
		System.out.println("-!-: Opcion 2 --> salir afuera para buscar material con posibilidad de daño");
		System.out.println("-!-: Opcion 2.1 --> si tienes pistola, traje o pistola+traje, probabilidad menor de daño");
		System.out.println("-!-: Opcion 3 --> fin del dia");
		System.out.println("\n-!-: Pueden ocurrir eventos todos los días");
		System.out.println("\n-!-: Un jugador gana si sobrevive los 30 días y pierde cuando muere ( 0 vida)");

	}

	public static void tablaprecio() {
		System.out.println("-!-: 1- 1 de Agua --> 1 punto/s");
		System.out.println("-!-: 2- 1 de Comida --> 1 punto/s");
		System.out.println("-!-: 3- 1 Pistola --> 3 punto/s");
		System.out.println("-!-: 4- 1 Traje antiradiacción --> 5 punto/s");
	}

	public static void distribucionj1() throws InterruptedException{

		if(puntosj1 == 0) {
			System.out.print("\n-!-: Fin de la elección\n" );
			distribucionj2();
		}

		System.out.println("\n-!-: Jugador1 --> ");
		System.out.println("\n-!-: Tienes " + puntosj1 + " puntos para consumir");
		tablaprecio();
		System.out.print("-!-: ");
		eleccionj1 = reader.nextInt();

		while(eleccionj1 > 4 || eleccionj1 < 1) {
			System.out.println("-!-: Elemento no disponible");
			System.out.print("-!-: ");
			eleccionj1 = reader.nextInt();
		}

		while(eleccionj1 > puntosj1) {
			System.out.println("-!-: No tienes suficientes puntos para adquirir este elemento");
			System.out.print("-!-: ");
			eleccionj1 = reader.nextInt();
		}



		distribucionj1accion(); 
	}


	public static void distribucionj1accion() throws InterruptedException {

		if(eleccionj1 == 1) {
			System.out.print("-!-: Adquirido 1 de agua\n");
			Eaguaj1++;
			puntosj1 -= 1;
		}
		else if (eleccionj1 == 2) {
			System.out.print("-!-: Adquirido 1 de comida\n");
			Ecomidaj1++;
			puntosj1 -= 1;
		}
		else if (eleccionj1 == 3) {
			System.out.print("-!-: Adquirido 1 pistola\n");
			Epistolaj1++;
			puntosj1 -= 3;
		}
		else if (eleccionj1 == 4) {
			System.out.print("-!-: Adquirido 1 traje antiradiacción\n");
			Etrajej1++;
			puntosj1 -= 5;
		}
		distribucionj1();
	}



	public static void distribucionj2() throws InterruptedException{
		if(puntosj2 == 0) {

			System.out.print("-!-: Fin de la elección\n");
			eleccionj1();
			iniciojuegoestado();
			iniciojuegoelementos();
		}


		System.out.println("\n-!-: Jugador2 --> ");
		System.out.println("\n-!-: Tienes " + puntosj2 + " puntos para consumir");
		tablaprecio();
		System.out.print("-!-: ");
		eleccionj2 = reader.nextInt();

		while(eleccionj2 > 4 || eleccionj2 < 1) {
			System.out.println("-!-: Elemento no disponible");
			System.out.print("-!-: ");
			eleccionj2 = reader.nextInt();
		}

		while(eleccionj2 > puntosj2) {
			System.out.println("-!-: No tienes suficientes puntos para adquirir este elemento");
			System.out.print("-!-: ");
			eleccionj2 = reader.nextInt();
		}


		distribucionj2accion();

	}



	public static void distribucionj2accion() throws InterruptedException {

		if(eleccionj2 == 1) {
			System.out.print("-!-: Adquirido 1 de agua\n");
			Eaguaj2++;
			puntosj2 -= 1;
		}
		else if (eleccionj2 == 2) {
			System.out.print("-!-: Adquirido 1 de comida\n");
			Ecomidaj2++;
			puntosj2 -= 1;
		}
		else if (eleccionj2 == 3) {
			System.out.print("-!-: Adquirido 1 pistola\n");
			Epistolaj2++;
			puntosj2 -= 3;
		}
		else if (eleccionj2 == 4) {
			System.out.print("-!-: Adquirido 1 traje antiradiacción\n");
			Etrajej2++;
			puntosj2 -= 5;
		}
		distribucionj1();
	}


	public static void iniciojuegoelementos() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("\n-!-: Jugador1 --> ");
		System.out.println("-!-: Agua --> " + Eaguaj1);
		System.out.println("-!-: Comida --> " + Ecomidaj1);
		System.out.println("-!-: Pistola --> " + Epistolaj1);
		System.out.println("-!-: Traje --> " + Etrajej1);
		System.out.println("\n-!-: Jugador2 --> ");
		System.out.println("-!-: Agua --> " + Eaguaj2);
		System.out.println("-!-: Comida --> " + Ecomidaj2);
		System.out.println("-!-: Pistola --> " + Epistolaj2);
		System.out.println("-!-: Traje --> " + Etrajej2);
	}
	
	public static void iniciojuegoestado() {
		System.out.println("\n-!-: Jugador1 --> ");
		System.out.println("-!-: Estado Vida --> " + vidaj1);
		System.out.println("-!-: Estado Agua --> " + aguaj1);
		System.out.println("-!-: Estado Comida --> " + comidaj1);
		System.out.println("-!-: Estado Radiacción --> " + radiacionj1);

		System.out.println("\n-!-: Jugador2 --> ");
		System.out.println("-!-: Estado Vida --> " + vidaj2);
		System.out.println("-!-: Estado Agua --> " + aguaj2);
		System.out.println("-!-: Estado Comida --> " + comidaj2);
		System.out.println("-!-: Estado Radiacción --> " + radiacionj2);

		
	}

	public static void eleccionj1() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("\n-!-: Jugador1 --> ");
		System.out.println("\n-!-: 1- Consumir alimentos");
		System.out.println("-!-: 2- Salir afuera");
		System.out.println("-!-: 3- Fin del día");
		System.out.print("-!-: ");
		eleccionj1 = reader.nextInt();
		eleccionj1if();		
	}

	public static void eleccionj1if() throws InterruptedException{
		if(eleccionj1 == 1) {
			eleccionj1if1();

		}
		else if(eleccionj1 == 2) {
			System.out.print("Saliendo afuera");
		}
		else if(eleccionj1 == 3) {
			dias++;
		}
	}

	public static void eleccionj1if1() throws InterruptedException{
		System.out.println("\n-!-: Alimentos disponibles --> ");
		System.out.println("-!-: Agua --> " + Eaguaj1);
		System.out.println("-!-: Comida --> " + Ecomidaj1);
		System.out.println("\n-!-:¿Qué alimento quieres consumir?");
		System.out.println("-!-: 1- 1 de Agua");
		System.out.println("-!-: 2- 1 de Comida");
		System.out.println("-!-: 3- Salir");
		eleccionj1 = reader.nextInt();
		eleccionj1if1final();
	}

	public static void eleccionj1if1final() throws InterruptedException{
		if(eleccionj1 == 1) {
			System.out.print("-!-: Consumido 1 agua\n");
			Eaguaj1--;
		}
		else if(eleccionj1 == 2) {
			System.out.print("-!-: Consumido 1 comida\n");
			Ecomidaj1--;
		}
		else if(eleccionj1 == 3) {
			eleccionj1();
		}

		eleccionj1if1();
	}


	public static void main(String[] args) throws InterruptedException {
		segundos60.intrologo();
		segundos60.introletra();
		segundos60.modo();
		segundos60.infojug();
		segundos60.decisiontutorial();

		do
		{

		}while(vidaj1 > 0 || vidaj2 > 0 || dias != 30);


	}

}
