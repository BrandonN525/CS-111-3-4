public class Compress {

	public static void main(String[] args) {
		System.out.println(compress("aaa   bbbcqwww^^^  JJj"));
	}
	
	public static String compress (String original){
		StringBuffer RLE = new StringBuffer();
		for (int i = 0; i < original.length(); i++){
			int charsInARow = 1;
			while((i + 1 < original.length()) && (original.charAt(i) == original.charAt(i + 1))){
				i++;
				charsInARow++;
			}
			if(charsInARow != 1){
				RLE.append(charsInARow);
			}
			RLE.append(original.charAt(i));
		}
		return RLE.toString();
	}
}
