
import java.util.*;
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
enum Season
{
	SPRING,SUMMER,FALL,WINTER
}
public class EnumSetTest
{
	public static void main(String[] args)
	{
		// ����һ��EnumSet���ϣ�����Ԫ�ؾ���Seasonö�����ȫ��ö��ֵ
		var es1 = EnumSet.allOf(Season.class);
		System.out.println(es1); // ���[SPRING, SUMMER, FALL, WINTER]
		// ����һ��EnumSet�ռ��ϣ�ָ���伯��Ԫ����Season���ö��ֵ��
		var es2 = EnumSet.noneOf(Season.class);
		System.out.println(es2); // ���[]
		// �ֶ���������Ԫ��
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
		System.out.println(es2); // ���[SPRING, WINTER]
		// ��ָ��ö��ֵ����EnumSet����
		var es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
		System.out.println(es3); // ���[SUMMER, WINTER]
		var es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println(es4); // ���[SUMMER, FALL, WINTER]
		// �´�����EnumSet���ϵ�Ԫ�غ�es4���ϵ�Ԫ������ͬ���ͣ�
		// es5�ļ���Ԫ�� + es4����Ԫ�� = Seasonö�����ȫ��ö��ֵ
		var es5 = EnumSet.complementOf(es4);
		System.out.println(es5); // ���[SPRING]
	}
}