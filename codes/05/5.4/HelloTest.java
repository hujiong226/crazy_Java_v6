
package lee;

import lee.sub.Apple;
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

public class HelloTest
{
	public static void main(String[] args)
	{
		var h = new Hello();
		// 使用类全名的写法
		var a = new lee.sub.Apple();
		// 如果使用import语句来导入Apple类后，就可以不再使用类全名
		var aa = new Apple();
	}
}

