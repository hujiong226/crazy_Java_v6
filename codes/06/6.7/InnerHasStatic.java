

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
public class InnerHasStatic
{
	private class InnerClass
	{
        // 从Java 16开始，下面三个静态声明完全合法
		static
		{
			System.out.println("==========");
		}
		private static int inProp;
		private static void test(){}
	}
}
