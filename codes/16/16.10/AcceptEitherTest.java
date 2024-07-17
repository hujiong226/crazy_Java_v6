
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
public class AcceptEitherTest
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
			return 200;
		// �õ�ǰCompletableFuture���future1����
		// ��ĳһ���������ʱ��ִ�е�2�����������action��Consumer��
		// ���������ķ���ֵ����rvt����
		}).acceptEither(future1, rvt -> {
			System.out.println("��������񷵻�ֵ��" + rvt);
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
