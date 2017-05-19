import java.util.Scanner;
/*Programmer Miki*/
public class Decifrario {

	String frase_chiara = "";
	String frase_criptata;
	
	public static void main(String[] args) {

		String frase_chiara ="";
        String frase_criptata = "";
        Scanner in = new Scanner(System.in); 
        System.out.print("Inserisci la parola da decriptare: ");
        frase_chiara=in.nextLine();
                
        int conta=frase_chiara.length(); 
        for(int i=0; i<conta; i++)
        {
            switch(frase_chiara.substring(i,i+1)) 
            {
                case "b": frase_criptata=frase_criptata+ "a"; break;
                case "c": frase_criptata=frase_criptata+ "b"; break;
                case "d": frase_criptata=frase_criptata+ "c"; break;
                case "e": frase_criptata=frase_criptata+ "d"; break;
                case "f": frase_criptata=frase_criptata+ "e"; break;
                case "g": frase_criptata=frase_criptata+ "f"; break;
                case "h": frase_criptata=frase_criptata+ "g"; break;
                case "i": frase_criptata=frase_criptata+ "h"; break;
                case "j": frase_criptata=frase_criptata+ "i"; break;
                case "k": frase_criptata=frase_criptata+ "j"; break;
                case "l": frase_criptata=frase_criptata+ "k"; break;
                case "m": frase_criptata=frase_criptata+ "l"; break;
                case "n": frase_criptata=frase_criptata+ "m"; break;
                case "o": frase_criptata=frase_criptata+ "n"; break;
                case "p": frase_criptata=frase_criptata+ "o"; break;
                case "q": frase_criptata=frase_criptata+ "p"; break;
                case "r": frase_criptata=frase_criptata+ "q"; break;
                case "s": frase_criptata=frase_criptata+ "r"; break;
                case "t": frase_criptata=frase_criptata+ "s"; break;
                case "u": frase_criptata=frase_criptata+ "t"; break;
                case "v": frase_criptata=frase_criptata+ "u"; break;
                case "w": frase_criptata=frase_criptata+ "v"; break;
                case "x": frase_criptata=frase_criptata+ "w"; break;
                case "y": frase_criptata=frase_criptata+ "x"; break;
                case "z": frase_criptata=frase_criptata+ "y"; break;
                case "a": frase_criptata=frase_criptata+ "z"; break;
                case "$": frase_criptata=frase_criptata+ " ";break;
                case "~": frase_criptata=frase_criptata+ "!";break;
                case ".": frase_criptata=frase_criptata+ ".";break;
                case "": System.out.println("Carattere non trovato!");break;

            }
        }            System.out.println("La frase " + frase_chiara + " decriptata in cifrario di Cesare diventa " + '\n'
            + frase_criptata); 
    }
}
