

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
interface A
{
	void test();
}
public class ATest
{
	public static void main(String[] args)
	{
		int age = 8;     // ��
		// ������뽫�ᵼ�±������
		// ����age�ֲ������������ڲ�������ˣ����age�൱�ڱ�final������
//		age = 2;
		var a = new A()
		{
			public void test()
			{
				// ��Java 8��ǰ������佫��ʾ����age����ʹ��final����
				// ��Java 8��ʼ�������ڲ��ࡢ�ֲ��ڲ����������ʷ�final�ľֲ�����
				System.out.println(age);
			}
		};
		a.test();
	}
}
