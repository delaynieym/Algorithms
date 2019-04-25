
public class SelectionSort extends ISortStats implements ISorter {

	@Override
	public String getAlgorithm() {
		return "Selection Sort";
	}

	@Override
	public ISortStats sort(int[] a) { // TAKEN FROM BUILDING IN JAVA
		long t = System.nanoTime();
		for (int i = 0; i < a.length; i++) {
			int smallest = i; //index of smallest element
			//finding the smallest element
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[smallest]) smallest = j;
				this.setNumComparisons(this.getNumComparisons() + 1);
			}

			//swap
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;
			this.setNumMoves(this.getNumMoves() + 1);

		}
		this.setNumNanoseconds(System.nanoTime() - t);
		return this;
	}

}
