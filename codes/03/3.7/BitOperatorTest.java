

/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks
 * @version 6.0
 */
public class BitOperatorTest
{
	public static void main(String[] args)
	{
//		System.out.println(2.5 & 3.0);
		System.out.println(5 & 9); // �����1
		System.out.println(5 | 9); // �����13
		System.out.println(~-5); // �����4
		System.out.println(5 ^ 9); // �����12
		System.out.println(5 << 2); // ���20
		System.out.println(-5 << 2); // ���-20
		System.out.println(-5 >> 2); // ���-2
		System.out.println(-5 >>> 2); // ���1073741822
	}
}