package progra.tarea.sorting;
import java.util.Date;
import java.util.Random;

	public class VectorGenerator {

		private int size = 10000;
		private int[] numbers = null;
		private Random randomGenerator = null;
		
		public VectorGenerator() {
			initGenerator();
		}
		
		public VectorGenerator(int newSize) {
			size = newSize;
			initGenerator();
		}
		
		private void initGenerator() {
			//Crea un nuevo generador de numeros aleatorios.
			randomGenerator = new Random((new Date()).getTime());

			numbers = new int[size];		
			for(int i = 0; i < size; i++) {
				numbers[i] = i;
			}
		}
			
		public int[] generateRandomVector() {
			
			int[] newRandomVector = new int[size];		
			for(int i = 0; i < size; i++) {
				newRandomVector[i] = numbers[i];
			}
			
			for(int i = 0; i < size; i++) {
				int x = randomGenerator.nextInt(size);
				int y = randomGenerator.nextInt(size);
				
				int tmp =  newRandomVector[x];
				newRandomVector[x] = newRandomVector[y];
				newRandomVector[y] = tmp; 
			}
			
			return newRandomVector;
		}
	}

