
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
public class TreeSetTest
{
	public static void main(String[] args)
	{
		// Comparator��ʵ��������TreeSet��Ԫ�����͵ĸ��࣬����Ҫ��
		TreeSet<String> ts1 = new TreeSet<>(
			new Comparator<Object>()
		{
			public int compare(Object fst, Object snd)
			{
				return fst.hashCode() > snd.hashCode() ? 1
					: fst.hashCode() < snd.hashCode() ? -1 : 0;
			}
		});
		ts1.add("hello");
		ts1.add("wa");
		// Comparator��ʵ��������TreeSetԪ�ص����ͣ�����Ҫ��
		TreeSet<String> ts2 = new TreeSet<>(
			new Comparator<String>()
		{
			public int compare(String first, String second)
			{
				return first.length() > second.length() ? -1
					: first.length() < second.length() ? 1 : 0;
			}
		});
		ts2.add("hello");
		ts2.add("wa");
		System.out.println(ts1);
		System.out.println(ts2);
	}
}
