

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
class Apple<T extends Number>
{
	T size;
	public Apple()
	{
	}
	public Apple(T size)
	{
		this.size = size;
	}
	public void setSize(T size)
	{
		this.size = size;
	}
	public T getSize()
	{
		return this.size;
	}
}
public class ErasureTest
{
	public static void main(String[] args)
	{
		Apple<Integer> a = new Apple<>(6);    // ��
		// a��getSize��������Integer����
		Integer as = a.getSize();
		// ��a���󸳸�Apple��������ʧ���������������Ϣ
		Apple b = a;      // ��
		// bֻ֪��size��������Number
		Number size1 = b.getSize();
		// �����������������
//		Integer size2 = b.getSize();  // ��
	}
}