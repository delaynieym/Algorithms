import java.util.Arrays;

public class MergeSort extends ISortStats implements ISorter {

	@Override
	public String getAlgorithm() {
		return "Merge Sort";
	}

	@Override
	public ISortStats sort(int[] a) {
	//can't call set items here because it's called recursively
	long t = System.nanoTime();

	if (a.length > 1) {
		//the recursion part only mutates, we can't return anything used in recursion because we're returning *this*
		int[] left  = Arrays.copyOfRange(a, 0, a.length / 2);
		int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);

		//passed by reference, don't need to be returned
		sort(left);
		sort(right);
		

		merge(a, left, right);
	}

	this.setNumNanoseconds(System.nanoTime() - t);
	this.setNumMoves(this.getNumComparisons()); //for this algorithm, moves is the same number of comparisons
	return this;
}

	public void merge(int[] x, int[] a, int[] b) { // TAKEN FROM BUILDING IN JAVA
		int ia = 0; int ib = 0;
		for (int i = 0; i < x.length; i++) {
			if (ib >= b.length || (ia < a.length && a[ia] <= b[ib])) { //if b is out of bounds, or a is within bounds and its next value comes next
				x[i] = a[ia]; //take from left
				ia++;
			}
			else {
				x[i] = b[ib]; //take from right
				ib++;
			}
			this.setNumComparisons(this.getNumComparisons() + 1);
		}
	}
}
