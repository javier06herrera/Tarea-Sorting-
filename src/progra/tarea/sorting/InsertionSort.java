package progra.tarea.sorting;

public class InsertionSort {
	public int[] insertion(int[] arreglo) {
		int inicio = 0;
		int fin = 1;
		while(fin < arreglo.length) {
			if(arreglo[inicio] > arreglo[fin]) {
				ordenar(fin, arreglo);
			}
			inicio++;
			fin++;
			
		}
		return arreglo;
	}
	public int[] ordenar(int fin, int[] arreglo) {
		int i = fin -1;
		int tmp = 0;
		while((arreglo[fin] < arreglo[i]) || (fin > 0)) {
			tmp = arreglo[i];
			arreglo[i] = arreglo[fin];
			arreglo[fin] = tmp;
			fin--;
			i--;
		}
		return arreglo;
	}
}
