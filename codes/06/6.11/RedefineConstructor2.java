
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
record Name(String first, String last)
{
	public Name
	{
		// ��first��last�������������֤
		if (first.length() > 6 || last.length() > 4)
		{
			// ��֤ʧ��ʱ�׳��쳣�����ⴴ�������Ϲ涨��Name����
			throw new IllegalArgumentException(
				"�����ܳ���6���ַ������ղ��ܳ���4���ַ�");
		}
	}
}
public class RedefineConstructor2
{
	public static void main(String[] args)
	{
		var name1 = new Name("���", "��");
		System.out.println(name1);
		// ����Nameʧ��
		var name2 = new Name("���", "���Java"); // ��
	}
}