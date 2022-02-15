import java.util.ArrayList;
import java.util.Random;

/**
 * PuzzleJava
 */
public class PuzzleJava {

    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> numArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numArrayList.add(getRandomNumber(1, 20));
        }
        return numArrayList;
    }

    public char getRandomLetter() {
        // Empleamos String.toCharArray para generar un arreglo de chars a partir del string dado
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int index = getRandomNumber(0, 25);        
        return alphabet[index];
    }

    public String generatePassword() {
        // No se debe inicializar a null el string, pues a la hora de concatenar estará presente
        String passwordGenerated = "";
        for (int i = 0; i < 8; i++) {
            passwordGenerated += String.valueOf(getRandomLetter());
        }
        return passwordGenerated;
    }

    public ArrayList<String> getNewPasswordSet(int longitud) {
        ArrayList<String> strArrayList = new ArrayList<String>();
        for (int i = 0; i < longitud; i++) {
            strArrayList.add(generatePassword());
        }
        return strArrayList;
    }
}