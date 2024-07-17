
import java.util.*;
import java.text.*;
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
public class NumberFormatTest
{
	public static void main(String[] args)
	{
		// ��Ҫ����ʽ��������
		var db = 1234000.567;
		// �����ĸ�Locale���ֱ�����й����ձ����¹�������
		Locale[] locales = {Locale.CHINA, Locale.JAPAN,
			Locale.GERMAN, Locale.US};
		var nf = new NumberFormat[16];
		// Ϊ�����ĸ�Locale����16��NumberFormat����
		// ÿ��Locale�ֱ���ͨ����ֵ��ʽ�����ٷֱȸ�ʽ�������Ҹ�ʽ��
		for (var i = 0; i < locales.length; i++)
		{
			nf[i * 4] = NumberFormat.getNumberInstance(locales[i]);
			nf[i * 4 + 1] = NumberFormat.getPercentInstance(locales[i]);
			nf[i * 4 + 2] = NumberFormat.getCurrencyInstance(locales[i]);
			nf[i * 4 + 3] = NumberFormat.getCompactNumberInstance(locales[i],
				NumberFormat.Style.SHORT);
		}
		for (var i = 0; i < locales.length; i++)
		{
			var tip = i == 0 ? "----�й��ĸ�ʽ----" :
				i == 1 ? "----�ձ��ĸ�ʽ----" :
				i == 2 ? "----�¹��ĸ�ʽ----" :"----�����ĸ�ʽ----";
			System.out.println(tip);
			System.out.println("ͨ����ֵ��ʽ��"
				+ nf[i * 4].format(db));
			System.out.println("�ٷֱ���ֵ��ʽ��"
				+ nf[i * 4 + 1].format(db));
			System.out.println("������ֵ��ʽ��"
				+ nf[i * 4 + 2].format(db));
			System.out.println("������ֵ��ʽ��"
				+ nf[i * 4 + 3].format(db));
		}
	}
}

