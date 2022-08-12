package algorithms.sorting;

public class Sorting {

	public static int[] selection(int[] nums) {
		int aux;
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i]>nums[j]) {
					aux = nums[j];
					nums[j] = nums[i];
					nums[i] = aux;
				}
			}
		}
		return nums;
	}
	
	public static void mergeSort(int[] arrayToSort) {
		int length = arrayToSort.length; //se obtiene la longitud del array que entra
		
		if(length<2) { //si es menor que 2 quiere decir que ya se dividió por completo el array
			return;
		}
		
		int mid = length/2; //se calcula la mitad del array
		int[] leftHalf = new int[mid]; //se inicializa la mitad izquierda de longitud la mitad
		int[] rightHalf = new int[length - mid]; // se inicializa la mitad derecha con la diferencia entre el total y la primer mitad
		
		for(int i=0;i<mid;i++) { //se copian los valores de la mitad izquierda
			leftHalf[i] = arrayToSort[i];
		}
		
		for(int i=mid;i<length;i++) { //se copian los valores de la mitad derecha
			rightHalf[i-mid] = arrayToSort[i];
		}
		
		mergeSort(leftHalf); //se llama a la función recursivamente sobre la mitad izquierda
		mergeSort(rightHalf); //se llama a la función recursivamente sobre la mitad derecha
		merge(arrayToSort,leftHalf,rightHalf); //se llama al metodo que mezcla
	}
	
	private static void merge(int[] mergedArray, int[] leftHalf, int[] rightHalf) {
		int leftLength = leftHalf.length; //se obtiene la longitud el array de la izquierda
		int rigthLength = rightHalf.length; //se obtiene la longitud el array de la derecha
		
		int itLeft = 0, itRigth = 0, itMerged = 0; //se declaran los 3 iteradores
		
		while(itLeft < leftLength && itRigth < rigthLength) {
			if(leftHalf[itLeft]<=rightHalf[itRigth]) {
				mergedArray[itMerged]=leftHalf[itLeft];
				itLeft++;
			} else {
				mergedArray[itMerged]=rightHalf[itRigth];
				itRigth++;
			}		
			itMerged++;
		}
		
		while(itLeft<leftLength) {
			mergedArray[itMerged] = leftHalf[itLeft];
			itLeft++;
			itMerged++;
		}
		
		while(itRigth<rigthLength) {
			mergedArray[itMerged] = rightHalf[itRigth];
			itRigth++;
			itMerged++;
		}
	}

}
