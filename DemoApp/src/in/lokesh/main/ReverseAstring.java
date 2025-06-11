package in.lokesh.main;

public class ReverseAstring {

	public static void main(String[] args) {
		String str = "KrishnaMurali";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Original String: " + str);
		sb.reverse();
		System.out.println("Reversed String: " + sb.toString());
		String ori="Lokesh";
		String rev = " ";
		for(int i=0; i<ori.length(); i++) {
			rev = ori.charAt(i)+rev;
		}
		System.out.println("Reversed String using loop: " + rev);
	}

}
