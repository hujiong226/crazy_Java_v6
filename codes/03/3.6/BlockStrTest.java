

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
public class BlockStrTest
{
	public static void main(String[] args)
	{
		// ����һ��JSON�ַ���
		var user = "{\n"
			+ "  'name': 'yeeku',\n"
			+ "  'age': 25\n"
			+ "}\n";
		System.out.println(user);
		// ʹ�ÿ��ַ���JSON�ַ���
		var user1 = """
			{
			  'name': 'yeeku',
			  'age': 25
			}
			""";
		System.out.println(user1);
	}
}
