

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
class Base
{
	public Base()
	{
		test();
	}
	public void test()           // �ٺ�test()����
	{
		System.out.println("����������д�ķ���");
	}
}
public class Sub extends Base
{
	private String name;
	public void test()         // �ں�test()����
	{
		System.out.println("������д����ķ�����"
			+ "��name�ַ�������" + name.length());
	}
	public static void main(String[] args)
	{
		// ��������������ָ���쳣
		var s = new Sub();
	}
}