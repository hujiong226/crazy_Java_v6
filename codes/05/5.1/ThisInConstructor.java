

/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks
 * @version 6.0
 */
public class ThisInConstructor
{
	// ����һ����Ϊfoo�ĳ�Ա����
	public int foo;
	public ThisInConstructor()
	{
		// �ڹ������ﶨ��һ��foo����
		int foo = 0;
		// ʹ��this�����ù��������ڳ�ʼ���Ķ���
		// ����Ĵ��뽫��Ѹù��������ڳ�ʼ���Ķ����foo��Ա������Ϊ6��
		this.foo = 6;
	}
	public static void main(String[] args)
	{
		// ����ʹ��ThisInConstructor�����Ķ����foo��Ա����
		// ��������Ϊ6������������뽫���6��
		System.out.println(new ThisInConstructor().foo);
	}
}