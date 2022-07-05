
public class SplitString 
{
	public static void stringReverse() {
		String s = "Shinu";
		String revs = "";
		char[] sarr = s.toCharArray();
		char[] revsarr = new char[sarr.length];
		System.out.println(sarr.length);
		for(int i = 0; i<sarr.length; i++) {
			System.out.println(sarr.length-i-1);
			revsarr[i]=sarr[sarr.length-1-i];
		}
		for(int i = 0;i<sarr.length;i++) {
			revs += revsarr[i];
		}
		System.out.println(revs);
	}
	
	
	public static void main(String[] args) {
		stringReverse();
		Alphabet alpha = Alphabet.D;
		switch (alpha) {
		case A:
		case E:
		case I:
			System.out.println("Vowel");
			break;
		case B:
		case C:
		case D:
		case F:
		case G:
		case H:
		case J:
			System.out.println("Consonent");
			break;
		default:
			break;
		}
	}
}

enum Alphabet{
	A,B,C,D,E,F,G,H,I,J,K,L,M
}
