
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
// 定义Shape密封类，省略permits子句
public sealed class Shape
{
	// 定义Shape的子类
	public final class Triangle extends Shape {}
}
// 定义Shape的子类
final class Rectangle extends Shape {}
