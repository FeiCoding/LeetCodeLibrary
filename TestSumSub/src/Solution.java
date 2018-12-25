import java.util.*;

public class Solution {
	static Set<Integer> set;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {200, 200, 200, 200};
		System.out.println(solution(A));
	}

	public static boolean solution(int[] A) {
		// write your code in Java SE 8
		if (A.length <= 0)
			return false;
		final int ANS = 24;
		set = new HashSet<Integer>();
		for (int num : A)
			set.add(num);
		return findNum(A, 0, ANS, ANS);
	}

	public static boolean findNum(int A[], int index, int target, int ANS) {
		System.out.println(target);
		if (index >= 4)
			return false;
		if (set.contains(target) || set.contains(ANS - A[index]))
			return true;
		else
			return findNum(A, index + 1, target - A[index], ANS) || findNum(A, index + 1, target + A[index], ANS);
	}
}
