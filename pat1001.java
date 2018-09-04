import java.util.*;
import java.math.*;
public class pat1001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			 sc.close();
			char[] ans = (a.add(b)).toString().toCharArray(); // 将结果转化为字符串数组格式
			int len = ans.length;
			int s = len;
			for (int i = 0; i < len; i++) {
				System.out.print(ans[i]);
				s--; // s代表字符串还剩下多少个元素，s%3==0时就输出逗号
				if (s % 3 == 0 && s != 0 && ans[i] != '-')
					System.out.print(","); // s!=0&&ans[i]!='-'是为了不在开头结尾输出逗号
			}
			System.out.println();

			/*
			 * System.out.println(a.subtract(b));
			 * System.out.println(a.multiply(b));
			 * System.out.println(a.divide(b));
			 * System.out.println(a.remainder(b));
			 * System.out.println(a.negate());
			 */

		}

	}

}
