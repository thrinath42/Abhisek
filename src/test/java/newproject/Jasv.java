package newproject;

public class Jasv {
	public void reverseStr(String s) {
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
	}
	public static void main(String[] args) {
		String comp="qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
		String  s="I have 13 cows @ village.";
		// egalliv @ sowc 13 evah I
		String[] split = s.split(s);
		for(int i=split.length-1;i>=0;i--) {
			if(comp.contains(split[i]));
		}
			
	}
	
}
