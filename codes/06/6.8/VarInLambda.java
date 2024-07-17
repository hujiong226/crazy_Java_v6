

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks
 * @version 1.0
 */

@interface NotNull{}
interface Predator
{
	void prey(@NotNull String animal);
}
public class VarInLambda
{
	public static void main(String[] args)
	{
		// 使用Lambda表达式对var变量赋值
		// 必须显式指定Lambda表达式的目标类型
		var run = (Runnable) () -> {
			for (var i = 0; i < 100; i++)
			{
				System.out.println();
			}
		};
		// 使用var声明Lambda表达式的形参类型，
		// 这样即可为Lambda表达式的形参添加@NotNull注解
		Predator predator = (@NotNull var animal) -> {
			System.out.println("老鹰正在猎捕" + animal);
		};
		predator.prey("兔子");
	}
}
