package progra.tarea.sorting;

public class Testeadores {

	Sorting1 tester=new Sorting1();
	VectorGenerator vecGen=new VectorGenerator();
	MergeSort merge = new MergeSort();
	InsertionSort ins = new InsertionSort();
	BubbleSort bubble = new BubbleSort();

	public double Selection() {
		long tiempo=0;
		long startTime;
		long stopTime;
		long elapsedTime;

		for(int i=0;i<1000;i++) {
			int[] vect = vecGen.generateRandomVector();
			startTime = System.currentTimeMillis();
			tester.selectionSort(vect);
			stopTime = System.currentTimeMillis();
			elapsedTime = stopTime - startTime;
			tiempo+=elapsedTime;
			
		}
		long promedio =tiempo/1000;
		return promedio;
	}
	
	public double QuickSort() {
		long tiempo=0;
		long startTime;
		long stopTime;
		long elapsedTime;

		for(int i=0;i<1000;i++) {
			int[] vect = vecGen.generateRandomVector();
			startTime = System.currentTimeMillis();
			tester.quickSort(vect);
			stopTime = System.currentTimeMillis();
			elapsedTime = stopTime - startTime;
			tiempo+=elapsedTime;
			
		}
		long promedio =tiempo/1000;
		return promedio;
	}
	
	public double BubbleSort() {
		long tiempo=0;
		long startTime;
		long stopTime;
		long elapsedTime;

		for(int i=0;i<1000;i++) {
			int[] vect = vecGen.generateRandomVector();
			startTime = System.currentTimeMillis();
			bubble.bubble(vect);
			stopTime = System.currentTimeMillis();
			elapsedTime = stopTime - startTime;
			tiempo+=elapsedTime;
			
		}
		long promedio =tiempo/1000;
		return promedio;
	}
	
	public double InsertionSort() {
		long tiempo=0;
		long startTime;
		long stopTime;
		long elapsedTime;

		for(int i=0;i<1000;i++) {
			int[] vect = vecGen.generateRandomVector();
			startTime = System.currentTimeMillis();
			ins.insertion(vect);
			stopTime = System.currentTimeMillis();
			elapsedTime = stopTime - startTime;
			tiempo+=elapsedTime;
			
		}
		long promedio =tiempo/1000;
		return promedio;
	}
	
	public double MergeSort() {
		long tiempo=0;
		long startTime;
		long stopTime;
		long elapsedTime;

		for(int i=0;i<1000;i++) {
			int[] vect = vecGen.generateRandomVector();
			startTime = System.currentTimeMillis();
			merge.merge(vect);
			stopTime = System.currentTimeMillis();
			elapsedTime = stopTime - startTime;
			tiempo+=elapsedTime;
			
		}
		long promedio =tiempo/1000;
		return promedio;
	}
}
