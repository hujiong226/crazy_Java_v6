
import java.util.concurrent.*;
import java.util.*;
import java.util.function.*;
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
public class AllOfTest
{
	public static void main(String[] args) throws InterruptedException
	{
		// ����һ��Supplier�����䷵��ֵΪInteger����
		Supplier<Integer> supplier = () -> {
			for (var i = 0; i < 30; i++ )
			{
				System.out.println("��ǰ�߳�:" + Thread.currentThread()
					.getName() + ":" + i);
			}
			return 30;
		};
		// ���3��CompletableFuture��
		// ֻ�е����Ƕ����ʱ��CompletableFuture�������
		CompletableFuture.allOf(CompletableFuture.supplyAsync(supplier),
			CompletableFuture.supplyAsync(supplier),
			CompletableFuture.supplyAsync(supplier))
			.thenRun(() -> System.out.println("�����������"));
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
