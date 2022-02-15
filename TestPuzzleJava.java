import java.util.ArrayList;
public class TestPuzzleJava {    
	public static void main(String[] args) {
		/* 
		Agregando 1 línea a este archivo para crear una instancia de la clase PuzzleJava.
		*/
		PuzzleJava generator = new PuzzleJava();

		/* ============ Casos de prueba de la App ============= */

		System.out.println("\n----- Prueba getTenRolls -----");
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println("Arreglo generado: " + randomRolls);
		
    	System.out.println("\n----- Prueba getRandomLetter -----");
		// Empleamos String.valueOf() para pasar de char a String
		System.out.println("Letra aleatoria: " + String.valueOf(generator.getRandomLetter()));

		System.out.println("\n----- Prueba generatePassword -----");
		System.out.println("Password generado: " + generator.generatePassword());

		System.out.println("\n----- Prueba getNewPasswordSet -----");
		System.out.println("Arreglo generado: " + generator.getNewPasswordSet(4));
	}
}