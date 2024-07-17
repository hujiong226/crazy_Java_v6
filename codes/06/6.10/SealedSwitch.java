
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
sealed class Shape permits Triangle, Rectangle {}
final class Triangle extends Shape
{
	public void info()
	{
		System.out.println("三角形");
	}
}
final class Rectangle extends Shape
{
	public void area()
	{
		System.out.println("面积等于长乘以高");
	}
}
public class SealedSwitch
{
	public static void test(Shape s)
	{
		// 对Shape执行模式匹配
		switch(s)
		{
			// 使用case可以覆盖所有可能的Shape类型及其后代类，
			// 因此可以无需default分支
			case Rectangle rect -> rect.area();
			case Triangle tri -> tri.info();
			case Shape shape -> System.out.println("通用Shape");
		}
	}
	public static void main(String[] args)
	{
		test(new Triangle());
		test(new Rectangle());
	}
}