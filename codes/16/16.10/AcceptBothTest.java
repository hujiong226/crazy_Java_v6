
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
public class AcceptBothTest
{
	public static void main(String[] args) throws InterruptedException
	{
		// 定义有返回值的CompletableFuture
		var future1 = CompletableFuture.supplyAsync(() -> {
			for (var i = 0; i < 100; i++ )
			{
				System.out.println("当前线程:" + Thread.currentThread()
					.getName() + ":" + i);
			}
			return 100;
		});
		CompletableFuture.supplyAsync(() -> {
			for (var i = 0; i < 100; i++ )
			{
				System.out.println("当前线程:" + Thread.currentThread()
					.getName() + ":" + i);
			}
			return "fkjava";
		// 用当前CompletableFuture组合future1任务，
		// 当两个任务都完成时，执行第2个参数代表的action（BiConsumer）
		// 当前任务的返回值、future1的返回值依次传给rvt1、rvt2两个参数
		}).thenAcceptBoth(future1, (rvt1, rvt2) -> {
			System.out.println("第1个任务返回值：" + rvt1);
			System.out.println("第2个任务返回值：" + rvt2);
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
