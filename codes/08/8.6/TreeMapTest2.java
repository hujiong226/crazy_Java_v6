
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
public class TreeMapTest2
{
	public static void main(String[] args)
	{
		var tm = new TreeMap();
		tm.put("���Java����", 139.0);
		tm.put("������Java Web��ҵӦ��ʵս", 128.0);
		tm.put("���Spring Boot�ռ�����", 169.0);
		// Ϊ�ض�key-value����value
		tm.computeIfPresent("���Java����", (key, value) -> {
			double doubleVal = (double) value;
			return (doubleVal > 130) ? doubleVal * 0.8 : doubleVal * 0.9;
		});
		System.out.println(tm);
		// �������������쳣
		tm.computeIfAbsent("���iOS����", (key) -> {
			// �޸�Map
			tm.put("���Python����", 129.0);  // ��
			return 103.3;
		});
	}
}