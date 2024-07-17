

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
		switchMatch.test(new Triangle(120.4));  // ��
		switchMatch.test(new Rectangle());     // ��
		switchMatch.test(null);
	}

//	public void test(Shape s)
//	{
//		switch (s)
//		{
//			// case����ֻ���ж�s��ֵ�������ж�s������
//			case Triangle t -> System.out.println(s + "��������");
//			case Rectangle r -> System.out.println(r + "�Ǿ���");
//			default -> System.out.println("����ͼ��");
//		}
//	}

//	public void test(Shape s)
//	{
//		switch (s)
//		{
//			case Triangle t:
//				System.out.println(s + "��������");
//				break;
//			case Rectangle r:
//				System.out.println(r + "�Ǿ���");
//				break;
//			default:
//				System.out.println("����ͼ��");
//		}
//	}

//	public void test(Shape s)
//	{
//		switch (s)
//		{
//			// �ж�Shape����֮�󣬺���Ͳ������ж�Shape������
//			case Shape sh -> System.out.println(sh  + "����ͨ��״");
//			case Rectangle r -> System.out.println(r + "�Ǿ���");
//			default -> System.out.println("����ͼ��");
//		}
//	}

//	public void test(Shape s)
//	{
//		switch (s)
//		{
//			// ʹ��case��֧������ʽΪnull�����
//			case null -> System.out.println("sΪnull");
//			case Triangle t -> System.out.println(s + "��������");
//			case Rectangle r -> System.out.println(r + "�Ǿ���");
//			default -> System.out.println("����ͼ��");  // ��
//		}
//	}

public void test(Shape s)
{
	switch (s)
	{
		// ʹ��case��֧������ʽΪnull�����
		case null -> System.out.println("sΪnull");
		case Triangle t && t.area > 100 -> System.out.println(s + "�Ǵ�������");
		case Triangle t -> System.out.println(s + "��С������");
		case Rectangle r -> System.out.println(r + "�Ǿ���");
		default -> System.out.println("����ͼ��");
	}
}


}
