
import java.util.Arrays;
import java.util.function.*;
import java.util.stream.*;
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
public class ArraysTest2
{
	public static void main(String[] args)
	{
		var arr1 = new int[] {3, -4, 25, 16, 30, 18};
		// ������arr1���в�������
		Arrays.parallelSort(arr1);
		System.out.println(Arrays.toString(arr1));
		var arr2 = new int[] {3, -4, 25, 16, 30, 18};
		Arrays.parallelPrefix(arr2, new IntBinaryOperator()
		{
			// left������������ǰһ����������Ԫ�أ�right����ԭ�����е�ǰ��������Ԫ��
			// ������ĵ�һ��Ԫ���ܵ���ԭ�����һ��Ԫ��
			public int applyAsInt(int left, int right)
			{
				return left * right;
			}
		});
		System.out.println(Arrays.toString(arr2));
		var arr3 = new int[5];
		Arrays.parallelSetAll(arr3, new IntUnaryOperator()
		{
			// operand�������ڼ����Ԫ������
			public int applyAsInt(int operand)
			{
				return operand * 5;
			}
		});
		System.out.println(Arrays.toString(arr3));
		// ��arr3����ת����IntStream
		IntStream arr3Stream = Arrays.stream(arr3);
		// ��arr3Stream���й��ˣ�ֻ������ֵ����10��Ԫ��
		int result = arr3Stream.filter(new IntPredicate()
		{
			public boolean test(int ele)
			{
				return ele > 10;
			}
		}).sum(); // �����ܺ�
		System.out.println(result);
	}
}
