
public class BubbleSort extends ISortStats implements ISorter {

	@Override
	public String getAlgorithm() {
		// TODO Auto-generated method stub
		return "Bubble Sort";
	}

	@Override
	public ISortStats sort(int[] a) { // TAKEN FROM GEEKSFORGEEKS.COM
		long t = System.nanoTime();
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				this.setNumComparisons(this.getNumComparisons() + 1);
				if (a[j] > a[j + 1]) {
					// swap arr[j+1] and arr[i]
					this.setNumMoves(this.getNumMoves() + 1);
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		this.setNumNanoseconds(System.nanoTime() - t);
		return this;
	}

}
