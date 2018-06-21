package progra.tarea.sorting;

public class Sorting1 {
	public void quickSort(int [] array) {
		organizar(array,0,array.length);
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
		int j=end-1;
		int d=start;
		while(true) {
			while(array[i]<=array[d] && i<=end) {
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
}
