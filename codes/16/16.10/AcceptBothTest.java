
import java.util.concurrent.*;
import java.util.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2023, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks<br>
 * @version 1.0
 */
public class AcceptBothTest
{
	public static void main(String[] args) throws InterruptedException
	{
		// �����з���ֵ��CompletableFuture
		var future1 = CompletableFuture.supplyAsync(() -> {
			for (var i = 0; i < 100; i++ )
			{
				System.out.println("��ǰ�߳�:" + Thread.currentThread()
					.getName() + ":" + i);
			}
			return 100;
		});
		CompletableFuture.supplyAsync(() -> {
			for (var i = 0; i < 100; i++ )
			{
				System.out.println("��ǰ�߳�:" + Thread.currentThread()
					.getName() + ":" + i);
			}
			return "fkjava";
		// �õ�ǰCompletableFuture���future1����
		// �������������ʱ��ִ�е�2�����������action��BiConsumer��
		// ��ǰ����ķ���ֵ��future1�ķ���ֵ���δ���rvt1��rvt2��������
		}).thenAcceptBoth(future1, (rvt1, rvt2) -> {
			System.out.println("��1�����񷵻�ֵ��" + rvt1);
			System.out.println("��2�����񷵻�ֵ��" + rvt2);
		});
		// ���̵߳Ĵ���
		for (var i = 0; i < 100; i++ )
		{
			System.out.println("��ǰ�߳�:" + Thread.currentThread()
				.getName() + ":" + i);
		}
		// ���߳���ͣ500�룬��ȷ��CompletableFuture������߳���ִ�����
		Thread.sleep(500);
	}
}
