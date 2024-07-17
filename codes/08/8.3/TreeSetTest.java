
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
		var nums = new TreeSet();
		// ��TreeSet�������ĸ�Integer����
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		// �������Ԫ�أ���������Ԫ���Ѿ���������״̬
		System.out.println(nums);
		// ���������ĵ�һ��Ԫ��
		System.out.println(nums.first()); // ���-9
		// �������������һ��Ԫ��
		System.out.println(nums.last());  // ���10
		// ����С��4���Ӽ���������4
		System.out.println(nums.headSet(4)); // ���[-9, 2]
		// ���ش���5���Ӽ������TreeSet�а���5���Ӽ��л�����5
		System.out.println(nums.tailSet(5)); // ��� [5, 10]
		// ���ش��ڵ���-3��С��4���Ӽ���
		System.out.println(nums.subSet(-3, 4)); // ���[2]
	}
}