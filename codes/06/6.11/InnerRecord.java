
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
	private int foo;
	// ����static���η�д��д��һ��
	public record Address(String detail, String zip)
//	public static record Address(String detail, String zip)
	{
		public void test()
		{
			// ����������ʱ����
//			System.out.println(foo); // ��
		}
	}
}
public class InnerRecord
{
	public static void main(String[] args)
	{
		Out.Address addr = new Out.Address("�������", "510000");
		System.out.println(addr);
	}
}