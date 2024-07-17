

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
public class PatternVarScope
{
	public static void main(String[] args)
	{
		Object obj = "疯狂spring Boot终极讲义";
		if (obj instanceof PatternVarScope ps)
		{
			System.out.println(ps);
			// 变量ps的作用域仅到此处有效
		}
		// 变量ps到此处已不可访问，因此下面可以重新声明变量s
		if (obj instanceof String ps)
		{
			System.out.println(ps.toUpperCase());
		}
	}
}
