

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
public class Dog
{
	// ����һ��jump()����
	public void jump()
	{
		System.out.println("����ִ��jump����");
	}
	// ����һ��run()������run()������Ҫ����jump()����
	public void run()
	{
//		var d = new Dog();
//		d.jump();
		// ʹ��this���õ���run()�����Ķ���
		this.jump();
		System.out.println("����ִ��run����");
	}
}
