

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
public class FinalLocalVariableTest
{
	public void test(final int a)
	{
		// ���ܶ�final���ε��βθ�ֵ���������Ƿ�
		// a = 5;
	}
	public static void main(String[] args)
	{
		// ����final�ֲ�����ʱָ��Ĭ��ֵ����str�����޷����¸�ֵ
		final var str = "hello";
		// ���渳ֵ���Ƿ�
		// str = "Java";
		// ����final�ֲ�����ʱû��ָ��Ĭ��ֵ����d�����ɱ���ֵһ��
		final double d;
		// ��һ�θ���ʼֵ���ɹ�
		d = 5.6;
		// ��final�����ظ���ֵ���������Ƿ�
//		d = 3.4;
	}
}