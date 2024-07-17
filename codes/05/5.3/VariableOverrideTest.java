

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
public class VariableOverrideTest
{
	// ����һ��nameʵ������
	private String name = "���";
	// ����һ��price�����
	private static double price = 78.0;
	// ����������������
	public static void main(String[] args)
	{
		// ������ľֲ��������ֲ��������ǳ�Ա����
		var price = 65;
		// ֱ�ӷ���price�����������price�ֲ�������ֵ��65
		System.out.println(price);
		// ʹ��������Ϊprice�������޶���
		// �����price�������ֵ��78.0
		System.out.println(VariableOverrideTest.price);
		// ����info����
		new VariableOverrideTest().info();
	}
	public void info()
	{
		// ������ľֲ��������ֲ��������ǳ�Ա����
		var name = "�����";
		// ֱ�ӷ���name�����������name�ֲ�������ֵ��"�����"
		System.out.println(name);
		// ʹ��this����Ϊname�������޶���
		// �����nameʵ��������ֵ��"���"
		System.out.println(this.name);
	}
}
