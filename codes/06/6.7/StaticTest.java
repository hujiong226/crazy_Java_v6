

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
public class StaticTest
{
	// ����һ���Ǿ�̬���ڲ��࣬��һ������
	private class In{}
	// �ⲿ��ľ�̬����
	public static void main(String[] args)
	{
		// ����������������쳣����Ϊ��̬��Ա��main()������
		// �޷����ʷǾ�̬��Ա��In�ࣩ
		new In();
	}
}