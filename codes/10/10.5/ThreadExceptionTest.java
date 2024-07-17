

/**
 * Description:
 * ÍøÕ¾: <a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com ¹«ÖÚºÅ: fkbooks
 * @version 6.0
 */
public class ThreadExceptionTest implements Runnable
{
	public void run()
	{
		firstMethod();
	}
	public void firstMethod()
	{
		secondMethod();
	}
	public void secondMethod()
	{
		var a = 5;
		var b = 0;
		var c = a / b;
	}
	public static void main(String[] args)
	{
		new Thread(new ThreadExceptionTest()).start();
	}
}
