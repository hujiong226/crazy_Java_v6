
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
public class LinkedHashMapTest
{
	public static void main(String[] args)
	{
		var scores = new LinkedHashMap();
		scores.put("����", 80);
		scores.put("Ӣ��", 82);
		scores.put("��ѧ", 76);
		// ����forEach��������scores�������key-value��
		scores.forEach((key, value) -> System.out.println(key + "-->" + value));
	}
}