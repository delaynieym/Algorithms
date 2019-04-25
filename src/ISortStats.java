
/**
 * Interface for the SortStats class.
 *
 * @author Joyce
 */
public abstract class ISortStats {
	private int items;
	private int comparisons;
	private int moves;
	private long nanoseconds;

	/**
	 * Abstract method that returns the name of the sorting algorithm.
	 *
	 * @return String
	 */
	abstract String getAlgorithm();

	public int getNumItems() {
		return this.items;
	}

	public int getNumComparisons() {
		return this.comparisons;
	}

	public int getNumMoves() {
		return this.moves;
	}

	public long getNumNanoseconds() {
		return this.nanoseconds;
	}

	public void setNumItems(int x) {
		this.items = x;
	}

	public void setNumComparisons(int x) {
		this.comparisons = x;
	}

	public void setNumMoves(int x) {
		this.moves = x;
	}

	public void setNumNanoseconds(long x) {
		this.nanoseconds = x;
	}
}
