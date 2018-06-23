package progra.tarea.sorting;

public class MergeSort {
    public int[] merge(int[] arreglo) {
    	int[] ultimoArreglo = ordene(arreglo);
    	return ultimoArreglo;
    	
    }
    public int[] ordene(int[] arreglo1) {
    	int[] nuevoArreglo = arreglo1;
    	if(arreglo1.length > 1) {
    		int a = ((arreglo1.length) / 2) - 1;
    		int b = a + 1;
    		int[] partidoA = partir(arreglo1, 0, a);
    		int[] partidoB = partir(arreglo1, b, (arreglo1.length - 1));
    		if(partidoA.length > 1) {
    			partidoA = ordene(partidoA);
    		}
    		if(partidoB.length > 1) {
    			partidoB = ordene(partidoA);
    		}
    		int i = 0;
    		int punteroA = 0;
    		int punteroB = 0;
    		while((punteroA < partidoA.length) && (punteroB < partidoB.length)) {
    			if(partidoA[punteroA] < partidoB[punteroB]) {
    				nuevoArreglo[i] = partidoA[punteroA];
    				punteroA++;
    				i++;
    			}
    			else {
    				nuevoArreglo[i] = partidoB[punteroB];
    				punteroB++;
    				i++;
    			}
    		}
    		if(punteroA == partidoA.length) {
    			for(int k = punteroB; k < partidoB.length; k++) {
    				nuevoArreglo[i] = partidoB[k];
    			}
    		}
    		else {
    			for(int k = punteroA; k < partidoA.length; k++) {
    				nuevoArreglo[i] = partidoA[k];
    			}
    		}
    	}
    	return nuevoArreglo;
    }
    public int[] partir(int[] arreglo2, int inicio, int fin) {
    	int tamano = (fin - inicio);
    	int[] partido = new int[tamano];
    	for(int i = 0; i < tamano; i++) {
    		partido[i] = arreglo2[inicio];
    		inicio++;
    	}
    	return partido;
    }
}
