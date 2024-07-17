

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
public class BlockStrTest
{
	public static void main(String[] args)
	{
		// 定义一段JSON字符串
		var user = "{\n"
			+ "  'name': 'yeeku',\n"
			+ "  'age': 25\n"
			+ "}\n";
		System.out.println(user);
		// 使用块字符串JSON字符串
		var user1 = """
			{
			  'name': 'yeeku',
			  'age': 25
			}
			""";
		System.out.println(user1);
	}
}
