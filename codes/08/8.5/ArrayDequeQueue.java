
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
public class ArrayDequeQueue
{
	public static void main(String[] args)
	{
		var queue = new ArrayDeque();
		// ���ν�����Ԫ�ؼ������
		queue.offer("���Java����");
		queue.offer("������Java EE��ҵӦ��ʵս");
		queue.offer("���Android����");
		// �����[���Java����, ������Java EE��ҵӦ��ʵս, ���Android����]
		System.out.println(queue);
		// ���ʶ���ͷ����Ԫ�أ�����������poll������"ջ"����������Java����
		System.out.println(queue.peek());
		// ��Ȼ�����[���Java����, ������Java EE��ҵӦ��ʵս, ���Android����]
		System.out.println(queue);
		// poll����һ��Ԫ�أ���������Java����
		System.out.println(queue.poll());
		// �����[������Java EE��ҵӦ��ʵս, ���Android����]
		System.out.println(queue);
	}
}