package aprendizadoJava.aula09Loops;

public class Loops5 {
	
	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50};
		
		for (int i : array) {
			System.out.println("Enhanced-for: " + i);
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("for comum: " + i);
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("for comum elementos: " + array[i]);
		}
	}

}
