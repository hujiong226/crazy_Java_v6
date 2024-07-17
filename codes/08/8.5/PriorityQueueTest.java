
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
public class PriorityQueueTest
{
	public static void main(String[] args)
	{
		var pq = new PriorityQueue();
		// �������������pq�м����ĸ�Ԫ��
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		// ���pq���У������ǰ�Ԫ�صļ���˳������
		System.out.println(pq); // ���[-3, 6, 20, 18]
		// ���ʶ��е�һ��Ԫ�أ���ʵ���Ƕ�������С��Ԫ�أ�-3
		System.out.println(pq.poll());
	}
}