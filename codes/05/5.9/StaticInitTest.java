

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
public class StaticInitTest
{
	// ��ִ�����ʼ���齫�����a��ֵΪ6
	static
	{
		a = 6;
	}
	// �ٽ������a��ֵΪ9
	static int a = 9;
	public static void main(String[] args)
	{
		// ������뽫���9
		System.out.println(StaticInitTest.a);
	}
}
