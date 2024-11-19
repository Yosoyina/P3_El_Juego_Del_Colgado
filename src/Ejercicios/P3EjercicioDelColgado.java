package Ejercicios;

import java.util.Scanner;
public class P3EjercicioDelColgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int i = 0;
		int [] Arrayjugadores; // Creamos la array para los jugadores que se introduzcan los que juegan
		int Njugadores = 0; // Variable del Numero de Jugadores que van a jugar
		
		
		System.out.println(" ____________________________________________");
		System.out.println("|                                            |");
		System.out.println("|      Bienvenido al Juego del Colgado       |");
		System.out.println("|____________________________________________|");
	
		String PalabraSecreta = "";
		
		System.out.println(" ______________________________________________");
		System.out.println("|                                              |");
		System.out.println("|         Cuantas rondas quieres jugar:        |");
		System.out.println("|______________________________________________|");
		
		int rondas = teclado.nextInt();
		
		
		for ( i = 0; i < rondas; i++) {
			
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
			
			String [] NomJugadores; // Una array de jugadores pero para las letras
			NomJugadores = new String [Njugadores]; // Coje el numero de jugadores y de tantos jugadores se pone el nombre de cada jugador
			
			for ( i = 0; i < NomJugadores.length; i++) {
				
				System.out.println(" ______________________________________________");
				System.out.println("|                                              |");
				System.out.println("|     Introduce el nombre de cada Jugador:     |");
				System.out.println("|______________________________________________|");
				
				NomJugadores[i] = teclado.next(); // se introducce el nombre de los jugadores indicados
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
