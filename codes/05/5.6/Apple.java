

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
public class Apple extends Fruit
{
	public static void main(String[] args)
	{
		// ����Apple����
		var a = new Apple();
		// Apple������û��weight��Ա����
		// ��ΪApple�ĸ�����weight��Ա������Ҳ���Է���Apple�����weight��Ա����
		a.weight = 56;
		// ����Apple�����info()����
		a.info();
	}
}