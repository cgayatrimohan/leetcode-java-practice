package blind75;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 2;
		System.out.println(climbStairs(n));

	}

	private static int climbStairs(int n) {
		return climb_stairs(0,n);
	}
	
	private static int climb_stairs(int i, int n) {
		if(i > n) return 0;
		if(i == n) return 1;
		return climb_stairs(i+1, n) + climb_stairs(i+2, n);
				
	}
}
