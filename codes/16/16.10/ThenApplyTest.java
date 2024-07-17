
import java.util.concurrent.*;
import java.util.*;
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
public class ThenApplyTest
{
	public static void main(String[] args) throws InterruptedException
	{
		// 生成有返回值的CompletableFuture
		CompletableFuture.supplyAsync(() -> {
			for (var i = 0; i < 100; i++ )
			{
				System.out.println("当前线程:" + Thread.currentThread()
					.getName() + ":" + i);
			}
			return 100;
		// 消费第一个任务的执行结果，rvt代表第一个任务的返回值
		}).thenApplyAsync(rvt -> {
			for (var i = 0; i < 100; i++ )
			{
				System.out.println("当前线程:" + Thread.currentThread()
					.getName() + ":" + (i + rvt));
			}
			return rvt + 100;
		}, Executors.newCachedThreadPool() /* 使用自定义线程池 */)
		.whenComplete((result, ex) -> {
			// result代表了线程完成后的返回值
			System.out.println(result);
			// ex代表了线程执行时引发的异常
			ex.printStackTrace();
		});
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
