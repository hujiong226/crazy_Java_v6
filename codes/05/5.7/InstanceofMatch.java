

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
public class InstanceofMatch
{
	public static void main(String[] args)
	{
		Object obj = "疯狂Spring Boot终极讲义";
		// 传统instanceof的用法：先判断类型、再做类型转换
		if (obj instanceof String)
		{
			String s = (String) obj;
			System.out.println(s.toUpperCase());
		}
		// 模式匹配的instanceof：同时进行类型判断和类型转换
		if (obj instanceof String s)
		{
			System.out.println(s.toUpperCase());
		}
	}
}
