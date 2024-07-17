
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2023, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks<br>
 * @version 1.0
 */

class Out
{
	private int foo;
	// 下面static修饰符写不写都一样
	public record Address(String detail, String zip)
//	public static record Address(String detail, String zip)
	{
		public void test()
		{
			// 下面代码编译时报错
//			System.out.println(foo); // ①
		}
	}
}
public class InnerRecord
{
	public static void main(String[] args)
	{
		Out.Address addr = new Out.Address("广州天河", "510000");
		System.out.println(addr);
	}
}