
import java.util.Optional;
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
public class OptionalTest
{
	public static void main(String[] args)
	{
		test("fkjava");
		System.out.println("-------");
		test(null);
	}
	public static void test(String st)
	{
		var op = Optional.ofNullable(st);
		// 当被包装的变量不为null时才执行Lambda表达式
		op.ifPresent(s -> System.out.println(s.length()));
		// 当被包装的变量不为null时执行第1个Lambda表达式
		// 否则执行第2个Lambda表达式
		op.ifPresentOrElse(s -> System.out.println(s.length()),
			() -> System.out.println("为空"));
		// 如果被包装的变量不为null，返回被包装的变量；否则返回默认值
		System.out.println(op.orElse("默认值"));
		// 如果被包装的变量不为null，则返回true
		System.out.println(op.isPresent());
		// 如果被包装的变量为null，则返回true
		System.out.println(op.isEmpty());
	}
}