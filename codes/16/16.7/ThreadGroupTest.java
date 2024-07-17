

/**
 * Description:
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks
 * @version 6.0
 */
class MyThread extends Thread
{
	// 提供指定线程名的构造器
	public MyThread(String name)
	{
		super(name);
	}
	// 提供指定线程名、线程组的构造器
	public MyThread(ThreadGroup group, String name)
	{
		super(group, name);
	}
	public void run()
	{
		for (var i = 0; i < 20; i++)
		{
			System.out.println(getName() + " 线程的i变量" + i);
		}
	}
}
public class ThreadGroupTest
{
	public static void main(String[] args)
	{
		// 获取主线程所在的线程组，这是所有线程默认的线程组
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("主线程组的名字："
			+ mainGroup.getName());
		new MyThread("主线程组的线程").start();
		var tg = new ThreadGroup("新线程组");
		var tt = new MyThread(tg, "tg组的线程甲");
		tt.start();
		new MyThread(tg, "tg组的线程乙").start();
	}
}

