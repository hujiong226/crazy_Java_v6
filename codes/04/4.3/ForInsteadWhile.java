

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
public class ForInsteadWhile
{
	public static void main(String[] args)
	{
		// ��forѭ���ĳ�ʼ�������������������
		var count = 0;
		// forѭ����ֻ��ѭ������
		for ( ; count < 10; )
		{
			System.out.println(count);
			// ��ѭ���������ַ���ѭ����֮����
			count++;
		}
		System.out.println("ѭ������!");
		// �˴��������Է���count����
	}
}