package aprendizadoJava.exercicioExtra1;

public class ExercicioExtra1 {
	
	private static int[] array1;
	private static int[] array2;
	private static int[] array3;
	
	public static void somaDosMenores(int[] array) {
		int menor = Integer.MAX_VALUE;
		int indexMenor = -1;
		int segundoMenor = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < menor) {
				menor = array[i];
				indexMenor = i;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < segundoMenor) {
				if(i == indexMenor) {
					continue;
				}
				
				segundoMenor = array[i];
			}				
		}
		
		System.out.println("O menor número é " + menor);
		System.out.println("O segundo menor número é " + segundoMenor);
		System.out.println("A soma dos dois é " + (menor + segundoMenor));
	}

	public static void main(String[] args) {
		
		array1 = new int[]{8, 5, 2, 25, 14};
		array2 = new int[]{17, 1, 9, 6, 4, 12};
		array3 = new int[]{23, 21, 17, 12, 19, 3};
		
		somaDosMenores(array1);
		
		System.out.println("");
		
		somaDosMenores(array2);
		
		System.out.println("");
		
		somaDosMenores(array3);		
	}		
}
