

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
public class CaseBlockTest
{
	public static void main(String[] args)
	{
		// ��������season
		var season = "����";
		// ִ��switch��֧���
		switch (season)
		{
			case "����", "����" -> {
				System.out.println("���Ĳ��Ƕ�����.");
				// ����count�������ñ������ڸ�case������Ч
				int count = 20;
				System.out.println(count);
			}
			case "����", "����" -> {
			   System.out.println("�����Ӭ������.");
				// �ٴζ���count������������ǰ���count������ͻ
				int count = 30;
				System.out.println(count);
			}
			default -> {
				System.out.println("����ֻ�õ�����!");
//				System.out.println(count); // �����Ҳ���count����
			}
		}
//		System.out.println(count); // �����Ҳ���count����
	}
}
