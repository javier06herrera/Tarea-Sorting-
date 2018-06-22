package progra.tarea.sorting;

public class Sorting1 {
	public void quickSort(int [] array) {
		organizar(array,0,array.length-1);
	}

	private void organizar(int [] array, int start, int end ) {
		if(start>=end) {
			return;
		} else {
			int d=fraccionar(array,start, end);
			organizar(array, start, d-1);
			organizar(array, d+1, end);
		}
	}

	private int fraccionar(int [] array, int start, int end) {
		int i=start+1;
		int j=end;
		int d=start;
		while(true) {
			while(array[i]<=array[d] && i<end) {
				i++;
			}
			while(array[j]>=array[d] && j>=start+1) {
				j--;
			}

			if (i>=j) {
				break;
			}

			swap(array,i,j);
		}
		swap (array, j,d);
		return j;
	}

	private void swap(int array[], int i, int j) {
		int temporal=array[i];
		array[i]=array[j];
		array[j]=temporal;
	}

	public void selectionSort(int [] array) {
		int tam=array.length;
		int posMinimo;
		for(int i=0;i<tam;i++) {
			int minimo=array[i];
			//The next line solves the case where the first value is the minimum 
			posMinimo=i;
			for (int j=i+1; j<tam;j++) {
				if(array[j]<minimo) {
					minimo=array[j];
					posMinimo=j;
				}
			}
			array[posMinimo]=array[i];
			array[i]=minimo;
		}
	}
}


