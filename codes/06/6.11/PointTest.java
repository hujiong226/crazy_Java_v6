
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

final record Point(int x, int y)
{
	// ��Ա����ֻ���������
	private static String color;
	// ��ʼ����ֻ�������ʼ����
	static
	{
		System.out.println("��ʼ����");
	}
	// ���Զ��巽��
	public void info()
	{
		System.out.println("Point��info����");
	}
}
public class PointTest
{
	public static void main(String[] args)
	{
		// �����������������󡣸ù������ɱ������Զ��ṩ
		Point p = new Point(2, 3);
		// �����Զ����ɵ�x()�������൱��getter������
		System.out.println(p.x());
		System.out.println(p);
	}
}