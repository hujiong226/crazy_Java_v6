

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
public class CrazyitObjectFactory
{
	public static Object getInstance(String clsName)
	{
		try
		{
			// ����ָ�����Ӧ��Class����
			Class cls = Class.forName(clsName);
			// ����ʹ�ø�Class������������ʵ��
			return cls.getConstructor().newInstance();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}