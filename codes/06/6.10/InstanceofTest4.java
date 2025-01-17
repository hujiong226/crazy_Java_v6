
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
interface Foo {}
sealed class Bar {} // 该类并未实现Foo接口
final class Baz extends Bar {}
sealed class Qux extends Bar {}
non-sealed class FooBar extends Qux {}
public class InstanceofTest4
{
	public void test(Bar b)
	{
		if (b instanceof Foo f)
		{
			System.out.println(b + "是Foo类型，可转换为" + f);
		}
	}
}