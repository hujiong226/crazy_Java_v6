
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
record Name(String first, String last)
{
	public Name
	{
		// 对first和last两个组件进行验证
		if (first.length() > 6 || last.length() > 4)
		{
			// 验证失败时抛出异常，避免创建不符合规定的Name对象
			throw new IllegalArgumentException(
				"名不能超过6个字符，且姓不能超过4个字符");
		}
	}
}
public class RedefineConstructor2
{
	public static void main(String[] args)
	{
		var name1 = new Name("悟空", "孙");
		System.out.println(name1);
		// 创建Name失败
		var name2 = new Name("悟空", "疯狂Java"); // ①
	}
}