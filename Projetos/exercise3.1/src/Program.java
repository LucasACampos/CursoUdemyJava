
public class Program {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		String toLowerCase = original.toLowerCase();
		String toUpperCase = original.toUpperCase();
		String trim = original.trim();
		String subString = original.substring(2);
		String subString2 = original.substring(2, 9);
		String replace = original.replace("a", "x");
		String replace2 = original.replace("ab", "xy");
		int indexOf = original.indexOf("FG");
		int lastIndexOf = original.lastIndexOf("FG");
		
		System.out.printf("Original: -%s-%n",original);
		System.out.println("toLoweCase: -" + toLowerCase + "-");
		System.out.println("toUpperCase: -" + toUpperCase + "-");
		System.out.println("trim: -" + trim + "-");
		System.out.println("subString(2): -" + subString + "-");
		System.out.println("subString(2, 9): -" + subString2 + "-");
		System.out.println("replace('a', 'x'): -" + replace + "-");
		System.out.println("replace('ab', 'xy'): -" + replace2 + "-");
		System.out.println("indexOf('FG'): -" + indexOf + "-");
		System.out.println("indexOf('FG'): -" + lastIndexOf + "-");
		
		String s = "potato apple lemon";
		String[] split = s.split(" ");
		String[] vetor = new String[2];
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
	}
}
