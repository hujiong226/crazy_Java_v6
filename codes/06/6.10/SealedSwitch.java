
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2023, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks<br>
 * @version 1.0
 */
sealed class Shape permits Triangle, Rectangle {}
final class Triangle extends Shape
{
	public void info()
	{
		System.out.println("������");
	}
}
final class Rectangle extends Shape
{
	public void area()
	{
		System.out.println("������ڳ����Ը�");
	}
}
public class SealedSwitch
{
	public static void test(Shape s)
	{
		// ��Shapeִ��ģʽƥ��
		switch(s)
		{
			// ʹ��case���Ը������п��ܵ�Shape���ͼ������࣬
			// ��˿�������default��֧
			case Rectangle rect -> rect.area();
			case Triangle tri -> tri.info();
			case Shape shape -> System.out.println("ͨ��Shape");
		}
	}
	public static void main(String[] args)
	{
		test(new Triangle());
		test(new Rectangle());
	}
}