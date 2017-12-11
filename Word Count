public class WordCount {

	public static void main(String[] args) {
		System.out.println(countWords("    Hello this is a*^#@&;;we     sentence that has four words of length 5 or more", 5));
	}
	
	public static int countWords(String original, int minLength){
		int wordCounter = 0;
		original.trim();
		if(!original.contains(" ")){
			if(numOfLetters(original) >= minLength){
				wordCounter++;
				return wordCounter;
			}
		}
		while (original.contains(" ")){
			String originalb = original.substring(0, original.indexOf(" "));
			if(numOfLetters(originalb) >= minLength){
				wordCounter++;
			}
			if (original.indexOf(" ") != -1){
				original = original.substring(original.indexOf(" ") + 1);
			}
		} 
		if(numOfLetters(original) >= minLength){
			wordCounter++;
		}
		return wordCounter;
	}
	
	public static int numOfLetters(String word){
		int num = 0;
		for(int g = 0; g < word.length(); g++){
			if(Character.isLetter(word.charAt(g))){
				num++;
			}
		}
		return num;
	}
}
