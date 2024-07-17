

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
public class PatternVarFlow
{
	public static void main(String[] args)
	{
		Object obj = "���spring Boot�ռ�����";
		// &&Ҫ������������Ϊtrue�ŷ���true����˵�Java����s.length() > 5ʱ
		// ǰ���������ȻΪtrue�����s������������Ч�ģ��������������ȷ��
		if (obj instanceof String s && s.length() > 5)
		{
			System.out.println(s.toUpperCase());
		}
		// ||ֻҪ��һ��������Ϊtrue�ͷ���true����˵�Java����s.length() > 5ʱ
		// ǰ���������ȻΪfalse�����s������ʵ�������ڣ�����������뱨��
//		if (obj instanceof String s || s.length() > 5)
//		{
//			System.out.println(s.toUpperCase());
//		}
		Object obj2 = "���Java����";
		// ���obj2�����Ͳ���String�������׳��쳣��ֹ
		if (!(obj2 instanceof String s))
			throw new RuntimeException();
		// �˴����ɷ���ģʽ����s
		System.out.println(s.toUpperCase());   // ��
	}
}
