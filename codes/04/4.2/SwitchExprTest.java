

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
public class SwitchExprTest
{
	public static void main(String[] args)
	{
		// 声明变量score，并为其赋值为'C'
		var score = 'C';
		// 将switch表达式的值赋值给变量
		var judge = switch (score)
		{
			// case后的箭头后是一个表达式
			case 'A', 'B' -> "成绩还不错，希望继续保持";
			case 'C', 'D', 'F' -> "成绩不足，还需努力！";
			default -> "成绩输入错误";
		};
		System.out.println(judge);

		var judge2 = switch (score)
		{
			// case后的代码块有多条语句，使用yield返回值
			case 'A', 'B' -> {
				System.out.println("成绩还不错，希望继续保持");
				yield "优良";
			}
			// case后的代码块有多条语句，使用yield返回值
			case 'C', 'D', 'F' -> {
				System.out.println("成绩不足，还需努力！");
				yield "不足";
			}
			default -> "成绩输入错误";
		};
		System.out.println(judge2);

		var judge3 = switch (score)
		{
			// case后的代码块有多条语句，使用yield返回值
			case 'A', 'B':
				System.out.println("成绩还不错，希望继续保持");
				yield "优良";
			// 传统case后即使只有一条语句，也需要使用yield返回值
			case 'C', 'D', 'F':
				yield "不足";
			default:
				yield "成绩输入错误";
		};
		System.out.println(judge3);
	}
}
