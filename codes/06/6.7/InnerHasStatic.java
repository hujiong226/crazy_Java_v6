

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
public class InnerHasStatic
{
	private class InnerClass
	{
        // ��Java 16��ʼ������������̬������ȫ�Ϸ�
		static
		{
			System.out.println("==========");
		}
		private static int inProp;
		private static void test(){}
	}
}
