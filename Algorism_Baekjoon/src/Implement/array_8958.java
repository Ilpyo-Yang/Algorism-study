package Implement;

//1차원 배열, 8958
/*
- ox?�즈 8958
"OOXXOXXOOO"?? 같�? OX?�즈?�� 결과�? ?��?��. O?�� 문제�? 맞�? 것이�?, X?�� 문제�? ??�? 것이?��. 
문제�? 맞�? 경우 �? 문제?�� ?��?��?�� �? 문제까�? ?��?��?�� O?�� 개수�? ?��?��. ?���? ?��?��, 10�? 문제?�� ?��?��?�� 3?�� ?��?��.
"OOXXOXXOOO"?�� ?��?��?�� 1+2+0+0+1+0+0+1+2+3 = 10?��?��?��.
OX?�즈?�� 결과�? 주어졌을 ?��, ?��?���? 구하?�� ?��로그?��?�� ?��?��?��?��?��.
*/

import java.util.Scanner;

public class array_8958 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		
		String check = sc.nextLine();
		String[] strArr = new String[]{check};
		
		int score = 0;

			for(int j=1;j<strArr.length+1;j++) {
				if("o".equalsIgnoreCase(strArr[j])) 
					score++;
			}
			System.out.println(score);

		
		
		
		sc.close();
	}
	
}

/*
import java.util.Scanner;

public class java_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        String[] str = new String[num+1];

        for (int i = 0; i < num; i++) {
            int count = 0, sum = 0;
            str[i] = sc.next();
            for (int j =0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O')
                    sum += ++count;
                else count = 0;
            }
            System.out.println(sum);
        }
        
        sc.close();
    }
} 
 */
