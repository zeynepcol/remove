import java.util.*;
public class remove_method {

	public static String remove(String word, Character ch) {
	    String removed_word = word.replaceAll(Character.toString(ch).toLowerCase(), "");
	    removed_word = removed_word.replaceAll(Character.toString(ch).toUpperCase(), "");
	    return removed_word; 
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a word");
	    String word=sc.next();
	    System.out.println("enter a character you want to remove");
	    Character ch =sc.next().charAt(0);
	    System.out.println(remove(word, ch));
	    	
	}
}
