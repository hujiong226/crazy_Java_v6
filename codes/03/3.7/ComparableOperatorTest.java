

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
public class ComparableOperatorTest
{
	public static void main(String[] args)
	{
		System.out.println("5�Ƿ���� 4.0��" + (5 > 4.0)); // ���true
		System.out.println("5��5.0�Ƿ���ȣ�" + (5 == 5.0)); // ���true
		System.out.println("97��'a'�Ƿ���ȣ�" + (97 == 'a')); // ���true
		System.out.println("true��false�Ƿ���ȣ�" + (true == false)); // ���false
		// ����2��ComparableOperatorTest���󣬷ֱ𸳸�t1��t2��������
		var t1 = new ComparableOperatorTest();
		var t2 = new ComparableOperatorTest();
		// t1��t2��ͬһ���������ʵ�������ã����Կ��ԱȽϣ�
		// ��t1��t2���ò�ͬ�Ķ������Է���false
		System.out.println("t1�Ƿ����t2��" + (t1 == t2));
		// ֱ�ӽ�t1��ֵ����t3������t3ָ��t1ָ��Ķ���
		var t3 = t1;
		// t1��t3ָ��ͬһ���������Է���true
		System.out.println("t1�Ƿ����t3��" + (t1 == t3));
	}
}