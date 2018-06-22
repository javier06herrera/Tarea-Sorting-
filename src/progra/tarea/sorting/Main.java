package progra.tarea.sorting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testeadores tester=new Testeadores();
		double promedioS=tester.Selection();
		double promedioQ=tester.QuickSort();
		
		System.out.println("Selection: "+promedioS+" Quick: "+promedioQ);
	}

}
