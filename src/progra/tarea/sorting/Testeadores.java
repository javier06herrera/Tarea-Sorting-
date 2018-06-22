package progra.tarea.sorting;

public class Testeadores {

	Sorting1 tester=new Sorting1();
	VectorGenerator vecGen=new VectorGenerator();

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

}
