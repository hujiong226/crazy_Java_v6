

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
public class NewSwitchTest
{
	public static void main(String[] args)
	{
		// ��������score����Ϊ�丳ֵΪ'C'
		var score = 'C';
		// ִ��swicth��֧���
		switch (score)
		{
			// case��Ĵ�����ж�����䣬����ʡ�Ի�����
			case 'A', 'B' -> {
				System.out.println("�ɼ�������ϣ����������");
				System.out.println("��������䷢��״");
			}
			// case��Ĵ����ֻ��һ����䣬ʡ�Ի�����
			case 'C', 'D', 'F' -> System.out.println("�ɼ����㣬����Ŭ����");
			default -> System.out.println("�ɼ��������");
		}
	}
}
