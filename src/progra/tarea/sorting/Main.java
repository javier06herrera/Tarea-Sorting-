package progra.tarea.sorting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting1 rapidin= new Sorting1();
		int[] array= {3,4,1,7,6};
		rapidin.quickSort(array);
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
