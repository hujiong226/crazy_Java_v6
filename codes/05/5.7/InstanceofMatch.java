

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2023, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks<br>
 * @version 1.0
 */
public class InstanceofMatch
{
	public static void main(String[] args)
	{
		Object obj = "���Spring Boot�ռ�����";
		// ��ͳinstanceof���÷������ж����͡���������ת��
		if (obj instanceof String)
		{
			String s = (String) obj;
			System.out.println(s.toUpperCase());
		}
		// ģʽƥ���instanceof��ͬʱ���������жϺ�����ת��
		if (obj instanceof String s)
		{
			System.out.println(s.toUpperCase());
		}
	}
}
