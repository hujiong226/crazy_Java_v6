
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
record MyRecord(int x, int y)
{
	// 新增的构造器
	public MyRecord(int x, int y, String color)  // ①
	{
		// 直接调用系统为MyRecord生成的带int、int参数的构造器
		this(x, y);
	}
	// 新增的构造器
	public MyRecord()
	{
		// 直接调用①号构造器，
		// 间接调用了系统为MyRecord生成的带int、int、String参数的构造器
		this(2, 3, "clear");
	}
}
public class RecordConstructor
{
	public static void main(String[] args)
	{
		// 调用系统生成的带int、int参数的构造器创建实例
		var mr1 = new MyRecord(4, 5);
		System.out.println(mr1);
		// 调用自己定义的、无参的构造器创建实例
		var mr2 = new MyRecord();
		System.out.println(mr2);
		// 调用自己定义的、带3个参数的构造器创建实例
		var mr3 = new MyRecord(7, 8, "red");
		System.out.println(mr3);
	}
}