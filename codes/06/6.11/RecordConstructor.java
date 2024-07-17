
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
record MyRecord(int x, int y)
{
	// �����Ĺ�����
	public MyRecord(int x, int y, String color)  // ��
	{
		// ֱ�ӵ���ϵͳΪMyRecord���ɵĴ�int��int�����Ĺ�����
		this(x, y);
	}
	// �����Ĺ�����
	public MyRecord()
	{
		// ֱ�ӵ��âٺŹ�������
		// ��ӵ�����ϵͳΪMyRecord���ɵĴ�int��int��String�����Ĺ�����
		this(2, 3, "clear");
	}
}
public class RecordConstructor
{
	public static void main(String[] args)
	{
		// ����ϵͳ���ɵĴ�int��int�����Ĺ���������ʵ��
		var mr1 = new MyRecord(4, 5);
		System.out.println(mr1);
		// �����Լ�����ġ��޲εĹ���������ʵ��
		var mr2 = new MyRecord();
		System.out.println(mr2);
		// �����Լ�����ġ���3�������Ĺ���������ʵ��
		var mr3 = new MyRecord(7, 8, "red");
		System.out.println(mr3);
	}
}