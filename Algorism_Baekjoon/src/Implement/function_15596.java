package Implement;

//?��?��
/*
- ?��?��n개의 ?�� 15596
Java: long sum(int[] a); (?��?��?�� ?���?: Test)
a: ?��?�� 구해?�� ?��?�� ?��?�� n개�? ???��?��?�� ?��?�� 배열 (0 ?�� a[i] ?�� 1,000,000, 1 ?�� n ?�� 3,000,000)
리턴�?: a?�� ?��?��?��?�� ?��?�� ?��?�� n개의 ?��
public class Test {
    long sum(int[] a) {
        long ans = 0;
        return ans;
    }
}
*/

public class function_15596 {
	
    int[] a = new int[1000001];

	public static long sum(int[] a) {
    	long ans = 0, n=0;
    	if(1<=n&&n<=3000000) {
			for (int i=1; i<=n; i++) {
				a[i-0]=i;
			}
		}
    	for (int i=0; i<a.length; i++) {
			ans += a[i];
		}
	return ans;	
	}
}
