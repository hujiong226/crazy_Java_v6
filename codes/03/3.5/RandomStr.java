

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
public class RandomStr
{
	public static void main(String[] args)
	{
		// ����һ�����ַ���
		var result = "";
		// ����6��ѭ��
		for (var i = 0; i < 6; i++)
		{
			// ����һ��97��122��int�͵�����
			var intVal = (int) (Math.random() * 26 + 97);
			// ��intValueǿ��ת��Ϊchar�����ӵ�result����
			result = result + (char) intVal;
		}
		// �������ַ���
		System.out.println(result);
	}
}