

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
public class PatternVarScope
{
	public static void main(String[] args)
	{
		Object obj = "���spring Boot�ռ�����";
		if (obj instanceof PatternVarScope ps)
		{
			System.out.println(ps);
			// ����ps������������˴���Ч
		}
		// ����ps���˴��Ѳ��ɷ��ʣ�����������������������s
		if (obj instanceof String ps)
		{
			System.out.println(ps.toUpperCase());
		}
	}
}
