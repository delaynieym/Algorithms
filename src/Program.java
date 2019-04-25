import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Program {
	public static void main(String[] args) throws FileNotFoundException {
		Random rand = new Random();
		BubbleSort bs = new BubbleSort();
		InsersionSort is = new InsersionSort();
		MergeSort ms = new MergeSort();
		SelectionSort ss = new SelectionSort();

		int[][] arrays = new int[13][];

		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = new int[(int) Math.pow(2, i)];

			for (int j = 0; j < arrays[i].length; j++) {
				arrays[i][j] = rand.nextInt(4096);
			}

		}

		int[][] reversed = new int[13][];

		for (int i = 0; i < reversed.length; i++) {
			reversed[i] = new int[(int) Math.pow(2, i)];
		int n = 99999999;

			for (int j = 0; j < reversed[i].length; j++) {
				n -= rand.nextInt(4096);
				reversed[i][j] = n;
			}

		}

		PrintStream x = new PrintStream(new File("time.txt"));

		for (int[] array : arrays) {
			// bs.setNumItems(array.length);
			// is.setNumItems(array.length);
			// ms.setNumItems(array.length);
			// ss.setNumItems(array.length);

			// printStats(bs.sort(Arrays.copyOf(array, array.length)), x);
			// printStats(is.sort(Arrays.copyOf(array, array.length)), x);
			// printStats(ms.sort(Arrays.copyOf(array, array.length)), x);
			// printStats(ss.sort(array), x);
		}

		x.println("unsorted");
		for (int[] array : arrays) {
			x.println(ss.sort(array).getNumNanoseconds());
		}

			x.println("sorted " + Check.isInOrder(arrays[12]));
		for (int[] array : arrays) {
			x.println(ss.sort(array).getNumNanoseconds());
		}

		x.println("reversed");
		for (int[] array : reversed) {
			x.println(ss.sort(array).getNumNanoseconds());
		}

	}

	public static void printStats(ISortStats x, PrintStream out) {
		out.println("Algorithm   : " + x.getAlgorithm());
		out.println("Items       : " + x.getNumItems());
		out.println("Comparisons : " + x.getNumComparisons());
		out.println("Moves       : " + x.getNumMoves());
		out.println("Nanoseconds : " + x.getNumNanoseconds());
		out.println("\n");
	}
}
