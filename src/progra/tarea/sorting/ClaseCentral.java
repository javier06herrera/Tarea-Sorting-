package progra.tarea.sorting;

public class ClaseCentral {

	public void run() {	
		Testeadores tester=new Testeadores();
		double promedioS=tester.Selection();
		double promedioQ=tester.QuickSort();
		double promedioB=tester.BubbleSort();
		double promedioI=tester.InsertionSort();
		double promedioM=tester.MergeSort();

		System.out.println("Selection: "+promedioS+" \nQuick: "+promedioQ+" \nBubble: "+promedioB+" \nInsertion: "+promedioI+" \nMerge: "+promedioM);
	}

}
