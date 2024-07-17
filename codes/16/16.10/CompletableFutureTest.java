
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
public class CompletableFutureTest
{
	public static void main(String[] args) throws InterruptedException
	{
		// �����з���ֵ��CompletableFuture
		CompletableFuture.supplyAsync(() -> {
			for (var i = 0; i < 100; i++ )
			{
				System.out.println("��ǰ�߳�:" + Thread.currentThread()
					.getName() + ":" + i);
			}
			return 100;
		// ���߳����ʱ�ص�����whenComplete()������action
		}).whenComplete((result, ex) -> {
			// result�������߳���ɺ�ķ���ֵ
			System.out.println(result);
			// ex�������߳�ִ��ʱ�������쳣
			ex.printStackTrace();
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
