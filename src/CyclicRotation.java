import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		
		int[] A = {3,5,6,7,8,9};
		int[] rotatedA = solution(A, 4);
		System.out.println(Arrays.toString(rotatedA));
	}

	public static int[] solution(int[] A, int K) {
		
		int[] rotated = new int[A.length];
		
		for (int i = 0; i < A.length; i++) {
			
			int newIdx = findNewIndex(i, K, A.length);
			rotated[newIdx] = A[i];
			
		}
		
		return rotated;
	}	
	
	public static int findNewIndex(int originalIndex, int rotateNumber, int length){
		return ( originalIndex + rotateNumber ) % length;
	}
}
