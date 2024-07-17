
import java.lang.reflect.*;
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
public class ProcessorTest
{
	public static void process(String clazz)
		throws ClassNotFoundException
	{
		var passed = 0;
		var failed = 0;
		// ����clazz��Ӧ����������з���
		for (Method m : Class.forName(clazz).getMethods())
		{
			// ����÷���ʹ����@Testable����
			if (m.isAnnotationPresent(Testable.class))
			{
				try
				{
					// ����m����
					m.invoke(null);
					// ���Գɹ���passed��������1
					passed++;
				}
				catch (Exception ex)
				{
					System.out.println("����" + m + "����ʧ�ܣ��쳣��"
						+ ex.getCause());
					// ���Գ����쳣��failed��������1
					failed++;
				}
			}
		}
		// ͳ�Ʋ��Խ��
		System.out.println("��������:" + (passed + failed)
			+ "�����������У�\n" + "ʧ����:" + failed + "����\n"
			+ "�ɹ���:" + passed + "����");
	}
}
