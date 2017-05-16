package com.ss.cg;

public class Test1 {

	public int solution(int A[]) {

		int deepestPit = -1;

		for (int i = 0; i < A.length; i++) {

			int p = i, q = i, r = i;
			for (; p < A.length - 1; p++) {
				if (A[p] < A[p + 1]) {
					break;
				}
			}
			if (p == i)
				continue;
			else {
				q = p;
				// p=i;
			}
			for (; q < A.length; q++) {
				if (A[q] > A[q + 1]) {
					break;
				} else {
					r = q - 1;
					p = i;
					System.out.println(p + " " + q + " " + r);
					int min = getMin(A[p] - A[q], A[r] - A[q]);
					if (deepestPit < min)
						deepestPit = min;

				}
			}

		}

		return deepestPit;
	}

	public static int getMin(int a, int b) {
		if (a > b) {
			return b;
		} else
			return a;
	}

}
