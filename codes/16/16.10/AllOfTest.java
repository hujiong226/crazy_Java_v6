
import java.util.concurrent.*;
import java.util.*;
import java.util.function.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2023, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks<br>
 * @version 1.0
 */
public class AllOfTest
{
	public static void main(String[] args) throws InterruptedException
	{
		// 定义一个Supplier对象，其返回值为Integer类型
		Supplier<Integer> supplier = () -> {
			for (var i = 0; i < 30; i++ )
			{
				System.out.println("当前线程:" + Thread.currentThread()
					.getName() + ":" + i);
			}
			return 30;
		};
		// 组合3个CompletableFuture，
		// 只有当它们都完成时该CompletableFuture才算完成
		CompletableFuture.allOf(CompletableFuture.supplyAsync(supplier),
			CompletableFuture.supplyAsync(supplier),
			CompletableFuture.supplyAsync(supplier))
			.thenRun(() -> System.out.println("所有任务完成"));
		// 主线程的代码
		for (var i = 0; i < 100; i++ )
		{
			System.out.println("当前线程:" + Thread.currentThread()
				.getName() + ":" + i);
		}
		// 让线程暂停500秒，以确保CompletableFuture代表的线程能执行完成
		Thread.sleep(500);
	}
}
