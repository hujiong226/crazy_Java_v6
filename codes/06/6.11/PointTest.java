
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

final record Point(int x, int y)
{
	// 成员变量只能是类变量
	private static String color;
	// 初始化块只能是类初始化块
	static
	{
		System.out.println("初始化快");
	}
	// 可以定义方法
	public void info()
	{
		System.out.println("Point的info方法");
	}
}
public class PointTest
{
	public static void main(String[] args)
	{
		// 声明变量、创建对象。该构造器由编译器自动提供
		Point p = new Point(2, 3);
		// 调用自动生成的x()方法（相当于getter方法）
		System.out.println(p.x());
		System.out.println(p);
	}
}