
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
	private static String str = "fkjava";
	private int foo;
	public void test()
	{
		int bar = 2;
		// 下面局部Record不能用static修饰，但它依然是隐式静态的
		record Address(String detail, String zip)
		{
			public void test()
			{
				System.out.println(str);
				// 下面两行代码编译时报错
				System.out.println(foo); // ①
				System.out.println(bar); // ②
			}
		}
	}
}