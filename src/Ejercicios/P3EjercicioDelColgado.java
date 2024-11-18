package Ejercicios;

import java.util.Scanner;
public class P3EjercicioDelColgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int [] Arrayjugadores; // Creamos la array para los jugadores que se introduzcan los que juegan
		int jugadores = 0 ;
		
		
		System.out.println(" ____________________________________________");
		System.out.println("|                                            |");
		System.out.println("|      Bienvenido al Juego del Colgado       |");
		System.out.println("|____________________________________________|");
	
		
		
		System.out.println(" ______________________________________________");
		System.out.println("|                                              |");
		System.out.println("|   Introduce cuantos jugadores quieren jugar  |");
		System.out.println("|______________________________________________|");
		
		int Njugadores = teclado.nextInt();
		
		while (Njugadores < 2 || Njugadores > 6) {
			
			System.out.println(" _____________________________________________________________");
			System.out.println("|                                                             |");
			System.out.println("|           El Minimo de jugadores son: 2 Jugadores           |");
			System.out.println("|                                                             |");
			System.out.println("|           El Maximo de jugadores son: 6 Jugadores           |");
			System.out.println("|_____________________________________________________________|");
			
		}
		
		Arrayjugadores = new int [Njugadores];
		
		
		
	}

}
