

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
public class RuntimeTest
{
	public static void main(String[] args)
	{
		// ��ȡJava�������������ʱ����
		var rt = Runtime.getRuntime();
		System.out.println("������������"
			+ rt.availableProcessors());
		System.out.println("�����ڴ�����"
			+ rt.freeMemory());
		System.out.println("���ڴ�����"
			+ rt.totalMemory());
		System.out.println("��������ڴ�����"
			+ rt.maxMemory());
	}
}