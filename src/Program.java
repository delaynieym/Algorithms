import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;

public class Program {
	public static void main(String[] args) throws FileNotFoundException {
		Random rand = new Random();
		int[] a = new int[2048];
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(2048);
		}

		BubbleSort i = new BubbleSort();
		i.setNumItems(a.length);
		printStats(i.sort(a), new PrintStream(new File("data.txt")));
		System.out.println(Check.isInOrder(a));

	}

	public static void printStats(ISortStats x, PrintStream out) {
		out.println("Algorithm   : " + x.getAlgorithm());
		out.println("Items       : " + x.getNumItems());
		out.println("Comparisons : " + x.getNumComparisons());
		out.println("Moves       : " + x.getNumMoves());
		out.println("Nanoseconds : " + x.getNumNanoseconds());
	}
}
