
public class InsersionSort extends ISortStats implements ISorter {

	@Override
	public String getAlgorithm() {
		return "Insersion Sort";
	}

	@Override
	public ISortStats sort(int[] a) { // METHOD TAKEN FROM GEEKSFORGEEKS.COM (and then edited)
		long t = System.nanoTime();
		
		for (int i = 0; i < a.length ; i++) {
			int key = a[i]; //the current element that is being sorted

			int j = i-1; //index for comparison in the sorted array
			while (j >= 0 && a[j] > key) {
				this.setNumComparisons(this.getNumComparisons() + 1);
				a[j + 1] = a[j]; // shifting element up
				this.setNumMoves(this.getNumMoves() + 1);
				j--;
			}
			a[j + 1] = key;
			this.setNumMoves(this.getNumMoves() + 1);
		}

		this.setNumNanoseconds(System.nanoTime() - t);
		return this;
	}

}
