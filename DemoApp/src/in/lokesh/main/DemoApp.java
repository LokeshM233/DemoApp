package in.lokesh.main;

public class DemoApp {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at index " + i + ": " + arr[i]);
		}
		//for each loop
		for (int element : arr) {
			System.out.println("Element: " + element);
		}
		String name = "LokeshM!";
		int couunt = name.toUpperCase().length();
		System.out.println("Length of the string in uppercase: " + couunt);
		
		StringBuilder sb = new StringBuilder("MasaniLokesh");
		int length = sb.append("MURALI").reverse().length();
		System.out.println("Length of the reversed string: " + length);
	}
	

}
