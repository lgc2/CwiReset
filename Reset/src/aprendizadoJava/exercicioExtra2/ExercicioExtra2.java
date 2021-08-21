package aprendizadoJava.exercicioExtra2;

import java.util.Arrays;

public class ExercicioExtra2 {

	private static int[] array1;
	private static int[] array2;
	private static int[] array3;
	private static int[] array4;
	private static int[] array5;
	
	public static int[] retornarMultiplos(int[] array) {
		int[] arrayPares = new int[array.length];
		int[] arrayImpares = new int[array.length];
		int index = 0;
		int[] retorno;
		
		for(int i = 0; i < array.length; i++) {
			if((array[0] % 2) == 0) {
				if(i != 0) {
					if((array[i] % 2) == 0 && (array[i] % array[0]) == 0) {
						arrayPares[index] = array[i];
						index++;
					}
				}				
			} else {
				if(i != 0) {
					if((array[i] % 2) != 0 && (array[i] % array[0]) == 0) {
						arrayImpares[index] = array[i];
						index++;
					}
				}				
			}
		}
		
		if((array[0] % 2) == 0) {
			retorno = arrayPares;
		} else {
			retorno = arrayImpares;
		}
		
		return retorno;
	}
	
	public static void main(String[] args) {
		
		int[] array1 = new int[]{4, 6, 8, 10, 12, 14};
		int[] array2 = new int[]{3, 5, 6, 9, 12, 13, 15};
		int[] array3 = new int[]{7, 14, 21, 25, 28, 35, 37, 39, 42};
		int[] array4 = new int[]{6, 8, 18, 23, 28, 30};
		int[] array5 = new int[]{5, 10, 20, 30, 45, 50};
		
		int[] retornoDeMultiplos = retornarMultiplos(array1);
		int[] retornoDeMultiplos2 = retornarMultiplos(array2);
		int[] retornoDeMultiplos3 = retornarMultiplos(array3);
		int[] retornoDeMultiplos4 = retornarMultiplos(array4);
		int[] retornoDeMultiplos5 = retornarMultiplos(array5);
		
		System.out.println(Arrays.toString(retornoDeMultiplos));
		System.out.println(Arrays.toString(retornoDeMultiplos2));
		System.out.println(Arrays.toString(retornoDeMultiplos3));
		System.out.println(Arrays.toString(retornoDeMultiplos4));
		System.out.println(Arrays.toString(retornoDeMultiplos5));
	}
}
