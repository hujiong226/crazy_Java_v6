

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
public class ArrayInRam
{
	public static void main(String[] args)
	{
		// ���岢��ʼ�����飬ʹ�þ�̬��ʼ��
		int[] a = {5, 7, 20};
		// ���岢��ʼ�����飬ʹ�ö�̬��ʼ��
		var b = new int[4];
		// ���b����ĳ���
		System.out.println("b����ĳ���Ϊ��" + b.length);
		// ѭ�����a�����Ԫ��
		for (int i = 0, len = a.length; i < len; i++)
		{
			System.out.println(a[i]);
		}
		// ѭ�����b�����Ԫ��
		for (int i = 0, len = b.length; i < len; i++)
		{
			System.out.println(b[i]);
		}
		// ��Ϊa��int[]���ͣ�bҲ��int[]���ͣ����Կ��Խ�a��ֵ����b��
		// Ҳ������b����ָ��a����ָ�������
		b = a;
		// �ٴ����b����ĳ���
		System.out.println("b����ĳ���Ϊ��" + b.length);
	}
}