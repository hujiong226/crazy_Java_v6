

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
public class AutoBoxingUnboxing
{
	public static void main(String[] args)
	{
		// 直接把一个基本类型变量赋给Integer对象
		Integer inObj = 5;
		// 直接把一个boolean类型变量赋给一个Object类型的变量
		Object boolObj = true;
		// 直接把一个Integer对象赋给int类型的变量
		int it = inObj;
		if (boolObj instanceof Boolean boolWrap)
		{
			// 将Boolean类型的变量赋给boolean变量
			boolean b = boolWrap;
			System.out.println(b);
		}
	}
}
