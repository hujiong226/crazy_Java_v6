
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
public class ErrorUtils
{
	@SafeVarargs
	public static void faultyMethod(List<String>... listStrArray)
	{
		// Java���Բ����������������飬���listArrayֻ�ܱ�����List[]����
		// ��ʱ�൱�ڰ�List<String>������List���Ѿ������ˡ�������
		List[] listArray = listStrArray;
		List<Integer> myList = new ArrayList<>();
		myList.add(new Random().nextInt(100));
		// ��listArray�ĵ�һ��Ԫ�ظ�ΪmyList
		listArray[0] = myList;
		String s = listStrArray[0].get(0);
	}
}