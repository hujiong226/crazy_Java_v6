

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
public class AutoBoxingUnboxing
{
	public static void main(String[] args)
	{
		// ֱ�Ӱ�һ���������ͱ�������Integer����
		Integer inObj = 5;
		// ֱ�Ӱ�һ��boolean���ͱ�������һ��Object���͵ı���
		Object boolObj = true;
		// ֱ�Ӱ�һ��Integer���󸳸�int���͵ı���
		int it = inObj;
		if (boolObj instanceof Boolean boolWrap)
		{
			// ��Boolean���͵ı�������boolean����
			boolean b = boolWrap;
			System.out.println(b);
		}
	}
}
