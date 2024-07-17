

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
class Shape {}
class Triangle extends Shape
{
	double area;
	public Triangle(double area)
	{
		this.area = area;
	}
}
class Rectangle extends Shape {}
public class SwitchMatch
{
	public static void main(String[] args)
	{
		var switchMatch = new SwitchMatch();
		switchMatch.test(new Triangle(120.4));  // ①
		switchMatch.test(new Rectangle());     // ②
		switchMatch.test(null);
	}

//	public void test(Shape s)
//	{
//		switch (s)
//		{
//			// case不再只是判断s的值，而是判断s的类型
//			case Triangle t -> System.out.println(s + "是三角形");
//			case Rectangle r -> System.out.println(r + "是矩形");
//			default -> System.out.println("其他图形");
//		}
//	}

//	public void test(Shape s)
//	{
//		switch (s)
//		{
//			case Triangle t:
//				System.out.println(s + "是三角形");
//				break;
//			case Rectangle r:
//				System.out.println(r + "是矩形");
//				break;
//			default:
//				System.out.println("其他图形");
//		}
//	}

//	public void test(Shape s)
//	{
//		switch (s)
//		{
//			// 判断Shape类型之后，后面就不能再判断Shape的子类
//			case Shape sh -> System.out.println(sh  + "是普通形状");
//			case Rectangle r -> System.out.println(r + "是矩形");
//			default -> System.out.println("其他图形");
//		}
//	}

//	public void test(Shape s)
//	{
//		switch (s)
//		{
//			// 使用case分支处理表达式为null的情况
//			case null -> System.out.println("s为null");
//			case Triangle t -> System.out.println(s + "是三角形");
//			case Rectangle r -> System.out.println(r + "是矩形");
//			default -> System.out.println("其他图形");  // ③
//		}
//	}

public void test(Shape s)
{
	switch (s)
	{
		// 使用case分支处理表达式为null的情况
		case null -> System.out.println("s为null");
		case Triangle t && t.area > 100 -> System.out.println(s + "是大三角形");
		case Triangle t -> System.out.println(s + "是小三角形");
		case Rectangle r -> System.out.println(r + "是矩形");
		default -> System.out.println("其他图形");
	}
}


}
