

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
public class Ostrich extends Bird
{
	// ��дBird���fly()����
	public void fly()
	{
		System.out.println("��ֻ���ڵ��ϱ���...");
	}
	public void callOverridedMethod()
	{
		// �����෽����ͨ��super����ʽ���ø��౻���ǵķ�����
		super.fly();
	}

	public static void main(String[] args)
	{
		// ����Ostrich����
		var os = new Ostrich();
		// ִ��Ostrich�����fly()�����������"��ֻ���ڵ��ϱ���..."
		os.fly();
	}
}