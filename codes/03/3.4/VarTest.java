

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks
 * @version 6.0
 */
public class VarTest
{
	public static void main(String[] args)
	{
		var a = 20;  // ������ֵΪ20�����a��������int
		System.out.println(a);
//		a = 1.6; // ���д���ᱨ���������ݵ�����
		var b = 3.4; // ������ֵΪ3.4�����b��������double
		System.out.println(b);
		var c = (byte) 13; // ����ֵΪ (byte) 13�����c��������byte
		System.out.println(c);
//		c = a; // ���д���ᱨ���������ݵ�����
//		var d; // ���д��뱨�����޷��ƶϾֲ����� d ������

		var st = "Hello"; // ����ֵΪ"Hello"�����st��������String
//		st = 5; // ���д���ᱨ���������ݵ�����
	}
}