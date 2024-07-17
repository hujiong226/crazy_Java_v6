
import java.lang.reflect.*;
import java.lang.annotation.*;
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
public class CrazyitArray
{
	// ��Array��newInstance�������а�װ
	@SuppressWarnings("unchecked")
	public static <T> T[] newInstance(Class<T> componentType, int length)
	{
		return (T[]) Array.newInstance(componentType, length);  // ��
	}
	public static void main(String[] args)
	{
		// ʹ��CrazyitArray��newInstance()����һά����
		String[] arr = CrazyitArray.newInstance(String.class, 10);
		// ʹ��CrazyitArray��newInstance()������ά����
		// ����������£�ֻҪ��������Ԫ�ص�������int[]���ɡ�
		int[][] intArr = CrazyitArray.newInstance(int[].class, 5);
		arr[5] = "���Java����";
		// intArr�Ƕ�ά���飬��ʼ��������ĵڶ�������Ԫ��
		// ��ά�����Ԫ�ر�����һά����
		intArr[1] = new int[] {23, 12};
		System.out.println(arr[5]);
		System.out.println(intArr[1][1]);
	}
}