

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
public class AutoConversion
{
	public static void main(String[] args)
	{
		int a = 6;
		// int�����Զ�ת��Ϊfloat����
		float f = a;
		// ���潫���6.0
		System.out.println(f);
		// ����һ��byte���͵���������
		byte b = 9;
		// ������뽫������byte�Ͳ����Զ�����ת��Ϊchar��
		// char c = b;
		// ������byte�ͱ��������Զ�����ת��Ϊdouble��
		double d = b;
		// ���潫���9.0
		System.out.println(d);
	}
}
