import java.util.*;
import java.math.*;
public class pat1001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			 sc.close();
			char[] ans = (a.add(b)).toString().toCharArray(); // �����ת��Ϊ�ַ��������ʽ
			int len = ans.length;
			int s = len;
			for (int i = 0; i < len; i++) {
				System.out.print(ans[i]);
				s--; // s�����ַ�����ʣ�¶��ٸ�Ԫ�أ�s%3==0ʱ���������
				if (s % 3 == 0 && s != 0 && ans[i] != '-')
					System.out.print(","); // s!=0&&ans[i]!='-'��Ϊ�˲��ڿ�ͷ��β�������
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
