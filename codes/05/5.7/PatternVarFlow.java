

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
public class PatternVarFlow
{
	public static void main(String[] args)
	{
		Object obj = "疯狂spring Boot终极讲义";
		// &&要求两个条件都为true才返回true，因此当Java计算s.length() > 5时
		// 前面的条件必然为true，因此s变量必须是有效的，所以下面代码正确。
		if (obj instanceof String s && s.length() > 5)
		{
			System.out.println(s.toUpperCase());
		}
		// ||只要求一个条件都为true就返回true，因此当Java计算s.length() > 5时
		// 前面的条件必然为false，因此s变量其实并不存在，所以下面代码报错。
//		if (obj instanceof String s || s.length() > 5)
//		{
//			System.out.println(s.toUpperCase());
//		}
		Object obj2 = "疯狂Java讲义";
		// 如果obj2的类型不是String，程序抛出异常中止
		if (!(obj2 instanceof String s))
			throw new RuntimeException();
		// 此处还可访问模式变量s
		System.out.println(s.toUpperCase());   // ①
	}
}
