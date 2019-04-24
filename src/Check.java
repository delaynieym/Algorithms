import java.util.Arrays;
//import java.util.Random;

public class Check {
//	public static void main(String[] args) {
//		Random rand = new Random();
//		int[] a = new int[2048];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = rand.nextInt(2048);
//		}
//		System.out.println(Arrays.toString(a));
//		System.out.println(isInOrder(a));
//		Arrays.sort(a);
//		System.out.println(isInOrder(a));
//	}
	
	//i actually don't know which should take longer.  maybe if i used multithreading
	
	public static boolean isInOrder(int[] a) {
		//base cases
		if (a.length == 2) return a[0] <= a[1]; 
		if (a.length == 1) return true;
		
		if (a[0] <= a[a.length - 1]) { //if it's not out of order
			return isInOrder(Arrays.copyOfRange(a, 0, a.length/2)) && isInOrder(Arrays.copyOfRange(a, a.length/2, a.length));
		}
		return false; //it was out of order
	}
	
	public static boolean isInOrder(int[] a, boolean x) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i+1]) return false;
		}
		return true;
	}

}
