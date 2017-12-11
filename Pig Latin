public class PigLatin {

	public static void main(String[] args) {
		System.out.println("Enter the word you want translated: ");
		String piglatin = IO.readString();
		String piglatin1 = translate(piglatin);
		System.out.println("The pig latin version of your word is: " + piglatin1);
	}

	public static String translate(String original){
		String original1 = original.toUpperCase();
		char first = original1.charAt(0);
		if (first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U'){
			original1 = original1 + "WAY";
		}
		else{
			char consonant = original1.charAt(0);
			original1 = original1.substring(1);
			original1 = original1 + consonant + "AY";
		}
		return original1;
	}
}
