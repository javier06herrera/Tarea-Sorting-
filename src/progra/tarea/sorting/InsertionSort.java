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
	public int[] ordenar(int fina, int[] arreglo) {
		int i = fina -1;
		int tmp = 0;
		while((i >= 0) && (arreglo[fina] < arreglo[i])) {
			tmp = arreglo[i];
			arreglo[i] = arreglo[fina];
			arreglo[fina] = tmp;
			fina--;
			i--;
		}
		return arreglo;
	}
}
