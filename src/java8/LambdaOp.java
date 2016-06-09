package java8;

import java.util.Arrays;

public class LambdaOp {

	public interface Op {
		public void runOp();
	}
	
	public static class TimingUtils {
		private static final double ONE_BILLION = 1_000_000_000;
		
		public static void timeOp(Op operation) {
			long startTime = System.nanoTime();
			operation.runOp();
			long endTime = System.nanoTime();
			double elapseSeconds = (endTime - startTime)/ONE_BILLION;
			System.out.printf("Elapse time: %.3f seconds.%n", elapseSeconds);
		}
		
		public static class TimingTests {
			public static void main(String[] args) {
				for(int i=3; i<8; i++) {
					int size = (int) Math.pow(10, i);
					System.out.printf("Sorting array of length %,d.%n", size);
					TimingUtils.timeOp(() -> sortArray(size));
				}
			}
			
			public static double[] randomNums(int length) {
				double[] nums = new double[length];
				for(int i=0; i< length; i++) {
					nums[i] = Math.random();
				}
				
				return nums;
			}
			
			public static void sortArray(int length) {
				double[] nums = randomNums(length);
				
				Arrays.sort(nums);
			}
		}
	}
}
