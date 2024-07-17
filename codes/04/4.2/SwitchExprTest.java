

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
public class SwitchExprTest
{
	public static void main(String[] args)
	{
		// ��������score����Ϊ�丳ֵΪ'C'
		var score = 'C';
		// ��switch���ʽ��ֵ��ֵ������
		var judge = switch (score)
		{
			// case��ļ�ͷ����һ�����ʽ
			case 'A', 'B' -> "�ɼ�������ϣ����������";
			case 'C', 'D', 'F' -> "�ɼ����㣬����Ŭ����";
			default -> "�ɼ��������";
		};
		System.out.println(judge);

		var judge2 = switch (score)
		{
			// case��Ĵ�����ж�����䣬ʹ��yield����ֵ
			case 'A', 'B' -> {
				System.out.println("�ɼ�������ϣ����������");
				yield "����";
			}
			// case��Ĵ�����ж�����䣬ʹ��yield����ֵ
			case 'C', 'D', 'F' -> {
				System.out.println("�ɼ����㣬����Ŭ����");
				yield "����";
			}
			default -> "�ɼ��������";
		};
		System.out.println(judge2);

		var judge3 = switch (score)
		{
			// case��Ĵ�����ж�����䣬ʹ��yield����ֵ
			case 'A', 'B':
				System.out.println("�ɼ�������ϣ����������");
				yield "����";
			// ��ͳcase��ʹֻ��һ����䣬Ҳ��Ҫʹ��yield����ֵ
			case 'C', 'D', 'F':
				yield "����";
			default:
				yield "�ɼ��������";
		};
		System.out.println(judge3);
	}
}
