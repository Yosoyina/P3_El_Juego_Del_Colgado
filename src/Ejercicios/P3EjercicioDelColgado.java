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
	
		// APARTADO DE LAS VIDAS DE LOS JUGADORES
		
		int [] vidasJ ; // creamos la arraid de las vidas de los jugadores
		vidasJ = new int [Njugadores]; // las vidas de tantos jugadores de los que van a jugar
		
		for (int j = 0; j < vidasJ.length; j++) {
			
			vidasJ[j] = vidasJ[j] + 6; // las vidas se guardan en dentro de la arraid que son 6
			
		}
		
		// APARTADO DE LAS RONDAS E INICIALIZACION DE LOS JUEGOS
		
		System.out.println(" ______________________________________________");
		System.out.println("|                                              |");
		System.out.println("|         Cuantas rondas quieres jugar:        |");
		System.out.println("|______________________________________________|");
		
		int rondas = teclado.nextInt(); // se introducen cuantas rondas se quieren jugar
		
		// Es el bucle de las rondas
		for (int i = 0; i < rondas; i++) {
			
			// APARTADO DONDE SE ECOGE UN JUGADOR ALEATORIAMENTE PARA QUE ESCRIBA LA PALABRA SECRETA
			
			ArrayAlJug = NomJugadores[Jugadores.nextInt(NomJugadores.length)];
				
			// En esta parte nos printe al jugador que le toca escribir la palabra secreta
				
			System.out.println(" _______________________________________________________________________");
			System.out.println("|                                                                       |");
			System.out.println("|          Jugardor  " + ArrayAlJug + "  Escoge la Palabra Secreta                     |");
			System.out.println("|_______________________________________________________________________|");
				
		
			
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
			
			System.out.println(" ______________________________________________________________");
			System.out.println("|                                                              |");
			System.out.println("|          La palabra oculta es " + String.valueOf(Poculta) +"                               |");
			System.out.println("|______________________________________________________________|");
		
			
		} // acaba el bucle for de las rondas
	}

}
