

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
public class ConstructorTest
{
	public String name;
	public int count;
	// �ṩ�Զ���Ĺ��������ù�����������������
	public ConstructorTest(String name, int count)
	{
		// ���������this���������г�ʼ���Ķ���
		// �������д��뽫�����2����������this���������name��countʵ������
		this.name = name;
		this.count = count;
	}
	public static void main(String[] args)
	{
		// ʹ���Զ���Ĺ���������������
		// ϵͳ����Ըö���ִ���Զ���ĳ�ʼ��
		var tc = new ConstructorTest("���Java����", 90000);
		// ���ConstructorTest�����name��count����ʵ������
		System.out.println(tc.name);
		System.out.println(tc.count);
	}
}
