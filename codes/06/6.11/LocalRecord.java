
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
class Out
{
	private static String str = "fkjava";
	private int foo;
	public void test()
	{
		int bar = 2;
		// ����ֲ�Record������static���Σ�������Ȼ����ʽ��̬��
		record Address(String detail, String zip)
		{
			public void test()
			{
				System.out.println(str);
				// �������д������ʱ����
				System.out.println(foo); // ��
				System.out.println(bar); // ��
			}
		}
	}
}