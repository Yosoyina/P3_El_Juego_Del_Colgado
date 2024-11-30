package Ejercicios;

import java.util.Scanner;
import java.util.Random;
public class P3EjercicioDelColgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Random Jugadores = new Random ();
		
		int [] Arrayjugadores; // Creamos la array para los jugadores que se introduzcan los que juegan
		int Njugadores = 0; // Variable del Numero de Jugadores que van a jugar
		String ArrayAlJug;
		
		
		System.out.println(" ____________________________________________");
		System.out.println("|                                            |");
		System.out.println("|      Bienvenido al Juego del Colgado       |");
		System.out.println("|____________________________________________|");
		
		
		// APARTADO DE CUANTOS JUGADORES QUIEREN JUGAR
		
		System.out.println(" ______________________________________________");
		System.out.println("|                                              |");
		System.out.println("|   Introduce cuantos jugadores quieren jugar  |");
		System.out.println("|______________________________________________|");
		
		Njugadores = teclado.nextInt(); // introduccir cuantos jugadores van a jugar
		
		// Un bucle para que introduces del min 2 jugadores y el maximo 6 jugadores
		while (Njugadores < 2 || Njugadores > 6) {
			
			System.out.println(" _____________________________________________________________");
			System.out.println("|                                                             |");
			System.out.println("|           El Minimo de jugadores son: 2 Jugadores           |");
			System.out.println("|_____________________________________________________________|");
			System.out.println("|                                                             |");
			System.out.println("|           El Maximo de jugadores son: 6 Jugadores           |");
			System.out.println("|_____________________________________________________________|");
			
			Njugadores = teclado.nextInt(); //Volver a introduccir de nuevo los jugadores 
		}
		
		Arrayjugadores = new int [Njugadores]; // De la arrayjugadores se introduccen los jugadores cuantos van a jugar i se crean esas arrays
		
		// APARTADO DONDE SE ESCRIBEN LOS NOMBRES DE LOS JUGADOR INDICADOS ANTERIORMENTE
		
		String [] NomJugadores; // Una array de jugadores pero para las letras
		NomJugadores = new String [Njugadores]; // Coje el numero de jugadores y de tantos jugadores se pone el nombre de cada jugador
		
		for (int j = 0; j < NomJugadores.length; j++) {
			
			System.out.println(" ______________________________________________");
			System.out.println("|                                              |");
			System.out.println("|     Introduce el nombre de cada Jugador:     |");
			System.out.println("|______________________________________________|");
			
			NomJugadores[j] = teclado.next(); // se introducce el nombre de los jugadores indicados
			
		}
	
		int [] rondasG = new int [Njugadores]; // Contador de cada jugador de rondas que ha ganado
		
		// APARTADO DE LAS RONDAS E INICIALIZACION DE LOS JUEGOS
		
		System.out.println(" ______________________________________________");
		System.out.println("|                                              |");
		System.out.println("|         Cuantas rondas quieres jugar:        |");
		System.out.println("|______________________________________________|");
		
		int rondas = teclado.nextInt(); // se introducen cuantas rondas se quieren jugar
		
		// Es el bucle de las rondas
		for (int i = 0; i < rondas; i++) {
			
			// APARTADO DE LAS VIDAS DE LOS JUGADORES POR RONDAS
			
			int [] vidasJ ; // creamos la arraid de las vidas de los jugadores
			vidasJ = new int [Njugadores]; // las vidas de tantos jugadores de los que van a jugar
			
			for (int j = 0; j < vidasJ.length; j++) {
				
				vidasJ[j] = vidasJ[j] + 6; // las vidas se guardan en dentro de la arraid que son 6
				
			}
			
			// APARTADO DONDE SE ECOGE UN JUGADOR ALEATORIAMENTE PARA QUE ESCRIBA LA PALABRA SECRETA
			
			ArrayAlJug = NomJugadores[Jugadores.nextInt(NomJugadores.length)];
				
			// En esta parte nos printe al jugador que le toca escribir la palabra secreta
				
			System.out.println(" _______________________________________________________________________________");
			System.out.println("                                                                                ");
			System.out.println("           Jugardor  " + ArrayAlJug + "  Escoge la Palabra Secreta              ");
			System.out.println(" _______________________________________________________________________________");
				
		
			
			System.out.println(" ____________________________________________");
			System.out.println("|                                            |");
			System.out.println("|          Introduce la Pala Secreta         |");
			System.out.println("|____________________________________________|");
			
			String PalabraS = teclado.next() ; // Introduccimos la palabra Serceta
			PalabraS = PalabraS.toLowerCase(); // Aqui la palabra secreta si se escribe la palabra en mayusculas las pasara en minusculas
			
			// Esta parte es una Array de caracteres para cuando se escriba la palabra secreta sera la longitud de la palabra escribida por el jugador
			
			char [] Poculta = new char [PalabraS.length()];
			
			// Un bucle for para recorrer la Palabra Secreta donde la palabra oculta ser represtara como _,
			
			for (int j = 0; j < PalabraS.length(); j++) {
				
				Poculta[j] = '_'; 
				
			}
			
			// Nos devuelve la palabra secreta en caracteres y dentro del recuadro convierte la palabra Oculta en un string 
			
			System.out.println(" __________________________________________________________________");
			System.out.println("                                                              ");
			System.out.println("           La palabra oculta es:   " + String.valueOf(Poculta) +"                ");
			System.out.println(" __________________________________________________________________");
		
			
			boolean ApparenciaP = false; // Esta varible es falsa para inicializar el bucle
			
			while(!ApparenciaP){ // Inicializamos el bucle while hasta que los jugadores descurbran la palabra secreta
				for (int j = 0; j < Njugadores; j++) { 
					/*Este bucle for lo que hace es recorrer a todos los jugadores que juegan  dentro de la partida 
					 * que ademas son los jugadores que preguntamos anteriormente los que van a jugar
					 */
					if(vidasJ[j] > 0) { // La condicion de los jugadores que si tienen vidas seguiran jugando en cambio si no tienen se finalizaria el juego
						
						/*En este apartado esta por secciones
						 * 
						 * La primera seccion nos mostrara un jugador aleatoriamente que tendra que escoger la palabra secreta
						 * 
						 * La segunda seccion se mostrara la palabra oculta
						 * 
						 * La tercera seccion nos mostrara las vidas de los jugadores 
						 * 
						 * La ultima seccion tendremos que introduccir una letra de la palabra secretra
						 */
						
						System.out.println("_____________________________________________________________");
						System.out.println("                                                             ");
						System.out.println("        Jugador que escribe la letra: " + NomJugadores[j] + "");
						System.out.println("_____________________________________________________________");
						System.out.println("                                                             ");
						System.out.println("        La Palabra Oculta es: "  + String.valueOf(Poculta) +"");
						System.out.println("_____________________________________________________________");
						System.out.println("                                                             ");
						System.out.println("        Vidas Restantes del Jugador: " + vidasJ[j] + "       ");
						System.out.println("_____________________________________________________________");
						System.out.println("                                                             ");
						System.out.println("           Ingresa una letra de la Palabra Secreta           ");
						System.out.println("_____________________________________________________________");
						
						char Letra = teclado.next().charAt(0); // Para que el usuario introduca letra que eeqivale a un caracter
						Letra = Character.toLowerCase(Letra); // Por si el Usuario Escribe una letra mayuscula para que esa letra mayuscula pase a minuscula
						
						boolean letraVerd = false; // Esta variabele es falsa
	                     
						// Este for es para verificar si la letra que intoduce el usuario esta dentro de la palabra secreta
						for (int k = 0; k < PalabraS.length(); k++) {
							if(PalabraS.charAt(k) == Letra && Poculta[k] == '_' ) {
								/*
								 * En esta condicion que vemos que comprueba la posicion de la letra k y qye a la vez
								 * esta letra coincida con la letra que ha introduccido el jugador 
								 * 
								 * y ademas de que la otra condicion lo que haze es que si esa letra no ha sido adivinada entonces que no la muestre
								 */
								
								Poculta[k] = Letra; // En esta parte si la letra es correcta entonces se le mostrara al jugador siguiente
								letraVerd = true;  // Entonces la letra que es correcta pasara a ser verdadera
							}
						}
						
						if (letraVerd) { // Si la letra que ha introduccido el jugador es verdadera salatara este mensaje de que es correcta
							System.out.println(" _________________________________");
							System.out.println("|                                 |");
                            System.out.println("|       La Letra es Correcta      |");
                            System.out.println("|_________________________________|");
                            
                        } else { // En canvio si es falso esa palabra le dira este mensaje ademas de que le restara una vida
                        	
                        	System.out.println(" _________________________________");
							System.out.println("|                                 |");
                            System.out.println("|      La Letra es Incorrecta     |");
                            System.out.println("|_________________________________|");
                        	
                            vidasJ[j]--; // Si la letra no es correcta se le restara una vida del jugador
                        }
						
					}
				}
				
				
						
			}	
		} // acaba el bucle for de las rondas
		

		
	}

}
