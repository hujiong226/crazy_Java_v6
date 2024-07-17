

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
public class NewSwitchTest
{
	public static void main(String[] args)
	{
		// 声明变量score，并为其赋值为'C'
		var score = 'C';
		// 执行swicth分支语句
		switch (score)
		{
			// case后的代码块有多条语句，不能省略花括号
			case 'A', 'B' -> {
				System.out.println("成绩还不错，希望继续保持");
				System.out.println("后续给你颁发奖状");
			}
			// case后的代码块只有一条语句，省略花括号
			case 'C', 'D', 'F' -> System.out.println("成绩不足，还需努力！");
			default -> System.out.println("成绩输入错误");
		}
	}
}
