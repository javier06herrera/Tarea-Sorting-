package progra.tarea.sorting;

public class BubbleSort {
    public int[] bubble(int[] arreglo) {
    	boolean cambio = true;
    	int tmp = 0;
    	while(cambio) {
    		cambio = false;
    		for(int i = 0 ; i < (arreglo.length -1) ; i++) {
    			if(arreglo[i] > arreglo[i+1]) {
    				tmp = arreglo[i];
    				arreglo[i] = arreglo[i+1];
    				arreglo[i+1] = tmp;
    				cambio = true;
    			}
    		}
    	}
    	return arreglo;
    }
}
