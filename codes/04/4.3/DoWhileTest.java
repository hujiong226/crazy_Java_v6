

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
public class DoWhileTest
{
	public static void main(String[] args)
	{
		// �������count
		var count = 1;
		// ִ��do whileѭ��
		do
		{
			System.out.println(count);
			// ѭ���������
			count++;
			// ѭ����������while�ؼ���
		} while (count < 10);
		System.out.println("ѭ������!");

		// �������count2
		var count2 = 20;
		// ִ��do whileѭ��
		do
			// ���д����ѭ����͵������ֺϲ�����һ�д���
			System.out.println(count2++);
		while (count2 < 10);
		System.out.println("ѭ������!");
	}
}