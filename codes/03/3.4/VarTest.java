

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks
 * @version 6.0
 */
public class VarTest
{
	public static void main(String[] args)
	{
		var a = 20;  // 被赋的值为20，因此a的类型是int
		System.out.println(a);
//		a = 1.6; // 这行代码会报错：不兼容的类型
		var b = 3.4; // 被赋的值为3.4，因此b的类型是double
		System.out.println(b);
		var c = (byte) 13; // 被赋值为 (byte) 13，因此c的类型是byte
		System.out.println(c);
//		c = a; // 这行代码会报错：不兼容的类型
//		var d; // 这行代码报错：无法推断局部变量 d 的类型

		var st = "Hello"; // 被赋值为"Hello"，因此st的类型是String
//		st = 5; // 这行代码会报错：不兼容的类型
	}
}
